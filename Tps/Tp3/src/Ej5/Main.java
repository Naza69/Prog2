package Ej5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();

        while (true) {
            System.out.println("\nSelecciona una opcion:");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Mostrar todas las tareas");
            System.out.println("3. Quitar tarea");
            System.out.println("4. Salir");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the new line after the integer

            switch (option) {
                case 1:
                    System.out.println("Porfavor, introduzca la descripcion de la tarea:");
                    String description = scanner.nextLine();
                    System.out.println("Introduzca la prioridad de la tarea:");
                    int priority = scanner.nextInt();
                    taskList.addTask(description, priority);
                    System.out.println("Tarea añadida exitosamente");
                    break;
                case 2:
                    System.out.println("Todas las tareas en orden descendente de prioridad:");
                    for (Task task : taskList) {
                        System.out.println("Descripcion: " + task.getDescription() + ", Priordad: " + task.getPriority());
                    }
                    break;
                case 3:
                    System.out.println("Introduzca la descripcion de la tarea que quiere quitar:");
                    String descriptionToRemove = scanner.nextLine();
                    taskList.removeTask(descriptionToRemove);
                    System.out.println("Tarea quitada exitosamente.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opcion invalida, por favor introduzca una opcion valida");
            }
        }
    }
}
