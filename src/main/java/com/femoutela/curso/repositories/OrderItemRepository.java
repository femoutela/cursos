package com.femoutela.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.femoutela.curso.entities.OrderItem;
import com.femoutela.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}