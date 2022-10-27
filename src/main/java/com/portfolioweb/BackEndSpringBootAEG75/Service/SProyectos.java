/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.BackEndSpringBootAEG75.Service;

import com.portfolioweb.BackEndSpringBootAEG75.Entity.Proyectos;
import com.portfolioweb.BackEndSpringBootAEG75.Repository.RProyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SProyectos {
    @Autowired
    RProyectos rProyectos;
    
    public List<Proyectos> list(){
        return rProyectos.findAll();
    }
    
    public Optional<Proyectos> getOne (int id){
        return rProyectos.findById(id);
    }
    
    public Optional<Proyectos> getByNameProject(String nameProject){
        return rProyectos.findByNameProject(nameProject);
    }
    
    public void save(Proyectos nameProject){
        rProyectos.save(nameProject);
    }
    
    public void delete(int id){
        rProyectos.deleteById(id);    
    }
    
    public boolean existsById(int id){
        return rProyectos.existsById(id);
    }
    
    public boolean existsByNameProject(String nameProject){
        return rProyectos.existsByNameProject(nameProject);
    }
   
}
