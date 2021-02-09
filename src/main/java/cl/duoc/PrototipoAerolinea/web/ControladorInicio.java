package cl.duoc.PrototipoAerolinea.web;

import cl.duoc.PrototipoAerolinea.domain.Vuelo;
import cl.duoc.PrototipoAerolinea.service.VueloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author jacif
 */
@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired // Crea una inyección en Spring del objeto VueloService
    private VueloService vueloService;
    
    @GetMapping("/")
    public String Inicio(Model model){
        var vuelos= vueloService.listarVuelos();
        model.addAttribute("vuelos", vuelos);
        
        return "index";     
    }
    
    @GetMapping("/agregar")
    public String agregar(Vuelo vuelo){
        return "modificar";
    }
    @PostMapping("/guardar")
    public String guardar(Vuelo vuelo){
        vueloService.guardar(vuelo);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{id_vuelo}")
    public String editar(Vuelo vuelo,Model model){
        vuelo = vueloService.encontrarVuelo(vuelo);
        model.addAttribute("vuelo",vuelo);
        return "modificar";
    }
    /**
    @GetMapping("/")
    public String eliminar(Vuelo vuelo){
        vueloService.eliminar(vuelo);
        return "redirect:/";
    }
    */
}
