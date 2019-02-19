package com.example.FirebaseDemo.service;

import com.example.FirebaseDemo.entity.UserDetails;

public interface UserDetailService {
    UserDetails addUserDetails(UserDetails userDetails);
    UserDetails showUserDetails(String signupId);
}
