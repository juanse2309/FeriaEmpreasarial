package modelo;

import java.util.ArrayList;
import java.util.List;

public class Visitante {
    private String nombre;
    private String id;
    private String correo;
    private List<Stand> standsVisitados;

    public Visitante(String nombre, String id, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
        this.standsVisitados = new ArrayList<>();
    }

    public void visitarStand(Stand stand) {
        if (!standsVisitados.contains(stand)) {
            standsVisitados.add(stand);
        }
    }

    public List<Stand> getStandsVisitados() {
        return standsVisitados;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getId() {
        return id;
    }
    
    public String getCorreo() {
        return correo;
    }
}
