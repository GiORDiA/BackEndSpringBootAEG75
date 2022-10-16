/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.BackEndSpringBootAEG75.Service;

import com.portfolioweb.BackEndSpringBootAEG75.Entity.About;
import com.portfolioweb.BackEndSpringBootAEG75.Repository.RAbout;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SAbout {
    @Autowired
    RAbout rAbout;
    
    public List<About> list(){
        return rAbout.findAll();
    }
    
    public Optional<About> getOne (int id){
        return rAbout.findById(id);
    
    }
    
    public Optional<About> getByAbout(String about){
        return rAbout.findByAbout(about);
    
    }
    
    public void save(About about){
        rAbout.save(about);
    
    }
    
    public void delete(int id){
        rAbout.deleteById(id);    
    }
    
    public boolean existsById(int id){
        return rAbout.existsById(id);
    }
    
    public boolean existsByAbout(String about){
        return rAbout.existsByAbout(about);
    }
    
}
