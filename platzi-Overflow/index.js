"use strict";
const Hapi = require("hapi");

const server = Hapi.server({
  port: process.env.PORT || 3000,
  host: "localhost",
});

async function init() {
  server.route({
    method: "GET",
    path: "/",
    handler: (req, res) => {
      return res.response(`Hola mundo ...`).code(200);
    },
  });

  server.route({
    method: "GET",
    path: "/redirect",
    handler: (req, res) => {
      return res.redirect(`http://platzi.com`);
    },
  });

  try {
    await server.start();
  } catch (error) {
    console.error(error);
    process.exit(1);
  }

  console.log(`Servidor lanzado en: ${server.info.uri}`);
}
init();
