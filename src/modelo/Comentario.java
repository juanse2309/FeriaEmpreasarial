package modelo;

import java.time.LocalDate;

public class Comentario {
    private Visitante visitante;
    private LocalDate fecha;
    private int calificacion;
    private String texto;

    public Comentario(Visitante visitante, int calificacion, String texto) {
        this.visitante = visitante;
        this.fecha = LocalDate.now();
        this.calificacion = calificacion;
        this.texto = texto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getTexto() {
        return texto;
    }
    
    public Visitante getVisitante() {
        return visitante;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }
}
