/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

public class Alreves {
    public static void main(String[]args){
    int num=0;
    int dmillar,umillar,centenas,decenas=0,unidades;
    Scanner entrada= new Scanner(System.in);
    System.out.println("Introduzca un numero entre 0 y 9.999");
    num= entrada.nextInt();
    
     unidades = num % 10;
     num = num / 10;
     
     dmillar= num % 10;
     num = num / 10;
    
     centenas = num % 10;
     num = num / 10;
    
     umillar = num % 10;
     num = num / 10;
     
     dmillar = num;
     
     System.out.println (unidades + " " + dmillar + " " + centenas + " " + umillar + " " + dmillar);
     
     
     }

    }

