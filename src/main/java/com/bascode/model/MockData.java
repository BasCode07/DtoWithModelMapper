package com.bascode.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bascode.repository.LocationRepositry;
import com.bascode.repository.UserRepository;

@Component
public class MockData implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private LocationRepositry locationRepositry;
	
	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Nigeria");
		location.setDescription("Best country on earth");
		location.setLogit(45.7);
		location.setLati(46.9);
		locationRepositry.save(location);
		
		User user = new User();
		user.setUserName("John Doe");
		user.setFirstName("John");
		user.setLastName("Doe");
		user.setLocation(location);
		user.setEmail("john@gmail.com");
		user.setPassword("john1234");
		userRepository.save(user);
		
		User user1 = new User();
		user1.setUserName("John Kunle");
		user1.setFirstName("Kunle");
		user1.setLastName("John");
		user1.setLocation(location);
		user1.setEmail("kunle@gmail.com");
		user1.setPassword("kunle1234");
		userRepository.save(user1);
		
		
		User user2 = new User();
		user2.setUserName("Femi Kunle");
		user2.setFirstName("Kunle");
		user2.setLastName("Femi");
		user2.setLocation(location);
		user2.setEmail("femi@gmail.com");
		user2.setPassword("femi1234");
		userRepository.save(user2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
