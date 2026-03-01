package Tarea1;

import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        System.out.print("Ingrese un número: ");
        double num = sc.nextDouble();
        
        if (num < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            double raiz = Math.sqrt(num);
            System.out.println("La raíz cuadrada de " + num + " es " + raiz);
        }

        sc.close();
    }
}


