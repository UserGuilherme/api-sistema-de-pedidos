package com.api_sistema_de_pedidos.repositories;

import com.api_sistema_de_pedidos.entities.OrderItem;
import com.api_sistema_de_pedidos.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
