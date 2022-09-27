/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.BackEndSpringBootAEG75.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String logoExp;
    private String periodoAniosExp;
    
    //Constructores

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String logoExp, String periodoAniosExp) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.logoExp = logoExp;
        this.periodoAniosExp = periodoAniosExp;
    }
    
    //Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getLogoExp() {
        return logoExp;
    }

    public void setLogoExp(String logoExp) {
        this.logoExp = logoExp;
    }

    public String getPeriodoAniosExp() {
        return periodoAniosExp;
    }

    public void setPeriodoAniosExp(String periodoAniosExp) {
        this.periodoAniosExp = periodoAniosExp;
    }
    
}
