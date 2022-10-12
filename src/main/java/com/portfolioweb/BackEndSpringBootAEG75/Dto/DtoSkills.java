/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.BackEndSpringBootAEG75.Dto;

import javax.validation.constraints.NotBlank;


public class DtoSkills {
    @NotBlank
    private String nameSkill;
    @NotBlank
    private Long progress;
    @NotBlank
    private int percentage;
    @NotBlank
    private String imgSkill;
    @NotBlank
    private String imgbSkill;
    @NotBlank
    private String color;
    
    //Constructores

    public DtoSkills() {
    }

    public DtoSkills(String nameSkill, Long progress, int percentage, String imgSkill, String imgbSkill, String color) {
        this.nameSkill = nameSkill;
        this.progress = progress;
        this.percentage = percentage;
        this.imgSkill = imgSkill;
        this.imgbSkill = imgbSkill;
        this.color = color;
    }
    
    //Getters & Setters

    public String getNameSkill() {
        return nameSkill;
    }

    public void setNameSkill(String nameSkill) {
        this.nameSkill = nameSkill;
    }

    public Long getProgress() {
        return progress;
    }

    public void setProgress(Long progress) {
        this.progress = progress;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public String getImgSkill() {
        return imgSkill;
    }

    public void setImgSkill(String imgSkill) {
        this.imgSkill = imgSkill;
    }

    public String getImgbSkill() {
        return imgbSkill;
    }

    public void setImgbSkill(String imgbSkill) {
        this.imgbSkill = imgbSkill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
