
package com.PFGerardoGomez.GG.Repository;

import com.PFGerardoGomez.GG.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Gera
 */
@Repository
public interface RPersona extends JpaRepository<Persona,Long>{
    //public Optional<Persona> findbyid(Long idpersona);

}
