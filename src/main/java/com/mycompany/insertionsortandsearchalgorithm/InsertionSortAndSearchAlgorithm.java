/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.insertionsortandsearchalgorithm;

/**
 *
 * @author jesusrrp
 */
import java.util.*;

public class InsertionSortAndSearchAlgorithm {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Insertion Sort");
            System.out.println("2. Jump Search");
            System.out.println("3. Salir");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    handleInsertionSort(scanner);
                    break;
                case 2:
                    handleJumpSearch(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    private static void handleInsertionSort(Scanner scanner) {
        System.out.println("Insertion Sort seleccionado.");
        System.out.println("1. Usar valores predeterminados (aleatorios)");
        System.out.println("2. Ingresar valores manualmente");

        int choice = scanner.nextInt();
        int[] numbers;

        switch (choice) {
            case 1:
                Random rand = new Random();
                numbers = new int[10];
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = rand.nextInt(100);
                }   break;
            case 2:
                System.out.println("Ingrese el tamaño del arreglo:");
                int size = scanner.nextInt();
                numbers = new int[size];
                System.out.println("Ingrese los valores del arreglo:");
                for (int i = 0; i < size; i++) {
                    numbers[i] = scanner.nextInt();
                }   break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.println("Antes de ordenar:");
        InsertionSort.printArray(numbers);

        InsertionSort.insertionSort(numbers);

        System.out.println("\nDespués de ordenar:");
        InsertionSort.printArray(numbers);
    }

    private static void handleJumpSearch(Scanner scanner) {
        System.out.println("Jump Search seleccionado.");
        System.out.println("1. Usar valores predeterminados");
        System.out.println("2. Ingresar valores manualmente");

        int choice = scanner.nextInt();
        int[] arr;
        int x;

        switch (choice) {
            case 1:
                arr = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
                System.out.println("Arreglo predeterminado: " + Arrays.toString(arr));
                System.out.println("Ingrese el valor a buscar:");
                x = scanner.nextInt();
                break;
            case 2:
                System.out.println("Ingrese el tamaño del arreglo:");
                int size = scanner.nextInt();
                arr = new int[size];
                System.out.println("Ingrese los valores del arreglo (en orden ascendente):");
                for (int i = 0; i < size; i++) {
                    arr[i] = scanner.nextInt();
                }   System.out.println("Ingrese el valor a buscar:");
                x = scanner.nextInt();
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        int index = JumpSearch.jumpSearch(arr, x);

        if (index == -1) {
            System.out.println("El número " + x + " no está en el arreglo.");
        } else {
            System.out.println("El número " + x + " está en el índice " + index);
        }
    }
}
