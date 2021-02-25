/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numeroJugador=0;
    int numeroAdivinar = (int) ((Math.random() * 100)+1); // Número aleatorio de 1 a 100.
     System.out.println("Adivina el numero");
    do{
        
        System.out.println("Ingrese un numero");
        numeroJugador=entrada.nextInt();
        if (numeroJugador==numeroAdivinar){
             System.out.println("Adivinaste el numero!!");
        }
        else if(numeroJugador>numeroAdivinar){
             System.out.println("Mayor");
        }
        else if (numeroJugador<numeroAdivinar){
            System.out.println("Menor");
        }
    }while(!(numeroJugador==numeroAdivinar));
    }
}
