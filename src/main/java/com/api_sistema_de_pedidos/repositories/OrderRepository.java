package com.api_sistema_de_pedidos.repositories;

import com.api_sistema_de_pedidos.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
