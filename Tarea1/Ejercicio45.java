package Tarea1;

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // --- ENTRADA ---
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        // --- PROCESO Y SALIDA ---
        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        sc.close();
    }
}
