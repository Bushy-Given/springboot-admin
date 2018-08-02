package com.spring.springbootadmin.services;

import com.spring.springbootadmin.entities.UserEntity;

import java.util.Optional;

public interface  UserService {

    Iterable<UserEntity> getAllUsers();

    Optional<UserEntity> findOneUser(Integer id);

    Iterable<UserEntity> saveAllUsers(Iterable<UserEntity> users);

    UserEntity saveOneUser(UserEntity user);

    UserEntity updateUser(UserEntity user);

    Long countAllUsers();

    void deleteUserById(Integer id);

    void deleteAllUsers();

}
