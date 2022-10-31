package com.PFGerardoGomez.GG.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Gera
 */
public class DtoEducacion {
    @NotBlank
    private String nombreEd;
    @NotBlank
    private String descripcionEd;
    @NotBlank
    private String estadoEd;
    
    //Constructores

    public DtoEducacion() {
    }

    public DtoEducacion(String nombreEd, String descripcionEd, String estadoEd) {
        this.nombreEd = nombreEd;
        this.descripcionEd = descripcionEd;
        this.estadoEd = estadoEd;
    }
    //Getters & Setters

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
    
    public String getEstadoEd() {
        return estadoEd;
    }

    public void setEstadoEd(String estadoEd) {
        this.estadoEd = estadoEd;
    }
}
