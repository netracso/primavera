package unitec.primavera;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimaveraApplication implements CommandLineRunner{ //
        //@Autowired Hace la inyección de independencias
@Autowired RepositorioPagos repPagos;	
@Autowired PepositoriosMensajes repMensa; 	//repositorio de todas las operaciones
    public static void main(String[] args) {
		SpringApplication.run(PrimaveraApplication.class, args);        
	}

    @Override
    public void run(String... args) throws Exception {
     
        System.out.println("Hola Mundo");
        //repPagos.servicioPagar();
       repMensa.save(new Mensajito("hola" ,"puerco",LocalDate.now()));
    }
}
