package com.PFGerardoGomez.GG.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Gera
 */

public class DtoSkill {
    @NotBlank
    private String nombreS;
    @NotBlank
    private String porcentajeS;
    
    //Constructores

    public DtoSkill() {
    }

    public DtoSkill(String nombreS, String porcentajeS) {
        this.nombreS = nombreS;
        this.porcentajeS = porcentajeS;
    }
    //Getters & Setters

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getPorcentajeS() {
        return porcentajeS;
    }

    public void setPorcentajeS(String porcentajeS) {
        this.porcentajeS = porcentajeS;
    }
}
