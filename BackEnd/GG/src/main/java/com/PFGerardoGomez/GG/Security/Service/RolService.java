
package com.PFGerardoGomez.GG.Security.Service;

import com.PFGerardoGomez.GG.Security.Entity.Rol;
import com.PFGerardoGomez.GG.Security.Enums.RolNombre;
import com.PFGerardoGomez.GG.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Emiliano
 */
@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
         return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
