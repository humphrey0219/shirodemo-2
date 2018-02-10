package info.linianjun.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class Role {
	
	private Integer rid;
	private String rname;
	private Set<Permission> permissions = new HashSet<Permission>();
	private Set<User> users = new HashSet<User>();

}
