/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;


public class Cuenta {
    private String _strTitular;
    private double _dblCantidad;
    public String getStrTitular() {
        return _strTitular;
    }

    public void setStrTitular(String _strTitular) {
        this._strTitular = _strTitular;
    }

    public double getDblCantidad() {
        return _dblCantidad;
    }

    public void setDblCantidad(double _dblCantidad) {
        this._dblCantidad = _dblCantidad;
    }
    
    @Override
    public String toString() {
        return  "Titular: " + _strTitular + " Saldo: " + _dblCantidad;
    }
    public Cuenta(String strTitular,double dblCantidad){
        strTitular=this._strTitular;
        dblCantidad= this._dblCantidad;
    }
    public Cuenta(){
        
    }
   
    public void Ingresar(double Cantidad) throws Exception{
         
        if(Cantidad>0){
             this._dblCantidad+=Cantidad;
        }
        else{  throw new Exception("Cantidad ingresada no valida");
        }
    }
    
    public double Retirar(double Cantidad){
        if((this._dblCantidad - Cantidad)<0){
           return _dblCantidad=0;
            
        }
        else {return _dblCantidad-=Cantidad;}
    }
    
}
