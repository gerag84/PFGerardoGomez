package com.PFGerardoGomez.GG.Security.Repository;

import com.PFGerardoGomez.GG.Security.Entity.Rol;
import com.PFGerardoGomez.GG.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Emiliano
 */
@Repository 
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
