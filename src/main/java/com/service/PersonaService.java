package com.service;

import com.model.Persona;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PersonaService {
    
    public List<Persona> findAll();
    
    public Persona findAllById(Persona persona);
    
    public void insert(Persona persona);
    
    public void update(Persona persona);
    
    public void delete(Persona persona);
    
}
