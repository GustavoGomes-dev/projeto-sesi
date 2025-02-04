package com.sesi.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.projeto.entities.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {

}
