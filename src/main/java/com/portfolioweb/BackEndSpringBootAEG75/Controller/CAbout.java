/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.BackEndSpringBootAEG75.Controller;

import com.portfolioweb.BackEndSpringBootAEG75.Dto.DtoAbout;
import com.portfolioweb.BackEndSpringBootAEG75.Entity.About;
import com.portfolioweb.BackEndSpringBootAEG75.Security.Controller.Mensaje;
import com.portfolioweb.BackEndSpringBootAEG75.Service.SAbout;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
@CrossOrigin(origins = "http://localhost:4200")
public class CAbout {
    @Autowired
    SAbout servAbout;
    
    @GetMapping("/lista")
    public ResponseEntity<List<About>> list(){
        List<About> list = servAbout.list();
        return new ResponseEntity(list, HttpStatus.OK);   
    }
    
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<About> getById(@PathVariable("id") int id){
        if(!servAbout.existsById(id)){
            return new ResponseEntity(new Mensaje ("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        About about = servAbout.getOne(id).get();
        return new ResponseEntity(about, HttpStatus.OK);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!servAbout.existsById(id)){
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        }
        servAbout.delete(id);
        return new ResponseEntity(new Mensaje ("About Eliminado"), HttpStatus.OK);
    }
    
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoAbout dtoab){
        if (StringUtils.isBlank(dtoab.getAbout())) {
            return new ResponseEntity(new Mensaje ("Campo obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (servAbout.existsByAbout(dtoab.getAbout())){
            return new ResponseEntity(new Mensaje("Ese About ya existe"), HttpStatus.BAD_REQUEST);
        }
        
        About about = new About(dtoab.getAbout(), dtoab.getImgPerfil(), dtoab.getImgAuthor(), dtoab.getNombreCompleto(), dtoab.getProfesion(), dtoab.getDescripcion(), dtoab.getCv());
        servAbout.save(about);
        return new ResponseEntity(new Mensaje("About Creada"), HttpStatus.OK);
    }
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoAbout dtoab){
        //Validamos si existe el ID
        if (!servAbout.existsById(id)){
            return new ResponseEntity(new Mensaje("El ID no existe"),HttpStatus.NOT_FOUND);
        }
        //Compara About si se repite
        if(servAbout.existsByAbout(dtoab.getAbout()) && servAbout.getByAbout(dtoab.getAbout()).get().getId() !=id){
            return new ResponseEntity(new Mensaje("About existente"), HttpStatus.BAD_REQUEST);
        }
        //No puede estar vacio
        if(StringUtils.isBlank(dtoab.getAbout())){
            return new ResponseEntity(new Mensaje("Este campo es obligatorio"),HttpStatus.BAD_REQUEST);
        }
        About about = servAbout.getOne(id).get();
        about.setAbout(dtoab.getAbout());
        about.setImgPerfil(dtoab.getImgPerfil());
        about.setImgAuthor(dtoab.getImgAuthor());
        about.setNombreCompleto(dtoab.getNombreCompleto());
        about.setProfesion(dtoab.getProfesion());
        about.setDescripcion(dtoab.getDescripcion());
        about.setCv(dtoab.getCv());
        
        servAbout.save(about);
        return new ResponseEntity(new Mensaje ("se actualizó correctamente"), HttpStatus.OK);    
    }
    
}
