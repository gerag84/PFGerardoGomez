package com.PFGerardoGomez.GG.Service;

import com.PFGerardoGomez.GG.Entity.Skill;
import com.PFGerardoGomez.GG.Repository.RSkill;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gera
 */
@Service
@Transactional
public class SSkill {
    @Autowired
     RSkill rSkill;
     
     public List<Skill> list(){
         return rSkill.findAll();
     }
     
     public Optional<Skill> getOne(int id){
         return rSkill.findById(id);
     }
     
     public Optional<Skill> getByNombreS(String nombreS){
         return rSkill.findByNombreS(nombreS);
     }
     
     public void save(Skill ski){
         rSkill.save(ski);
     }
     
     public void delete(int id){
         rSkill.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rSkill.existsById(id);
     }
     
     public boolean existsByNombreS(String nombreS){
         return rSkill.existsByNombreS(nombreS);
     }
}
