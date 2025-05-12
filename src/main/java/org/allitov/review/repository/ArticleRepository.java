package org.allitov.review.repository;

import org.allitov.review.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

interface ArticleRepository extends JpaRepository<Article, Long> {
}
