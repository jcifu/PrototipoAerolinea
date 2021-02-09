package cl.duoc.PrototipoAerolinea.service;

import java.util.List;
import cl.duoc.PrototipoAerolinea.domain.Vuelo;

/**
 *
 * @author jacif
 */
public interface VueloService {
    public List<Vuelo> listarVuelos();
    
    public void guardar(Vuelo vuelo);
    
    public void eliminar(Vuelo vuelo);
    
    public Vuelo encontrarVuelo(Vuelo vuelo);
}



