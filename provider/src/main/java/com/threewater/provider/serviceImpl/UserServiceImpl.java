package com.threewater.provider.serviceImpl;

import com.threewater.api.entity.Result;
import com.threewater.api.entity.ResultCode;
import com.threewater.api.entity.User;
import com.threewater.api.service.UserService;
import com.threewater.provider.mapper.UserMapper;
import com.threewater.rpc.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: ThreeWater
 * @Date: 2022/09/28/17:40
 * @Description: Service 实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result<User> selectUserById(Long id) {
        User user = userMapper.selectById(id);
        return user == null ? Result.error(ResultCode.NOT_FOUND) : Result.success(user);
    }

}
