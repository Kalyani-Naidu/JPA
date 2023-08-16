package com.jpa.example;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.example.dao.UserRepository;
import com.jpa.example.entities.User;

@SpringBootApplication
public class JpaSampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaSampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		User user1 = new User();
//		user1.setName("Nayani Pavani");
//		user1.setCity("Kolkata");
//		user1.setStatus("I am Java Developer");
//		
//		User user2 = new User();
//		user2.setName("Nidhi Agarwal");
//		user2.setCity("Delhi");
//		user2.setStatus("I am Python Developer");
		
//		Save Single User
//		User userOne = userRepository.save(user1);
//		User userTwo = userRepository.save(user2);
//		System.out.println(userOne);
//		System.out.println(userTwo);
		
//		Saves Multiple Users		
//		List<User> users = List.of(user1,user2);
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
//		

		
		//Update Record
//		Optional<User> optional=userRepository.findById(52);
//		User user = optional.get();
//		user.setName("Divika Naidu");
//		User user1=userRepository.save(user);
//		System.out.println(user1);
		
		//Fetch Data
//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while(iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}
		
		//Deleting the records
		//userRepository.deleteById(102);
		
		System.out.println("Done!!!");	
		
	}

	

}
