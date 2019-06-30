package com.sym.service.impl;



import com.sym.dao.UserMapper;
import com.sym.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(int id) {
        return userMapper.selectUser(id);
    }

    public int addUser(User user) {
        int insertRow = userMapper.addUser(user);
        throw new RuntimeException("测试编程式事务回滚");
    }
}