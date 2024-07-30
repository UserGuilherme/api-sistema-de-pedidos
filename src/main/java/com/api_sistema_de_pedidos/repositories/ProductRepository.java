package com.api_sistema_de_pedidos.repositories;

import com.api_sistema_de_pedidos.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

