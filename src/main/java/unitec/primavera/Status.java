
package unitec.primavera;

/**
 *
 * @author racso
 */
public class Status {

    private String mensaje;
    private boolean exito;

    public boolean isExito() {
        return exito;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Status() {
    }

    public Status(String mensaje, boolean exito) {
        this.mensaje = "Creado con exito";
        this.exito = true;
    }
    
}
