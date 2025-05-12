create table if not exists users
(
    id             BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    full_name      VARCHAR(50) NOT NULL,
    email          VARCHAR(50) NOT NULL,
    specialization VARCHAR(50),
    location       VARCHAR(50),
    bio            TEXT,
    institution    VARCHAR(50),
    field_of_exp   VARCHAR(50),
    password       VARCHAR(50) NOT NULL
);