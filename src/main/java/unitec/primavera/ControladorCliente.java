
package unitec.primavera;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author racso
 */
@RestController
@RequestMapping("/api")

public class ControladorCliente {
    @PostMapping("/mensaje")
    public Status mensaje(){
    
    return new Status(); //retorna un nuevo estado de la clase mensaje
    
    
    }
}
