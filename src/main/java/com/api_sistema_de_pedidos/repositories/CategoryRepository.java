package com.api_sistema_de_pedidos.repositories;

import com.api_sistema_de_pedidos.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}