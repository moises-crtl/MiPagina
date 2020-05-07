package com.dao;

import com.model.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class PersonaDaoImpl implements PersonaDao{

    @PersistenceContext(unitName = "SgaPU")
    EntityManager entityManager;
    
    @Override
    public List<Persona> findAllPerson() {
        return entityManager.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findById(Persona persona) {
        return entityManager.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public void inserPerson(Persona persona) {
        entityManager.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        entityManager.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        entityManager.remove(entityManager.merge(persona));
    }
    
}
