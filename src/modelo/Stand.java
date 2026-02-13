package modelo;

import java.util.ArrayList;
import java.util.List;

public class Stand {
    private int numero;
    private String ubicacion;
    private String tamano;
    private Empresa empresa;
    private List<Comentario> comentarios;

    public Stand(int numero, String ubicacion, String tamano) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.comentarios = new ArrayList<>();
    }

    public void asignarEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void agregarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public int getNumero() {
        return numero;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }
    
    public String getTamano() {
        return tamano;
    }
    
    public List<Comentario> getComentarios() {
        return comentarios;
    }
}
