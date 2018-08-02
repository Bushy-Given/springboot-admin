package com.spring.springbootadmin.services.impl;

import com.spring.springbootadmin.entities.UserEntity;
import com.spring.springbootadmin.repositories.UserRepository;
import com.spring.springbootadmin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Iterable<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<UserEntity> findOneUser(Integer id){
        return  userRepository.findById(id);
    }

    public Iterable<UserEntity> saveAllUsers(Iterable<UserEntity> users){
        return  userRepository.saveAll(users);
    }

    public UserEntity saveOneUser(UserEntity user){
        return  userRepository.save(user);
    }

    public UserEntity updateUser(UserEntity user){
        return  userRepository.save(user);
    }

    public Long countAllUsers(){
        return userRepository.count();
    }

    public  void deleteUserById(Integer id){
        userRepository.deleteById(id);
    }
    public void deleteAllUsers(){
        userRepository.deleteAll();
    }
}
