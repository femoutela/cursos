package com.femoutela.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.femoutela.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
