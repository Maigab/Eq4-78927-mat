package mx.uv.crudUV;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Saludador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Integer id;
    private String nombre;

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
    

}
