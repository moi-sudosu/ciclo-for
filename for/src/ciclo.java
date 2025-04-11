/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sala de Sistemas
 */
    import java.util.ArrayList;
import java.util.Scanner;

public class GestionNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        int opcion = 0;

        // Creamos un ciclo "for" infinito con una condición que rompemos manualmente
        for (; ; ) {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Agregar Nombre");
            System.out.println("2. Eliminar Nombre");
            System.out.println("3. Actualizar Nombre");
            System.out.println("4. Mostrar Nombres");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            if (opcion == 1) {
                System.out.print("Digite el nombre a agregar: ");
                String nombre = entrada.nextLine();
                nombres.add(nombre);
                System.out.println("Nombre agregado con éxito.");

            } else if (opcion == 2) {
                System.out.print("Digite el nombre a eliminar: ");
                String nombreEliminar = entrada.nextLine();
                boolean encontrado = false;

                for (int i = 0; i < nombres.size(); i++) {
                    if (nombres.get(i).equalsIgnoreCase(nombreEliminar)) {
                        nombres.remove(i);
                        System.out.println("Nombre eliminado.");
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Nombre no encontrado.");
                }

            } else if (opcion == 3) {
                System.out.print("Digite el nombre que desea actualizar: ");
                String nombreViejo = entrada.nextLine();
                boolean actualizado = false;

                for (int i = 0; i < nombres.size(); i++) {
                    if (nombres.get(i).equalsIgnoreCase(nombreViejo)) {
                        System.out.print("Digite el nuevo nombre: ");
                        String nuevoNombre = entrada.nextLine();
                        nombres.set(i, nuevoNombre);
                        System.out.println("Nombre actualizado.");
                        actualizado = true;
                        break;
                    }
                }
                if (!actualizado) {
                    System.out.println("Nombre no encontrado.");
                }

            } else if (opcion == 4) {
                System.out.println("Lista de nombres:");
                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println((i + 1) + ". " + nombres.get(i));
                }

            } else if (opcion == 5) {
                System.out.println("Saliendo del programa...");
                break;

            } else {
                System.out.println("Opción inválida.");
            }

            System.out.println(); // línea en blanco para separar
        }

        entrada.close();
    }
}


