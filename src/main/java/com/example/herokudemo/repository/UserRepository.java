package com.example.herokudemo.repository;

import com.example.herokudemo.domain.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, String> {

    Users findByUsernameEquals(String username);
}
