package Parcial1;

import java.util.Scanner;

public class parcial1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     final int CLAVE = 1234;
        final int SALDOINICIAL = 800000;
        
        int claveUsuario;
        int retiro;
        int nuevoSaldo;
        
        System.out.println(System.in);
        
        System.out.println("ingrese su clave: ");
        claveUsuario = sc.nextInt();
        
        if (CLAVE == claveUsuario) {
            
            System.out.println("Bienvenido al cajero de la universidad Antonio Jose Camacho: ");
            System.out.println("Digite la cantidad que desea retirar: ");
            
            retiro = sc.nextInt();
            
            if (retiro > 200000) {
                retiro += 2000; 
                
                if (retiro <= SALDOINICIAL) {
                    nuevoSaldo = SALDOINICIAL - retiro;
                    System.out.println("Su saldo actual es: " + nuevoSaldo + "Muchas Gracias Que Tenga Buen Dia: ");
                } else {
                    System.out.println("El valor solicitado mas el costo de la transaccion es mayor al saldo");
                }
                
            } else {
                
                if (retiro <= SALDOINICIAL) {
                    nuevoSaldo = SALDOINICIAL - retiro;
                    System.out.println("Su saldo actual es: " + nuevoSaldo + "Muchas Gracias Que Tenga Buen Dia: ");
                } else {
                    System.out.println("El valor solicitado es mayor al actual...");
                }
            }
         
        } else {
            System.out.println("Su clave no es correcta intentelo nuevamente...");
        sc.close();
    }  
}
}