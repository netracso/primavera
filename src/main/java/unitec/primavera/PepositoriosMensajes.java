
package unitec.primavera;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author racso
 */
public interface PepositoriosMensajes extends MongoRepository<Mensajito,String> {
    
}
