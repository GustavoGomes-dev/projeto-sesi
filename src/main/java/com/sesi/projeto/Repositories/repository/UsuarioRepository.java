package com.sesi.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.projeto.entities.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{

}
