
package unitec.primavera;

/**
 *
 * @author racso
 */
public class TarjetaDebito extends Tarjeta implements Pagos {

    @Override
    public void pagar() {
        System.out.println("Pagando Debito");
    }
    
}
