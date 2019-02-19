package com.example.FirebaseDemo.service;

import com.example.FirebaseDemo.entity.Signup;

public interface SignupService {
    Signup addUser(Signup signup);
    Signup showUser(String signupId);

}
