package org.allitov.review.service;

import lombok.RequiredArgsConstructor;
import org.allitov.review.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;
}
