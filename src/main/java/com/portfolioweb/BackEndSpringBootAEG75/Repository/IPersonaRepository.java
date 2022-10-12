package com.portfolioweb.BackEndSpringBootAEG75.Repository;

import com.portfolioweb.BackEndSpringBootAEG75.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer> {
    
}
