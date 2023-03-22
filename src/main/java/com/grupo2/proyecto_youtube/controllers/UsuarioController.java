package com.grupo2.proyecto_youtube.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.proyecto_youtube.models.Usuario;

@RestController
public class UsuarioController {
    
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        var usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Camilo");
        usuario.setApellido("Gomez");
        usuario.setTelefono("3012844505");
        usuario.setEmail("juank@gmail.com");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        var usuario = new Usuario();
        usuario.setId(55l);
        usuario.setNombre("Camilo");
        usuario.setApellido("Gomez");
        usuario.setTelefono("3012844505");
        usuario.setEmail("juank@gmail.com");

        var usuario2 = new Usuario();
        usuario2.setId(78485l);
        usuario2.setNombre("Maria");
        usuario2.setApellido("Jimenez");
        usuario2.setTelefono("30177824405");
        usuario2.setEmail("jufrfr7@gmail.com");
        

        var usuario3 = new Usuario();
        usuario3.setId(777l);
        usuario3.setNombre("Carlos");
        usuario3.setApellido("Martinez");
        usuario3.setTelefono("3012858465");
        usuario3.setEmail("carlos4277k@gmail.com");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }
    
    @RequestMapping(value = "usuario12")
    public Usuario editar() {
        var usuario = new Usuario();
        usuario.setNombre("Camilo");
        usuario.setApellido("Gomez");
        usuario.setTelefono("3012844505");
        usuario.setEmail("juank@gmail.com");
        return usuario;
    } 

    @RequestMapping(value = "usuario123")
    public Usuario eliminar() {
        var usuario = new Usuario();
        usuario.setNombre("Camilo");
        usuario.setApellido("Gomez");
        usuario.setTelefono("3012844505");
        usuario.setEmail("juank@gmail.com");
        return usuario;
    } 


    @RequestMapping(value = "usuario1234")
    public Usuario buscar() {
        var usuario = new Usuario();
        usuario.setNombre("Camilo");
        usuario.setApellido("Gomez");
        usuario.setTelefono("3012844505");
        usuario.setEmail("juank@gmail.com");
        return usuario;
    } 

}
