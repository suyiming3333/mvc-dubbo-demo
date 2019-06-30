package com.sym.dao;


import com.sym.entity.User;


public interface UserMapper {
    //class mapper查询
//    @Select("SELECT * FROM user WHERE id = #{id}") //屏蔽这里或者是屏蔽mapper.xml
    User selectUser(int id);

    int addUser(User users);
}
