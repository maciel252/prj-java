package com.senai.prjjava.repository;

import org.springframework.data.repository.CrudRepository;

import com.senai.prjjava.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    
}
