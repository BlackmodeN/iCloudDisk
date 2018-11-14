package com.zhning.cloud.Service;

import com.zhning.cloud.Mapper.UserMapper;
import com.zhning.cloud.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserService {
	
	@Autowired
	private UserMapper dao;

	public void createUser(User user) throws Exception{
		Boolean found = findUser(user.getUsername());
		if(!found)
		   dao.createUser(user);
		else
			throw new RuntimeException();
	}
	
	public String checkUser(User user ) throws Exception{
		return dao.checkUser(user);
	}
    public int findUserID(String username) throws Exception{
        return dao.findUser(username);

    }
    public boolean findUser(String username) throws Exception{
		Integer found = dao.findUser(username);
		if(found==null || found<1)  return false;
		return true;
	}

	public int isVip(String user_name)throws Exception {
		return dao.isVip(user_name);
	}
}
