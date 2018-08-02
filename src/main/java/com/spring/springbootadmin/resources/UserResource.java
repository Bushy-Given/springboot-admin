package com.spring.springbootadmin.resources;

import com.spring.springbootadmin.entities.UserEntity;
import com.spring.springbootadmin.services.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(UserResource.BASE_URL)
public class UserResource {
    public static final String BASE_URL="api/users";
    Logger log = LoggerFactory.getLogger(UserResource.class);

    private UserServiceImpl userService ;
    @Autowired
    public UserResource(UserServiceImpl userService){
        this.userService = userService;
    }

    @GetMapping
    public Iterable<UserEntity> getAllUsers(){
        log.info("fetching all users from db {}",userService.getAllUsers());
        return userService.getAllUsers();
    }
    @GetMapping("user/{id}")
    public Optional<UserEntity> findOneUser(@PathVariable Integer id){
        log.info("fetching user with id {}",id);
        return  userService.findOneUser(id);
    }
    @PostMapping
    public Iterable<UserEntity> saveAllUsers(@RequestBody Iterable
                                              <UserEntity> users){
        log.info("saving users  to DB {}",users);
        return  userService.saveAllUsers(users);
    }
    @PostMapping("user")
    public UserEntity saveOneUser(@RequestBody UserEntity user){
        log.info("saving one user to DB {}",user);
        return  userService.saveOneUser(user);
    }
    @PutMapping("user/{id}")
    public UserEntity updateUser(@RequestBody UserEntity user ,
                                 @PathVariable Integer id){
        user.setUserId(id);
        log.info("updating user with id {}",id);
        return  userService.updateUser(user);
    }
    @GetMapping("count")
    public Long countAllUsers(){
        log.info("counting number of users in DB");
        return userService.countAllUsers();
    }
    @DeleteMapping("user/{id}")
    public  void deleteUserById(@PathVariable Integer id){
        log.info("deleting user of id {}",id);
        userService.deleteUserById(id);
    }
}
