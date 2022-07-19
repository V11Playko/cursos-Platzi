"use strict";

class Questions {
  constructor(db) {
    this.db = db;
    this.ref = this.db.ref("/");
    this.collection = this.ref.child("questions");
  }

  async create(info, user, filename) {
    const data = {
      description: info.description,
      title: info.title,
      owner: user,
    };

    if (filename) {
      data.filename = filename;
    }

    const question = this.collection.push();
    question.set(data);

    return question.key;
  }

  async getLast(amount) {
    const query = await this.collection.limitToLast(amount).once("value");
    const data = query.val();
    return data;
  }

  async getOne(id) {
    const query = await this.collection.child(id).once("value");
    const data = query.val();
    return data;
  }

  async answer(data, user) {
    const answers = await this.collection
      .child(data.id)
      .child("answers")
      .push();
    answers.set({ text: data.answer, user: user });
    return answers;
  }

  async setAnswerRight(questionId, answerId, user) {
    const query = await this.collection.child(questionId).once("value");
    const question = query.val();
    const answers = question.answers;

    if (!user.email === question.owner.email) {
      return false;
    }

    for (let key in answers) {
      answers[key].correct = key === answerId;
    }

    const update = await this.collection
      .child(questionId)
      .child("answers")
      .update(answers);
    return update;
  }
}

module.exports = Questions;
