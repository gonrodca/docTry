package com.doctry.doctrydemo.Packages.Servicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctry.doctrydemo.Packages.Entidades.Usuario;
import com.doctry.doctrydemo.Packages.Repositorios.RepositorioUsuario;

/**
 * ServicioUsuario
 */

 @Service
public class ServicioUsuario {

    @Autowired
    private RepositorioUsuario userRepository;

    public List<Usuario> getAll(){
        return userRepository.findAll();
    }

    public Usuario getUsuarioById(int id){
        return userRepository.findById(id).orElse(null);
    }

    public Usuario save(Usuario user){
        
        return userRepository.save(user);
    }
}