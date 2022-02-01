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

module.exports = {
  home: home,
  register: register,
};
