package com.example.userService.controller;

import com.example.userService.VO.ResponseTemplateVO;
import com.example.userService.entity.User;
import com.example.userService.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser method in UserController class");
        return userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")  Long userId){
        log.info("Inside getUserWithDepartment method in UserController class");
        return userService.getUserWithDepartment(userId);
    }
}
