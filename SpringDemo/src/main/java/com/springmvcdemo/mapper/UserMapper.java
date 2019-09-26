package com.springmvcdemo.mapper;

import com.springmvcdemo.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User findById(@Param("userId") int userId);
}
