package com.zhning.cloud.Mapper;

import com.zhning.cloud.Model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user(username,password,isvip) VALUES(#{username},#{password},#{isvip})")
    public void createUser(User user) throws Exception;

    @Select("SELECT user.username FROM user WHERE username=#{username} AND password=#{password}")
    public String checkUser(User user) throws Exception;

    @Select("SELECT user.id FROM user WHERE username=#{username}")
    public Integer findUser(String username) throws Exception;

    @Select("SELECT isvip FROM user WHERE username=#{value}")
    public Integer isVip(String user_name)throws Exception;
}
