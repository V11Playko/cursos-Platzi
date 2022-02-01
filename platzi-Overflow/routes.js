"use strict";

const Joi = require("joi");
const site = require("./controllers/site");
const user = require("./controllers/user");

module.exports = [
  {
    method: "GET",
    path: "/",
    handler: site.home,
  },
  {
    method: "GET",
    path: "/register",
    handler: site.register,
  },
  {
    path: "/create-user",
    method: "POST",
    options: {
      validate: {
        payload: {
          name: Joi.string().required().min(3),
          email: Joi.string().email().required(),
          password: Joi.string().required().min(6),
        },
        failAction: user.failValidation,
      },
    },
    handler: user.createUser,
  },
  {
    method: "GET",
    path: "/login",
    handler: site.login,
  },
  {
    method: "GET",
    path: "/logout",
    handler: user.logout,
  },
  {
    path: "/validate-user",
    method: "POST",
    options: {
      validate: {
        payload: {
          email: Joi.string().email().required(),
          password: Joi.string().required().min(6),
        },
        failAction: user.failValidation,
      },
    },
    handler: user.validateUser,
  },
  {
    method: "GET",
    path: "/{param*}",
    handler: {
      directory: {
        path: ".",
        index: ["index.html"],
      },
    },
  },
];
