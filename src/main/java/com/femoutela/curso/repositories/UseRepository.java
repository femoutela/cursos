package com.femoutela.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.femoutela.curso.entities.User;

public interface UseRepository extends JpaRepository<User, Long> {

}
