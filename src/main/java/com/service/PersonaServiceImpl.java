package com.service;

import com.dao.PersonaDao;
import com.model.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class PersonaServiceImpl implements PersonaService{

    @Inject
    PersonaDao personaDao;
    
    @Override
    public List<Persona> findAll() {
        return personaDao.findAllPerson();
    }

    @Override
    public Persona findAllById(Persona persona) {
        return personaDao.findById(persona);
    }

    @Override
    public void insert(Persona persona) {
        personaDao.inserPerson(persona);
    }

    @Override
    public void update(Persona persona) {
        personaDao.updatePersona(persona);
    }

    @Override
    public void delete(Persona persona) {
        personaDao.deletePersona(persona);
    }
    
}
