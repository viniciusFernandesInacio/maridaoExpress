package com.dev2.maridaoExpress.repositories;

import com.dev2.maridaoExpress.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
