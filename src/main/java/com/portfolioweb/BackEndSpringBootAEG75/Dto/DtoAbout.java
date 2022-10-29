/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.BackEndSpringBootAEG75.Dto;

import javax.validation.constraints.NotBlank;


public class DtoAbout {
    @NotBlank
    private String about;
    @NotBlank
    private String imgPerfil;
    @NotBlank
    private String imgAuthor;
    @NotBlank
    private String nombreCompleto;
    @NotBlank
    private String profesion;
    private String descripcion;
    private String cv;
    
    //Constructores

    public DtoAbout() {
    }

    public DtoAbout(String about, String imgPerfil, String imgAuthor, String nombreCompleto, String profesion, String descripcion, String cv) {
        this.about = about;
        this.imgPerfil = imgPerfil;
        this.imgAuthor = imgAuthor;
        this.nombreCompleto = nombreCompleto;
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.cv = cv;
    }
    
    //Getters & Setters

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(String imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public String getImgAuthor() {
        return imgAuthor;
    }

    public void setImgAuthor(String imgAuthor) {
        this.imgAuthor = imgAuthor;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
    
}
