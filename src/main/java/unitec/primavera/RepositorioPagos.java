
package unitec.primavera;

import org.springframework.context.annotation.Configuration;

/**
 *
 * @author racso
 */
@Configuration
public class RepositorioPagos {

   void servicioPagar(){
   new TarjetaCredito().pagar();
    
}}
