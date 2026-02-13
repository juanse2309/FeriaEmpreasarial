
import logica.FeriaEmpresarial;

public class Main {
    public static void main(String[] args) {
        FeriaEmpresarial feria = new FeriaEmpresarial();

        // 1. Registrar empresas
        feria.registrarEmpresa("Tech Solutions", "Tecnologia", "contacto@tech.com", 101);
        feria.registrarEmpresa("EcoFoods", "Alimentos", "ventas@ecofoods.com", 102);

        // 2. Registrar visitantes
        feria.registrarVisitante("Juan Perez", "12345678", "juan@mail.com");
        feria.registrarVisitante("Maria Gomez", "87654321", "maria@mail.com");

        // 3. Agregar comentarios
        feria.agregarComentario("12345678", 101, 5, "Excelente innovacion!");
        feria.agregarComentario("87654321", 101, 4, "Muy interesante.");
        feria.agregarComentario("12345678", 102, 3, "Buena comida, pero algo caro.");

        // 4. Generar reportes
        System.out.println();
        feria.reporteStands();
        
        System.out.println();
        feria.reporteComentariosEmpresa(101);
    }
}
