package logica;

import java.util.ArrayList;
import java.util.List;
import modelo.Comentario;
import modelo.Empresa;
import modelo.Stand;
import modelo.Visitante;

public class FeriaEmpresarial {
    private List<Stand> stands;
    private List<Visitante> visitantes;

    public FeriaEmpresarial() {
        this.stands = new ArrayList<>();
        this.visitantes = new ArrayList<>();
    }

    public void registrarEmpresa(String nombre, String sector, String correo, int numeroStand) {
        Empresa empresa = new Empresa(nombre, sector, correo);
        // Buscar si el stand ya existe, si no, crearlo (simplificado para el ejemplo)
        Stand stand = buscarStand(numeroStand);
        if (stand == null) {
            stand = new Stand(numeroStand, "Ubicacion Pendiente", "Mediano"); // Valores por defecto
            stands.add(stand);
        }
        stand.asignarEmpresa(empresa);
        System.out.println("Empresa " + nombre + " registrada en el stand " + numeroStand);
    }
    
    private Stand buscarStand(int numero) {
        for (Stand s : stands) {
            if (s.getNumero() == numero) {
                return s;
            }
        }
        return null;
    }

    public void registrarVisitante(String nombre, String id, String correo) {
        Visitante visitante = new Visitante(nombre, id, correo);
        visitantes.add(visitante);
        System.out.println("Visitante registered: " + nombre);
    }

    public void agregarComentario(String idVisitante, int numeroStand, int calificacion, String texto) {
        Visitante visitante = buscarVisitante(idVisitante);
        Stand stand = buscarStand(numeroStand);

        if (visitante != null && stand != null) {
            Comentario comentario = new Comentario(visitante, calificacion, texto);
            stand.agregarComentario(comentario);
            visitante.visitarStand(stand);
            System.out.println("Comentario agregado al stand " + numeroStand + " por " + visitante.getNombre());
        } else {
            System.out.println("Error: Visitante o Stand no encontrado.");
        }
    }
    
    private Visitante buscarVisitante(String id) {
        for (Visitante v : visitantes) {
            if (v.getId().equals(id)) {
                return v;
            }
        }
        return null;
    }

    public void reporteStands() {
        System.out.println("--- Reporte de Stands ---");
        for (Stand stand : stands) {
            Empresa emp = stand.getEmpresa();
            String nombreEmp = (emp != null) ? emp.getNombre() : "Vacío";
            System.out.println("Stand " + stand.getNumero() + ": " + nombreEmp + " (" + stand.getComentarios().size() + " comentarios)");
        }
    }

    public void reporteComentariosEmpresa(int numeroStand) {
        Stand stand = buscarStand(numeroStand);
        if (stand != null) {
            System.out.println("--- Comentarios para Stand " + numeroStand + " ---");
            for (Comentario c : stand.getComentarios()) {
                System.out.println("[" + c.getCalificacion() + "*] " + c.getTexto() + " - " + c.getVisitante().getNombre());
            }
        } else {
            System.out.println("Stand no encontrado.");
        }
    }
}
