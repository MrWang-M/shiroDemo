package com.qfedu.shiroDemo.dao;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@MapperScan
public interface RoleDAO {
    Set<String> queryRolesByUserName(@Param("userName") String userName);
}
