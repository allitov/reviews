package org.allitov.review.service;

import lombok.RequiredArgsConstructor;
import org.allitov.review.repository.ArticleRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;
}
