package com.example.FirebaseDemo.controller;

import com.example.FirebaseDemo.dto.SignupDTO;
import com.example.FirebaseDemo.entity.Signup;
import com.example.FirebaseDemo.entity.UserDetails;
import com.example.FirebaseDemo.service.UserDetailService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserDetailController {

    @Autowired
    private UserDetailService userDetailService;

    @PostMapping(value = "/user/detail/add")
    public UserDetails add(@RequestBody UserDetails userDetails) {

        return userDetailService.addUserDetails(userDetails);

    }

    @RequestMapping(value = "/user/detail/get",method = RequestMethod.GET)
    public UserDetails select(@RequestParam String signupId) {

        return userDetailService.showUserDetails(signupId);

    }
}
