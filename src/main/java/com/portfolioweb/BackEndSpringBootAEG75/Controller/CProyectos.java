/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.BackEndSpringBootAEG75.Controller;

import com.portfolioweb.BackEndSpringBootAEG75.Dto.DtoProyectos;
import com.portfolioweb.BackEndSpringBootAEG75.Entity.Proyectos;
import com.portfolioweb.BackEndSpringBootAEG75.Security.Controller.Mensaje;
import com.portfolioweb.BackEndSpringBootAEG75.Service.SProyectos;
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
@RequestMapping("/proyectos")
/*@CrossOrigin(origins = "http://localhost:4200")*/
@CrossOrigin(origins = "https://frontendangularaeg75.web.app")
public class CProyectos {
    @Autowired
    SProyectos servProy;
    
    
    @GetMapping("/lista")
    public ResponseEntity<List<Proyectos>> list(){
        List<Proyectos> list = servProy.list();
        return new ResponseEntity(list, HttpStatus.OK);   
    }
    
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyectos> getById(@PathVariable("id") int id){
        if(!servProy.existsById(id)){
            return new ResponseEntity(new Mensaje ("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        Proyectos proyectos = servProy.getOne(id).get();
        return new ResponseEntity(proyectos, HttpStatus.OK);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!servProy.existsById(id)){
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        }
        servProy.delete(id);
        return new ResponseEntity(new Mensaje ("Proyecto Eliminado"), HttpStatus.OK);
    }
    
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoProyectos dtoproy){
        if (StringUtils.isBlank(dtoproy.getNameProject())) {
            return new ResponseEntity(new Mensaje ("Campo obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (servProy.existsByNameProject(dtoproy.getNameProject())){
            return new ResponseEntity(new Mensaje("Este Proyecto ya existe"), HttpStatus.BAD_REQUEST);
        }
        
        Proyectos proyectos = new Proyectos(dtoproy.getNameProject(),dtoproy.getNamePjB(),dtoproy.getNamePjC(), dtoproy.getNamePjD(), dtoproy.getImgProjectA(), dtoproy.getImgProjectB(), dtoproy.getImgProjectC(), dtoproy.getImgProjectD(), dtoproy.getDateProjectA(), dtoproy.getDateProjectB(), dtoproy.getDateProjectC(), dtoproy.getDateProjectD(), dtoproy.getLinkProjectA(), dtoproy.getLinkProjectB(), dtoproy.getLinkProjectC(), dtoproy.getLinkProjectD(), dtoproy.getDescriptionProjectA(), dtoproy.getDescriptionProjectB(), dtoproy.getDescriptionProjectC(), dtoproy.getDescriptionProjectD());
        servProy.save(proyectos);
        return new ResponseEntity(new Mensaje("Proyecto Creado"), HttpStatus.OK);
    }
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoProyectos dtoproy){
        //Validamos si existe el ID
        if (!servProy.existsById(id)){
            return new ResponseEntity(new Mensaje("El ID no existe"),HttpStatus.NOT_FOUND);
        }
        //Compara Proyecto si se repite
        if(servProy.existsByNameProject(dtoproy.getNameProject()) && servProy.getByNameProject(dtoproy.getNameProject()).get().getId() !=id){
            return new ResponseEntity(new Mensaje("Proyecto existente"), HttpStatus.BAD_REQUEST);
        }
        //No puede estar vacio
        if(StringUtils.isBlank(dtoproy.getNameProject())){
            return new ResponseEntity(new Mensaje("Este campo es obligatorio"),HttpStatus.BAD_REQUEST);
        }
        Proyectos proyectos = servProy.getOne(id).get();
        proyectos.setNameProject(dtoproy.getNameProject());
        proyectos.setNamePjB(dtoproy.getNamePjB());
        proyectos.setNamePjC(dtoproy.getNamePjC());
        proyectos.setNamePjD(dtoproy.getNamePjD());
        proyectos.setImgProjectA(dtoproy.getImgProjectA());
        proyectos.setImgProjectB(dtoproy.getImgProjectB());
        proyectos.setImgProjectC(dtoproy.getImgProjectC());
        proyectos.setImgProjectD(dtoproy.getImgProjectD());
        proyectos.setDateProjectA(dtoproy.getDateProjectA());
        proyectos.setDateProjectB(dtoproy.getDateProjectB());
        proyectos.setDateProjectC(dtoproy.getDateProjectC());
        proyectos.setDateProjectD(dtoproy.getDateProjectD());
        proyectos.setLinkProjectA(dtoproy.getLinkProjectA());
        proyectos.setLinkProjectB(dtoproy.getLinkProjectB());
        proyectos.setLinkProjectC(dtoproy.getLinkProjectC());
        proyectos.setLinkProjectD(dtoproy.getLinkProjectD());
        proyectos.setDescriptionProjectA(dtoproy.getDescriptionProjectA());
        proyectos.setDescriptionProjectB(dtoproy.getDescriptionProjectB());
        proyectos.setDescriptionProjectC(dtoproy.getDescriptionProjectC());
        proyectos.setDescriptionProjectD(dtoproy.getDescriptionProjectD());
        
        servProy.save(proyectos);
        return new ResponseEntity(new Mensaje ("se actualizó correctamente este Proyecto"), HttpStatus.OK);    
    }
 
}
