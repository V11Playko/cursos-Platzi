"use strict";

const users = require("../models/index").users;

async function createUser(req, h) {
  let result;
  try {
    result = await users.create(req.payload);
  } catch (error) {
    console.error(error);
    return h.response("Problemas creando el usuario").code(500);
  }

  return h.response(`Usuario creado ID: ${result}`);
}

function logout(req, h) {
  return h.redirect("/login").unstate("user");
}

async function validateUser(req, h) {
  let result;
  try {
    result = await users.validateUser(req.payload);
    if (!result) {
      return h.response("Email y/o contraseña incorrecta").code(401);
    }
  } catch (error) {
    console.error(error);
    return h.response("Problemas validando el usuario").code(500);
  }

  return h.redirect("/").state("user", {
    name: result.name,
    email: result.email,
  });
}

module.exports = {
  createUser: createUser,
  logout: logout,
  validateUser: validateUser,
};
