/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.BackEndSpringBootAEG75.Dto;

import javax.validation.constraints.NotBlank;


public class DtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    private String logoE;
    private String periodoAniosE;
    
    //Constructores

    public DtoEducacion() {
    }

    public DtoEducacion(String nombreE, String descripcionE, String logoE, String periodoAniosE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.logoE = logoE;
        this.periodoAniosE = periodoAniosE;
    }
    
    //Getters & Setters

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

    public String getLogoE() {
        return logoE;
    }

    public void setLogoE(String logoE) {
        this.logoE = logoE;
    }

    public String getPeriodoAniosE() {
        return periodoAniosE;
    }

    public void setPeriodoAniosE(String periodoAniosE) {
        this.periodoAniosE = periodoAniosE;
    }
    
    
}
