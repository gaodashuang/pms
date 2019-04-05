package com.fzy.scm.service;

import com.fzy.scm.entity.dto.UserDto;
import com.fzy.scm.entity.security.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

/**
 * @program: UserService
 * @description:
 * @author: fzy
 * @date: 2019-04-05 15:23
 **/
public interface UserService extends UserDetailsService {

    /**
     * 查询当前用户信息
     * @return
     */
    Optional<UserDto> getCurrUserInfo();

    /**
     * 注册用户
     * @param user
     * @return
     */
    User registerUser(User user);

    /**
     * 锁定用户
     * @param id
     */
    void lockUser(Long id);

    /**
     * 根据用户名查询用户
     * @param Username
     * @return
     */
    Optional<User> getUserByUsername(String Username);
}