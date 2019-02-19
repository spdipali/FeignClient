package com.example.FirebaseDemo.service.impl;

import com.example.FirebaseDemo.entity.Signup;
import com.example.FirebaseDemo.entity.UserDetails;
import com.example.FirebaseDemo.repository.SignupRepository;
import com.example.FirebaseDemo.repository.UserDetailRepository;
import com.example.FirebaseDemo.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class UserDetailServiceImpl implements UserDetailService{

    @Autowired
    private UserDetailRepository userDetailRepository;

    @Override
    public UserDetails addUserDetails(UserDetails userDetails) {
        return userDetailRepository.save(userDetails);
    }

    @Override
    public UserDetails showUserDetails(String signupId) {
        return userDetailRepository.findOne(signupId);
    }
}
