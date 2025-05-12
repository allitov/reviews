create table if not exists articles
(
    id          BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    title       VARCHAR(100) NOT NULL,
    author_id   BIGINT       NOT NULL,
    content     TEXT         NOT NULL,
    category_id BIGINT       NOT NULL,

    CONSTRAINT fk_user_id FOREIGN KEY (author_id) REFERENCES users (id),
    CONSTRAINT fk_category_id FOREIGN KEY (category_id) REFERENCES categories (id)
);
