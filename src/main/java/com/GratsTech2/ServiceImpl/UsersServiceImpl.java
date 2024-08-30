package com.GratsTech2.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GratsTech2.Entity.Users;
import com.GratsTech2.Repository.UserRepository;
import com.GratsTech2.Service.UserService;

@Service
public class UsersServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	
	@Override
	public Users create(Users users) {
		Users obj = userRepo.save(users);
		return obj;
	}


	@Override
	public Users updated(Users users, int id) {
		Optional<Users> obj = userRepo.findById(id);
		if(obj.isPresent()) {
			Users x = obj.get();
			x.setName(users.getName());
			x.setEmail(users.getEmail());
			userRepo.save(x);
			return x;
		}
		else {
			throw new RuntimeException ("not Found");
		}
	}

	@Override
//	public Users deleted(int id) {
//		Optional<Users> x = userRepo.findById(id);
//		if(x.isPresent()) {
//			userRepo.deleteById(id);
//			System.out.println("User deleted");
//		}
//		else {
//			System.out.println("Id not found");
//		}
	
	public Optional<Users> deleted(int id) {
	    Optional<Users> user = userRepo.findById(id);  // Find the user directly (assuming findById returns null if not found)
	    
	    if (user.isPresent()) {
	        userRepo.deleteById(id);  // Delete the user by ID
	        return user;              // Return the deleted user
	    } else {
	        return null;  // Return null if user with the given ID doesn't exist
	    }
	}
	
	@Override
	public List<Users> allgetData() {
		return userRepo.findAll();
		
	}

	@Override
	public Users show(int id) {
//	    Optional<Users> all = userRepo.findById(id);
//	    if (all.isPresent()) {
//	        return all.get();  // Return the user if present
//	    } else {
//	        throw new RuntimeException("Id not found");
//	    }
	   return userRepo.findById(id).orElse(null);
	}
	
	
}
