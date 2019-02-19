package com.example.FirebaseDemo.service.impl;

import com.example.FirebaseDemo.entity.Signup;
import com.example.FirebaseDemo.repository.SignupRepository;
import com.example.FirebaseDemo.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class SignupServiceImpl implements SignupService {

    @Autowired
    private SignupRepository signupRepository;

    public Signup addUser(Signup signup)
    {
        return signupRepository.save(signup);
    }

    public Signup showUser(String signupId)
    {
        return signupRepository.findOne(signupId);
    }

}