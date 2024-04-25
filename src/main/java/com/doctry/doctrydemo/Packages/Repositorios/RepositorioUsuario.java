package com.doctry.doctrydemo.Packages.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctry.doctrydemo.Packages.Entidades.Usuario;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Integer> {

    
}
    

