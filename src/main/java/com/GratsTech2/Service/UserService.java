package com.GratsTech2.Service;


import java.util.List;
import java.util.Optional;

import com.GratsTech2.Entity.Users;

public interface UserService {
	
	public Users create(Users users);
	
	public Users show(int id);
	
	public Optional<Users> deleted(int id);
	
	public Users updated (Users users , int id);
	
	public  List<Users> allgetData();

}
