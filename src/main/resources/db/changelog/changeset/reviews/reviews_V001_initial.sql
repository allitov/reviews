create table reviews
(
    id           BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    score        INT    NOT NULL,
    reviewer_id  BIGINT NOT NULL,
    article_id   BIGINT NOT NULL,
    completed_at DATE   NOT NULL,

    CONSTRAINT fk_article_id FOREIGN KEY (article_id) REFERENCES articles (id),
    CONSTRAINT fk_reviewer_id FOREIGN KEY (reviewer_id) REFERENCES users (id)
);
