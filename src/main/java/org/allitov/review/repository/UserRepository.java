package org.allitov.review.repository;

import org.allitov.review.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<User, Long> {
}
