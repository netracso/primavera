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
       // GUARDA UN MENSAJE EN MONGODB
       //repMensa.save(new Mensajito("MALO" ,"MAL",LocalDate.now()));
       //BUSCAMOS TODOS LOS MENSAJES
       //for(Mensajito mensa: repMensa.findAll()){ //findAll() nos regresa un arreglo de mensajes
         // System.out.println(mensa);
       
      //}
    //buscamos por id
      //  System.out.println(repMensa.findById("5bb4224200d6441d94e39866").get());
    //BUSCANDO POR TITULO     
  //repMensa.save(new Mensajito("malo", "yo", "racso",LocalDate.now()));  
    //System.out.println(repMensa.findByTtitulo("YO");
        
        repMensa.deleteById(Mensajito.get());
        
    }
}
//JSON--> 