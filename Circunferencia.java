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
public class Circunferencia {
    public static void main(String[]args){
        double radio,circunferencia;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Capture el radio");
        radio= entrada.nextDouble();
        circunferencia = 2*radio*Math.PI;
        System.out.println("Circunferencia"+circunferencia);
        
    }
}
