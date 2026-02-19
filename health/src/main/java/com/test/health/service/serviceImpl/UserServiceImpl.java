package com.test.health.service.serviceImpl;

import com.test.health.entiyty.UserEntity;
import com.test.health.repository.UserRepository;
import com.test.health.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(UserEntity user) {
        userRepository.save(user);
    }
}
