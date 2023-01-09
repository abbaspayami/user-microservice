package com.egs.userservice.controller;

import com.egs.userservice.VO.ResponseTemplateVO;
import com.egs.userservice.entity.User1;
import com.egs.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/")
    public User1 saveUser(@RequestBody User1 user1) {
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user1);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }

}
