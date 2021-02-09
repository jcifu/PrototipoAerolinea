package cl.duoc.PrototipoAerolinea.dao;

import org.springframework.data.repository.CrudRepository;
import cl.duoc.PrototipoAerolinea.domain.Vuelo;

public interface VueloDAO extends CrudRepository<Vuelo,Long>{
    
}
