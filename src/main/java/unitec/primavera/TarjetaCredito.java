/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.primavera;

/**
 *
 * @author racso
 */
public class TarjetaCredito extends Tarjeta implements Pagos {

    @Override
    public void pagar() {
        System.out.println("Pagando Credito");
    }
    
}
