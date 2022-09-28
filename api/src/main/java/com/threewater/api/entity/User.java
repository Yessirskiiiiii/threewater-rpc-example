package com.threewater.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author: ThreeWater
 * @Date: 2022/09/28/16:46
 * @Description: 用户类
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = 7873601331542373453L;

    private Long id;

    private String name;

    private Integer age;

    private String email;

}
