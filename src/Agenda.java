public class Agenda {
    private Persona[] personas;
    private int contador;

    // ... Resto de los métodos ...

    public void listarPersonas() {
        if (contador == 0) {
            System.out.println("La agenda está vacía.");
        } else {
            System.out.println("Datos de la Agenda:");
            for (int i = 0; i < contador; i++) {
                Persona p = personas[i];
                System.out.println(p.getNombre() + "," + p.getApellido() + "," + p.getTelefono() + "," + p.getDni());
            }
        }
    }

    public void agregarPersona(Persona nuevaPersona) {
    }

    public void buscarPersona(String dni) {
    }

    public void borrarPersona(String dni) {
    }
}
