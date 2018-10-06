
package unitec.primavera;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author racso
@RE */
@RestController
@RequestMapping("/api")
//
public class ControladorMensajitos {
  //Mi primer hola mundo desde REST api con spring
    @GetMapping(path="/hola") //path = ruta
    public String hola(){
     return "Hola Mundo";
    }
}
