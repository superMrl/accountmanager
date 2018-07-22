package com.account.mapper;

import com.account.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 根据用户名和密码查询用户
     * @param name
     * @param password
     * @return
     */
    @Select("select * from user_info where 1=1 and name = #{name} and password = #{password}")
    User selectUser(@Param("name") String name,@Param("password") String password);
}