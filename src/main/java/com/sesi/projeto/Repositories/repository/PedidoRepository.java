package com.sesi.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.projeto.entities.Pedido;

public interface PedidoRepository extends JpaRepository <Pedido , Long> {

}
