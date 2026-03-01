package Tarea1;

import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        if (num2 == 0 || num1 == 0) {
            System.out.println("No se puede dividir por cero.");
        } else if (num1 % num2 == 0) {
            System.out.println(num2 + " es divisor de " + num1);
        } else if (num2 % num1 == 0) {
            System.out.println(num1 + " es divisor de " + num2);
        } else {
            System.out.println("Ninguno es divisor del otro.");
        }

        sc.close();
    }
}