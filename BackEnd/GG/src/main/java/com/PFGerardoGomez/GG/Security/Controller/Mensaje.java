package com.PFGerardoGomez.GG.Security.Controller;

/**
 *
 * @author Gera
 */
public class Mensaje {
    private String mensaje;
    
    //contructor

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    //getter y setter

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
