const jwt = require('jsonwebtoken');
const SECRET = '#%$$&CUALQUIERVAINA';

const JWTIssuer = (payload, expiresIn) => {
    return jwt.sign(payload, SECRET, {expiresIn});
};

const JWTVerify = (token) => {
    return jwt.verify(token, SECRET);
};

module.exports(
    JWTIssuer,
    JWTVerify,
);
