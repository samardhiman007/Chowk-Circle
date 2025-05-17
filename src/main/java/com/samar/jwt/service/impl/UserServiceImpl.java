package com.samar.jwt.service.impl;


import com.samar.jwt.co.UserCreateCO;
import com.samar.jwt.domain.AppUser;
import com.samar.jwt.repository.UserRepository;
import com.samar.jwt.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public Long createUser(UserCreateCO userCreateCO) {
        AppUser appUser = new AppUser();
        appUser.setName(userCreateCO.getName());
        appUser.setEmail(userCreateCO.getEmail());
        appUser.setUsername(userCreateCO.getUserName());
        appUser = userRepository.save(appUser);
        return appUser.getId();
    }
}
