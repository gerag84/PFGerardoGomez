
package com.PFGerardoGomez.GG.Service;

import com.PFGerardoGomez.GG.Entity.Persona;
import com.PFGerardoGomez.GG.Repository.RPersona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gera
 */
@Service
public class SPersona {
  @Autowired
    RPersona rPersona;
    public List<Persona> getPersona() {
        List<Persona> persona = rPersona.findAll();
        return persona;
    }
    
    public List<Persona> list(){
         return rPersona.findAll();
     }

    public Optional<Persona> getOne(Long id){
         return rPersona.findById(id);
     }
    
  
    public void savePersona(Persona persona) {
        rPersona.save(persona);
    }
    
       public void deletePersona(Long id) {
        rPersona.deleteById(id);
    }
    public Persona findPersona(Long id) {
        Persona persona = rPersona.findById(id).orElse(null);
        return persona;
    }
 
   
    public boolean existsById(Long id){
         return rPersona.existsById(id);
     }      
}
