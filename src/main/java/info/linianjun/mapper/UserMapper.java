package info.linianjun.mapper;

import org.apache.ibatis.annotations.Param;

import info.linianjun.model.User;

public interface UserMapper {
	public User findbyUsername(@Param("username") String username);
}
