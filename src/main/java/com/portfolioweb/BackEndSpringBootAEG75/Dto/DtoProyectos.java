/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.BackEndSpringBootAEG75.Dto;

import javax.validation.constraints.NotBlank;


public class DtoProyectos {
    @NotBlank
    private String nameProject;
    @NotBlank
    private String namePjB;
    @NotBlank
    private String namePjC;
    @NotBlank
    private String namePjD;
    @NotBlank
    private String imgProjectA;
    @NotBlank
    private String imgProjectB;
    @NotBlank
    private String imgProjectC;
    @NotBlank
    private String imgProjectD;
    @NotBlank
    private String dateProjectA;
    @NotBlank
    private String dateProjectB;
    @NotBlank
    private String dateProjectC;
    @NotBlank
    private String dateProjectD;
    @NotBlank
    private String linkProjectA;
    @NotBlank
    private String linkProjectB;
    @NotBlank
    private String linkProjectC;
    @NotBlank
    private String linkProjectD;
    @NotBlank
    private String descriptionProjectA;
    @NotBlank
    private String descriptionProjectB;
    @NotBlank
    private String descriptionProjectC;
    @NotBlank
    private String descriptionProjectD;
    
     //Constructores

    public DtoProyectos() {
    }

    public DtoProyectos(String nameProject, String namePjB, String namePjC, String namePjD, String imgProjectA, String imgProjectB, String imgProjectC, String imgProjectD, String dateProjectA, String dateProjectB, String dateProjectC, String dateProjectD, String linkProjectA, String linkProjectB, String linkProjectC, String linkProjectD, String descriptionProjectA, String descriptionProjectB, String descriptionProjectC, String descriptionProjectD) {
        this.nameProject = nameProject;
        this.namePjB = namePjB;
        this.namePjC = namePjC;
        this.namePjD = namePjD;
        this.imgProjectA = imgProjectA;
        this.imgProjectB = imgProjectB;
        this.imgProjectC = imgProjectC;
        this.imgProjectD = imgProjectD;
        this.dateProjectA = dateProjectA;
        this.dateProjectB = dateProjectB;
        this.dateProjectC = dateProjectC;
        this.dateProjectD = dateProjectD;
        this.linkProjectA = linkProjectA;
        this.linkProjectB = linkProjectB;
        this.linkProjectC = linkProjectC;
        this.linkProjectD = linkProjectD;
        this.descriptionProjectA = descriptionProjectA;
        this.descriptionProjectB = descriptionProjectB;
        this.descriptionProjectC = descriptionProjectC;
        this.descriptionProjectD = descriptionProjectD;
    }
    
     //Getters & Setters

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public String getNamePjB() {
        return namePjB;
    }

    public void setNamePjB(String namePjB) {
        this.namePjB = namePjB;
    }

    public String getNamePjC() {
        return namePjC;
    }

    public void setNamePjC(String namePjC) {
        this.namePjC = namePjC;
    }

    public String getNamePjD() {
        return namePjD;
    }

    public void setNamePjD(String namePjD) {
        this.namePjD = namePjD;
    }

    public String getImgProjectA() {
        return imgProjectA;
    }

    public void setImgProjectA(String imgProjectA) {
        this.imgProjectA = imgProjectA;
    }

    public String getImgProjectB() {
        return imgProjectB;
    }

    public void setImgProjectB(String imgProjectB) {
        this.imgProjectB = imgProjectB;
    }

    public String getImgProjectC() {
        return imgProjectC;
    }

    public void setImgProjectC(String imgProjectC) {
        this.imgProjectC = imgProjectC;
    }

    public String getImgProjectD() {
        return imgProjectD;
    }

    public void setImgProjectD(String imgProjectD) {
        this.imgProjectD = imgProjectD;
    }

    public String getDateProjectA() {
        return dateProjectA;
    }

    public void setDateProjectA(String dateProjectA) {
        this.dateProjectA = dateProjectA;
    }

    public String getDateProjectB() {
        return dateProjectB;
    }

    public void setDateProjectB(String dateProjectB) {
        this.dateProjectB = dateProjectB;
    }

    public String getDateProjectC() {
        return dateProjectC;
    }

    public void setDateProjectC(String dateProjectC) {
        this.dateProjectC = dateProjectC;
    }

    public String getDateProjectD() {
        return dateProjectD;
    }

    public void setDateProjectD(String dateProjectD) {
        this.dateProjectD = dateProjectD;
    }

    public String getLinkProjectA() {
        return linkProjectA;
    }

    public void setLinkProjectA(String linkProjectA) {
        this.linkProjectA = linkProjectA;
    }

    public String getLinkProjectB() {
        return linkProjectB;
    }

    public void setLinkProjectB(String linkProjectB) {
        this.linkProjectB = linkProjectB;
    }

    public String getLinkProjectC() {
        return linkProjectC;
    }

    public void setLinkProjectC(String linkProjectC) {
        this.linkProjectC = linkProjectC;
    }

    public String getLinkProjectD() {
        return linkProjectD;
    }

    public void setLinkProjectD(String linkProjectD) {
        this.linkProjectD = linkProjectD;
    }

    public String getDescriptionProjectA() {
        return descriptionProjectA;
    }

    public void setDescriptionProjectA(String descriptionProjectA) {
        this.descriptionProjectA = descriptionProjectA;
    }

    public String getDescriptionProjectB() {
        return descriptionProjectB;
    }

    public void setDescriptionProjectB(String descriptionProjectB) {
        this.descriptionProjectB = descriptionProjectB;
    }

    public String getDescriptionProjectC() {
        return descriptionProjectC;
    }

    public void setDescriptionProjectC(String descriptionProjectC) {
        this.descriptionProjectC = descriptionProjectC;
    }

    public String getDescriptionProjectD() {
        return descriptionProjectD;
    }

    public void setDescriptionProjectD(String descriptionProjectD) {
        this.descriptionProjectD = descriptionProjectD;
    }
    
}
