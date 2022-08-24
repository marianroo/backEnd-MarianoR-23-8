/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ms.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Gonza
 */

@Entity
public class Proyectos {
    
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombrePro;
    private String descripcionPro;
    private String imgPro;

    public Proyectos() {
    }

    public Proyectos(int id, String nombrePro, String descripcionPro, String imgPro) {
        this.id = id;
        this.nombrePro = nombrePro;
        this.descripcionPro = descripcionPro;
        this.imgPro = imgPro;
    }

    public Proyectos(String nombrePro, String descripcionPro, String imgPro) {
      this.nombrePro = nombrePro;
        this.descripcionPro = descripcionPro;
        this.imgPro = imgPro;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getDescripcionPro() {
        return descripcionPro;
    }

    public void setDescripcionPro(String descripcionPro) {
        this.descripcionPro = descripcionPro;
    }

    public String getImgPro() {
        return imgPro;
    }

    public void setImgPro(String imgPro) {
        this.imgPro = imgPro;
    }
    
    
    
}
