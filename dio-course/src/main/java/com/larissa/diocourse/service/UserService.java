package com.larissa.diocourse.service;

import com.larissa.diocourse.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User user);
}
