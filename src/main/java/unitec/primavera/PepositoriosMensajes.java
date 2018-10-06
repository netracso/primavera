
package unitec.primavera;

import java.util.ArrayList;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author racso
 */
public interface PepositoriosMensajes extends MongoRepository<Mensajito,String> {
    ArrayList<Mensajito> findByTtitulo(String titulo);
           
}
