package com.qfedu.shiroDemo.dao;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@MapperScan
public interface PermissionDAO {
    Set<String> queryPermissionByUserName(@Param("userName") String userName);
}
