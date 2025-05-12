create table if not exists categories
(
    id   BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    name VARCHAR(50) NOT NULL
);
