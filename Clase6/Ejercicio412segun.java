package Clase6;

import java.util.Scanner;

public class Ejercicio412segun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2;
        int seleccion;

        System.out.println("Digite el numero 1");
        num1 = sc.nextDouble();
        System.out.println("Digite el numero 2");
        num2 = sc.nextDouble();
        System.out.println("Digite la seleccion 1, 2 o 3");
        seleccion = sc.nextInt();

        switch (seleccion) {
            case 1 -> System.out.println("la suma es:" + (num1 + num2));
            case 2 -> System.out.println("la multiplicacion es:" + (num1 * num2));
            case 3 -> System.out.println("la divison es:" + (num1 / num2));
            default -> System.out.println("Opcion no valida");

        }
        sc.close();
    }

}
