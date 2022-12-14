package com.portfolioweb.BackEndSpringBootAEG75.Interface;

import com.portfolioweb.BackEndSpringBootAEG75.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer lista de Personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario pero lo buscamos por ID
    public void deletePersona(int id);
    
    //Buscar una persona por ID
    public Persona findPersona(int id);   
}
