package com.api_sistema_de_pedidos.repositories;

import com.api_sistema_de_pedidos.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
