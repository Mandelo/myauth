package com.luoxiao.api.controller;

import com.luoxiao.api.component.LoginUserHolder;
import com.luoxiao.api.domain.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: luox
 * @date： 2021/7/22
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private LoginUserHolder loginUserHolder;

    @GetMapping("/currentUser")
    public UserDTO currentUser() {
        return loginUserHolder.getCurrentUser();
    }


}
