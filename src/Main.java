import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Agenda agenda = new Agenda(); // Ajusta el tamaño según tus necesidades

            while (true) {
                System.out.println("Menú de Opciones:");
                System.out.println("1. Agregar persona");
                System.out.println("2. Buscar persona");
                System.out.println("3. Borrar persona");
                System.out.println("4. Listar personas");
                System.out.println("5. Salir");
                System.out.print("Elige una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpia el buffer del scanner

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce el nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Introduce el apellido: ");
                        String apellido = scanner.nextLine();
                        System.out.print("Introduce el teléfono: ");
                        int telefono = scanner.nextInt();
                        scanner.nextLine(); // Limpia el buffer
                        System.out.print("Introduce el DNI: ");
                        String dni = scanner.nextLine();
                        Persona nuevaPersona = new Persona(nombre, apellido, telefono, dni);
                        agenda.agregarPersona(nuevaPersona);
                        break;
                    case 2:
                        System.out.print("Introduce el DNI de la persona a buscar: ");
                        dni = scanner.nextLine();
                        agenda.buscarPersona(dni);
                        break;
                    case 3:
                        System.out.print("Introduce el DNI de la persona a borrar: ");
                        dni = scanner.nextLine();
                        agenda.borrarPersona(dni);
                        break;
                    case 4:
                        agenda.listarPersonas();
                        break;
                    case 5:
                        System.out.println("Saliendo del programa.");
                        return;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            }
        }
    }



