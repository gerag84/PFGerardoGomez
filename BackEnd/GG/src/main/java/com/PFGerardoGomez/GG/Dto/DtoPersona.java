package com.PFGerardoGomez.GG.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Gera
 */

public class DtoPersona {
    private Long id;
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    private String img;

    public DtoPersona(Long id, String nombre, String apellido, String img) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
    }
    public DtoPersona(){
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

   
}
