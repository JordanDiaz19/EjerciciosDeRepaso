/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;
/**
 *
 * @author jorda
 */
public class Radio {
    public static void main(String[]args){
    
        double radio,area;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Capture el radio del circulo");
        radio = entrada.nextDouble();
        area = Math.PI*Math.pow(radio,2);
        System.out.println("El area del circulo es:" + area);
        
       
    }
}
