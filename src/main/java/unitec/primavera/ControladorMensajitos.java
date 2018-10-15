
package unitec.primavera;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author racso
@RE */
@RestController//CADA PETICION QUE LE HAGAS DE LOS METDOS LO CONVIERTE A JEISON O VICEVERSA
@RequestMapping("/api")//API ES UNA DIRECCIÓN A DONDE MANDAAR SOLICITUDES

public class ControladorMensajitos {
@Autowired PepositoriosMensajes mensa;
    //Mi primer hola mundo desde REST api con spring
    @GetMapping(path="/hola") //path = ruta 
    public String hola(){
     return "Hola Mundo";
    }
     //POST INSERTAR
    //PUT ACTUALIZAR
    //DELETE ELIMINAR
    
    //Buscamos todos
@GetMapping(path="/mensaje")
public List<Mensajito> todos(){

return mensa.findAll();
}
//Buscamos por ID
@GetMapping(path="/mensaje/{id}")
public Mensajito buscarPorId(@PathVariable String id){

return mensa.findById(id).get();
}
        
}
