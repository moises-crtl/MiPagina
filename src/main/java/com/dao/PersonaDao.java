package com.dao;

import com.model.Persona;
import java.util.List;



public interface PersonaDao {
    
    public List<Persona> findAllPerson();
    
    public Persona findById(Persona persona);
    
    public void inserPerson(Persona persona);
    
    public void updatePersona(Persona persona);
    
    public void deletePersona(Persona persona);
}
