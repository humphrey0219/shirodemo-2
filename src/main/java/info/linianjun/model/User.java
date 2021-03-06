package info.linianjun.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class User {
	
	private Integer uid;
	private String username;
	private String password;
	private Set<Role> roles = new HashSet<Role>();

}
