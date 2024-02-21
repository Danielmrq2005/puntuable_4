package SolucionHashMap;

import java.util.Scanner;

public class PilotoHashMap {
    public static void main(String[] args) {
        MetodosHashMap mapa = new MetodosHashMap();
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t\tPROGRAMA ATLAS\n");
        do {
            System.out.println("1. Añadir una entrada al atlas\t\t\t\t2. Mostrar el contenido actual del atlas");
            System.out.println("3. Buscar una entrada del atlas\t\t\t\t4. Modificar una entrada del atlas");
            System.out.println("5. Ordenar por nombre de país\t\t\t\t6. Mostrar el contenido del atlas con iterador");
            System.out.println("7. Eliminar una entrada del atlas\t\t\t8. Eliminar el contenido completo del atlas");
            System.out.println("9. Salir");
            System.out.print("Teclea una de las opciones: ");
            try {
                numero = scanner.nextInt();
                scanner.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Debe ingresar un valor numérico");
                numero = 0;
                scanner.nextLine();
                continue;
            }
            switch (numero) {
                case 1:
                    mapa.aniadircondiccionario();
                    break;
                case 2:
                    mapa.mostrarcondiccionario();
                    break;
                case 3:
                    mapa.buscarcondiccionario();
                    break;
                case 4:
                    mapa.modficarpordiccionario();
                    break;
                case 5:
                    mapa.ordenarpordiccionario();
                    break;
                case 6:
                    mapa.iterarpordiccionario();
                    break;
                case 7:
                    mapa.eliminarpordiccionario();
                    break;
                case 8:
                    mapa.vaciarpordiccionario();
                    break;
                case 9:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (numero != 9);
    }
}
