package com.PFGerardoGomez.GG.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEd;
    private String descripcionEd;
    private String estadoEd;
    
    //Constructores

    public Educacion() {
    }

    public Educacion(String nombreEd, String descripcionEd, String estadoEd) {
        this.nombreEd = nombreEd;
        this.descripcionEd = descripcionEd;
        this.estadoEd = estadoEd;
    }
    
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEd() {
        return nombreEd;
    }

    public void setNombreEd(String nombreEd) {
        this.nombreEd = nombreEd;
    }

    public String getDescripcionEd() {
        return descripcionEd;
    }

    public void setDescripcionEd(String descripcionEd) {
        this.descripcionEd = descripcionEd;
    }
    
    public String getEstadoEd(){
        return estadoEd;
    }
    
    public void setEstadoEd(String estadoEd){
        this.estadoEd = estadoEd;
    }
}