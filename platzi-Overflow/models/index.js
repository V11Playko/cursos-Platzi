"use strict";

const firebase = require("firebase-admin");
const serviceAccount = require("../config/firebase.json");

firebase.initializeApp({
  credential: firebase.credential.cert(serviceAccount),
  databaseURL: "https://platzi-overflow-eb9a4-default-rtdb.firebaseio.com/",
});

const db = firebase.database();

const Users = require("./users");

module.exports = {
  users: new Users(db),
};
