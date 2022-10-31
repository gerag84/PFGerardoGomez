package com.PFGerardoGomez.GG.Controller;






import com.PFGerardoGomez.GG.Dto.DtoEducacion;
import com.PFGerardoGomez.GG.Entity.Educacion;
import com.PFGerardoGomez.GG.Security.Controller.Mensaje;
import com.PFGerardoGomez.GG.Service.SEducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gera
 */
@RestController
@RequestMapping("/edu")
@CrossOrigin("http://localhost:4200/") //permite que el front use los metodos del back

public class CEducacion {
    @Autowired
    SEducacion sEducacion;
    
    //trae la lista de educaciones
   @GetMapping("/lista")
   public ResponseEntity<List<Educacion>> list(){//busco las educaciones
        List<Educacion> list = sEducacion.list();
        return new ResponseEntity(list, HttpStatus.OK);
     }   
    
   //trae una educacion por id
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
        if(!sEducacion.existsById(id))//reviso que exista la educacion por ID
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Educacion educacion = sEducacion.getOne(id).get();//si existe la muestro
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    //elimina una educacion
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Educacion> delete(@PathVariable("id") int id) {
        if (!sEducacion.existsById(id)) {//reviso que exista la educacion
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sEducacion.delete(id); //si existe la elimino
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    //crea una educacion
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<Educacion> create(@RequestBody DtoEducacion dtoEdu){      
        if(StringUtils.isEmpty(dtoEdu.getNombreEd())) //me fijo si no escribio nada
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        //if(sEducacion.existsByNombreEd(dtoedu.getNombreEd())) //me fijo si ya existe
        //    return new ResponseEntity(new Mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST);
        //creo la educacion con los datos ingresados
        Educacion educacion = new Educacion(dtoEdu.getNombreEd(), dtoEdu.getDescripcionEd(),dtoEdu.getEstadoEd());
        sEducacion.save(educacion); //guardo lo que se cargo en la linea de arriba
        
        return new ResponseEntity(new Mensaje("Educacion agregada"), HttpStatus.OK);
    }
    
    //actualiza una educacion
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<Educacion> update(@PathVariable("id") int id, @RequestBody DtoEducacion dtoEdu){//actualizo la educacion
        //reviso que exista la educacion
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de educacion
        //if(sEducacion.existsByNombreEd(dtoedu.getNombreEd()) && sEducacion.getByNombreEd(dtoedu.getNombreEd()).get().getId() != id)
        //    return new ResponseEntity(new Mensaje("Esa educacion ya existe"), HttpStatus.BAD_REQUEST);
        //El nombre no puede estar vacio
        if(StringUtils.isEmpty(dtoEdu.getNombreEd()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        //si pasa todas las condiciones actualizo la educacion
        Educacion educacion = sEducacion.getOne(id).get();
        educacion.setNombreEd(dtoEdu.getNombreEd());
        educacion.setDescripcionEd((dtoEdu.getDescripcionEd()));
        educacion.setEstadoEd(dtoEdu.getEstadoEd());
        
        sEducacion.save(educacion);
        return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK);
             
    }
}