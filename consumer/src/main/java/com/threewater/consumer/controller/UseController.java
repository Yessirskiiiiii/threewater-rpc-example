package com.threewater.consumer.controller;

import com.threewater.api.entity.Result;
import com.threewater.api.entity.User;
import com.threewater.api.service.UserService;
import com.threewater.rpc.annotation.InjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ThreeWater
 * @Date: 2022/09/28/17:44
 * @Description: Controller 类
 */
@RestController
@RequestMapping("rpc")
public class UseController {

    @InjectService
    private UserService userService;

    @GetMapping("/user/{id}")
    public Result<User> getUserById(@PathVariable Long id) {
        return userService.selectUserById(id);
    }

}
