package org.allitov.review.service;

import lombok.RequiredArgsConstructor;
import org.allitov.review.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
}
