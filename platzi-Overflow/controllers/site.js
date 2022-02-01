"use strict";

function home(req, h) {
  return h.view("index", {
    title: "home",
  });
}

function register(req, h) {
  return h.view("register", {
    title: "Registro",
  });
}

function login(req, h) {
  return h.view("login", {
    title: "Ingrese",
  });
}

module.exports = {
  home: home,
  login: login,
  register: register,
};
