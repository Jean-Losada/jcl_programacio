package Clasenumero7;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0;

        System.out.println("Ingrese numeros (0 para terminar): ");
        num = sc.nextInt();

        while (num != 0){
            suma = suma + num;
            num = sc.nextInt();

            System.out.println("La suma total es:" + suma );

            sc.close();
        }
    }
    
}
