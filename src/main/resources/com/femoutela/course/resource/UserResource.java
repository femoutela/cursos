package com.femoutela.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.femoutela.course.entities.User;

@RestController 
@RequestMapping(value = "/users")
public class UserResource {
	
         @GetMapping
         public ResponseEntity<User>findAll(){
	     User u = new User(1L, "Maria", "m@gmail.com"," 9999", "156464");
        return ResponseEntity.ok().body(u);
}
         }

