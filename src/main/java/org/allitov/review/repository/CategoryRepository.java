package org.allitov.review.repository;

import org.allitov.review.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

interface CategoryRepository extends JpaRepository<Category, Long> {
}
