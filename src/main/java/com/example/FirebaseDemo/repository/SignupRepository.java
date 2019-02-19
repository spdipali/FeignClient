package com.example.FirebaseDemo.repository;

import com.example.FirebaseDemo.entity.Signup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignupRepository extends CrudRepository<Signup,String> {
}
