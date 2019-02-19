package com.example.FirebaseDemo.repository;

import com.example.FirebaseDemo.entity.UserDetails;
import org.springframework.data.repository.CrudRepository;

public interface UserDetailRepository extends CrudRepository<UserDetails,String> {

}
