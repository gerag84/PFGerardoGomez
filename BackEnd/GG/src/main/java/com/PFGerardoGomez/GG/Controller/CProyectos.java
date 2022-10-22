package com.PFGerardoGomez.GG.Controller;


import com.PFGerardoGomez.GG.Entity.Proyectos;
import com.PFGerardoGomez.GG.Security.Controller.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gera
 */
@RestController
@RequestMapping("/proyectos")
@CrossOrigin("http://localhost:4200/")

public class CProyectos {

    @Autowired
    SProyectos sProyectos;

    @GetMapping("/traer/{id}")
    public ResponseEntity<Persona> findPersona(@PathVariable("id") Long id) {
       if(!sPersona.existsById(id))//reviso que exista la persona por ID
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
       Persona persona = sPersona.findPersona(id);
       return new ResponseEntity(persona, HttpStatus.OK);
        
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public String crearPersona(@RequestBody Persona persona) {
        sPersona.savePersona(persona);
        return "La persona fue creada correctamente";
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        sPersona.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }

    @GetMapping("/traer/perfil")
    public Persona findPersona() {
        return sPersona.findPersona((long) 1);
    }
}
