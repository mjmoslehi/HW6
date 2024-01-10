CREATE TABLE IF NOT EXISTS author
(
    id        INTEGER,
    firstname VARCHAR(250),
    lastname  VARCHAR(250),
    age       INTEGER,
    books     VARCHAR(250)
);

CREATE TABLE IF NOT EXISTS book
(
    id          INTEGER,
    title       VARCHAR(250),
    publishyear INTEGER,
    authorname  VARCHAR(250)
);
