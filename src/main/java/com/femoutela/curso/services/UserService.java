package com.femoutela.curso.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.femoutela.curso.entities.User;
import com.femoutela.curso.repositories.UseRepository;

@Service
public class UserService {

	@Autowired
	private UseRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
