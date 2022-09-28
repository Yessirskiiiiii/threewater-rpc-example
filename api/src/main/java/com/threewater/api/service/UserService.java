package com.threewater.api.service;

import com.threewater.api.entity.Result;
import com.threewater.api.entity.User;

/**
 * @Author: ThreeWater
 * @Date: 2022/09/28/17:09
 * @Description: Service 接口
 */
public interface UserService {

    Result<User> selectUserById(Long id);

}
