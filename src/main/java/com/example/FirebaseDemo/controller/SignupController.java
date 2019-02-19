package com.example.FirebaseDemo.controller;


import com.example.FirebaseDemo.FirebaseDemoApplication;
import com.example.FirebaseDemo.dto.SignupDTO;
import com.example.FirebaseDemo.entity.Signup;
import com.example.FirebaseDemo.service.SignupService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class SignupController {

    @Autowired
    private SignupService signupService;

    @PostMapping(value = "/user/add")
    public Signup add(@RequestBody SignupDTO signupDTO) {
        Signup signup=new Signup();
        BeanUtils.copyProperties(signupDTO,signup);
        return signupService.addUser(signup);
    }

    @RequestMapping(value = "/user/get",method = RequestMethod.GET)
    public Signup select(@RequestParam String signupId) {
        Signup signup=signupService.showUser(signupId);
        return signup;
    }
}
