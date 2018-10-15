
package unitec.primavera;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author racso
 */
public interface RepositorioCilente extends MongoRepository<Cliente,String> {

    //Buscadores por campos o por listas
List<Cliente> FindAll();
Cliente FindByid(String id);     
Cliente FindByemail(String email);

}
