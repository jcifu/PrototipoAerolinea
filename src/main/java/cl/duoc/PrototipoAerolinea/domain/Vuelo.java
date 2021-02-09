package cl.duoc.PrototipoAerolinea.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * Clase vuelo describe la tabla SQL Vuelo, con información 
 * detallada de la programación de vuelos de la Aerolínea
 * @author jacif
 */
@Data
@Entity
@Table(name="vuelo") // Para evitar incompatibilidades y errores al reconocer la tabla en la base de datos 
public class Vuelo implements Serializable{

    //Para conocer el estado del objeto y sus cambios, Serializable necesita asignar un número de serie al objeto 
    private static final long serialVersionUID=1L;
    
    
    @Id // Realizar referencia a un Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //Generar un valor a partir del id del objeto
    private Long id_vuelo; 
    // idPersona Se define como clase Long y no como tipo de variable, para la manipulación de serialVersionUID ante cambios
    // idPersona es la id de la tabla/entidad de la tabla
    private String fecha_ida;
    private String origen;
    private String destino;
    private String hora_vuelo;
    private String hora_llegada;
    
    
}
