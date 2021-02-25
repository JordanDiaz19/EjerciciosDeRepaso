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
public class NumerosIguales {
    public static void main(String[]args){
        
        double num1, num2;
    
        Scanner entrada= new Scanner(System.in);
        System.out.println("Capture numero 1");
        num1= entrada.nextDouble();
        System.out.println("Capture numero 2");
        num2= entrada.nextDouble();
        if(num1==num2){
            System.out.println("los numeros son iguales");
        }
        else{
            System.out.println("Los numeros Son diferentes");
        }
    }
}
