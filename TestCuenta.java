/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import javax.swing.JOptionPane;

public class TestCuenta {
    static double Cantidad=300;
    static double CantidadRetirar=500;
    public static void main(String[] args) throws Exception{
    String nombreCuentaTitular1="Pedro";
    String nombreCuentaTitular2= "Fernando";
    Cuenta cuentaPedro= new Cuenta();
    Cuenta cuentaFernando= new Cuenta();
    cuentaPedro.setStrTitular(nombreCuentaTitular1);
    cuentaPedro.setDblCantidad(Cantidad);
    cuentaFernando.setStrTitular(nombreCuentaTitular2);
    cuentaFernando.setDblCantidad(Cantidad);
    cuentaPedro.Ingresar(Cantidad);
    Cantidad=400;
    cuentaFernando.Ingresar(Cantidad);
    cuentaPedro.Retirar(CantidadRetirar);
    CantidadRetirar=100;
    cuentaFernando.Retirar(CantidadRetirar);
    JOptionPane.showMessageDialog(null,cuentaPedro.toString());
    JOptionPane.showMessageDialog(null,cuentaFernando.toString());
    
    }
}
