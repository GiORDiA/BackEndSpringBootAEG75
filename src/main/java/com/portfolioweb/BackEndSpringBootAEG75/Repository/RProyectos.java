/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.BackEndSpringBootAEG75.Repository;

import com.portfolioweb.BackEndSpringBootAEG75.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RProyectos extends JpaRepository<Proyectos, Integer>{
    public Optional <Proyectos> findByNameProject(String nameProject);
    public Boolean existsByNameProject(String nameProject);
}
