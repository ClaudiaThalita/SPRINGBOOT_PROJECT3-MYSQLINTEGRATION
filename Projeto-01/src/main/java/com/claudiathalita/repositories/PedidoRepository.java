package com.claudiathalita.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claudiathalita.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Integer> {

}
