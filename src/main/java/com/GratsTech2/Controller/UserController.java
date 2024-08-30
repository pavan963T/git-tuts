package com.GratsTech2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GratsTech2.Entity.Users;
import com.GratsTech2.Service.UserService;

@RestController
@RequestMapping("/mapped")
public class UserController {
	
	@Autowired
	private UserService service;
	
	UserController(UserService service){
		this.service = service;
	}
		@PostMapping("/post")
		public ResponseEntity<Users> create(@RequestBody Users user){
			return new ResponseEntity<>(service.create(user),HttpStatus.CREATED);
		}
		
		@GetMapping("/get/{id}")
		public Users show (@PathVariable int id){
			return service.show(id);
		}
		
		@DeleteMapping("/delete/{id}")
		public void deleted(@PathVariable int id) {
			service.deleted(id);
			System.out.println("Deleted");
		}
		
		@PutMapping("/update/{id}")
		public Users update (@RequestBody Users user , @PathVariable int id) {
			return service.updated(user , id);
		}
		
		@GetMapping("/getall")
		public List<Users> allGetData() {
			return service.allgetData();
		}
		
		
		
}

