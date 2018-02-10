package info.linianjun.service;

import info.linianjun.model.User;

public interface UserService {
	public User findByUsername(String username);
}
