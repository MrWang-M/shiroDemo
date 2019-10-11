package com.qfedu.shiroDemo.dao;

import com.qfedu.shiroDemo.pojos.User;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@MapperScan
@Repository
public interface UserDAO {
    User queryUserByName(@Param("username") String username);
}
