/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;
public class Ordenar3 {
    public static void main(String[]args){
     int n1,n2,n3;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Primer nro: ");
        n1=entrada.nextInt();
        System.out.print("Segundo nro: ");
        n2=entrada.nextInt();
        System.out.print("Tercer nro: ");
        n3=entrada.nextInt();
   
        int mayor,menor,central = 0;
     
        //numero mayor
        mayor=n1;
        if(n2>mayor)mayor=n2;
        if(n3>mayor)mayor=n3;
        //numero menor
        menor=n1;
        if(n2<menor)menor=n2;
        if(n3<menor)menor=n3;      
        //numero central
        if(n1>n2 && n1<n3 || n1<n2 && n1>n3 ) central = n1;      
        else if(n2>n1 && n2<n3 || n2<n1 && n2>n3) central = n2;      
        else if(n3>n1 && n3<n2 || n3<n1 && n3>n2) central = n3;      
        else if(n1==n2)central=n1;
        else central=n3;
         
        System.out.println(" Mayor: "+mayor+"\n Central: "+central+"\n Menor : "+menor);
    }  
}
    
      

