package com.grupo2.proyecto_youtube.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.grupo2.proyecto_youtube.models.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class usuarioDaoImp implements usuarioDao {

    @PersistenceContext
    private EntityManager entityManager;
    

    @Override
    public List<Usuario> getusuario() {
        String query = "FROM usuario";
        List<Usuario> resultado = entityManager.createQuery(query).getResultList();
        return resultado; 
    }
    
}
