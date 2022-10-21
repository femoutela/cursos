package com.femoutela.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.femoutela.curso.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
