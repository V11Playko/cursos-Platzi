"use strict";

function home(req, h) {
  return h.view("index", {
    title: "home",
    user: req.state.user,
  });
}

function register(req, h) {
  if (req.state.user) {
    return h.redirect("/");
  }

  return h.view("register", {
    title: "Registro",
    user: req.state.user,
  });
}

function login(req, h) {
  if (req.state.user) {
    return h.redirect("/");
  }

  return h.view("login", {
    title: "Ingrese",
    user: req.state.user,
  });
}

function notFound(req, h) {
  return h.view("404", {}, { layout: "error-layout" }).code(404);
}

module.exports = {
  home: home,
  login: login,
  notFound: notFound,
  register: register,
};
