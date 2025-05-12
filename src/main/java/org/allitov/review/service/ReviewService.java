package org.allitov.review.service;

import lombok.RequiredArgsConstructor;
import org.allitov.review.repository.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;
}
