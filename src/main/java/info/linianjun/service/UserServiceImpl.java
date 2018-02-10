package info.linianjun.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import info.linianjun.mapper.UserMapper;
import info.linianjun.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	UserMapper userMapper;

	@Override
	public User findByUsername(String username) {
		return userMapper.findbyUsername(username);
//		return userMapper.findbyUsername(username);
		
	}

}
