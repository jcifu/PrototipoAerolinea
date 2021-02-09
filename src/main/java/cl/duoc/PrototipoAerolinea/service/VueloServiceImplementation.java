package cl.duoc.PrototipoAerolinea.service;

import cl.duoc.PrototipoAerolinea.dao.VueloDAO;
import cl.duoc.PrototipoAerolinea.domain.Vuelo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jacif
 */
@Service
public class VueloServiceImplementation implements VueloService {
    @Autowired
    private VueloDAO vueloDAO;

    @Override
    @Transactional (readOnly=true)
    public List<Vuelo> listarVuelos() {
        return(List<Vuelo>)vueloDAO.findAll();
    }

    @Override
    public void guardar(Vuelo vuelo) {
        vueloDAO.save(vuelo);
    }

    @Override
    @Transactional
    public void eliminar(Vuelo vuelo) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        vueloDAO.delete(vuelo);
    }

    @Override
    @Transactional
    public Vuelo encontrarVuelo(Vuelo vuelo) {
        return vueloDAO.findById(vuelo.getId_vuelo()).orElse(vuelo);
    }
}