/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Random;


public class Persona {
    private String _strNombre;
    private int _intEdad;
    private String _strRFC;
    private char _chrSexo=Sexo;
    static final char Sexo='H';
    private double _dblPeso;
    private double _dblAltura;
    public Persona(){}

    public Persona(String _strNombre, int _intEdad, char _chrSexo) {
        this._strNombre = _strNombre;
        this._intEdad = _intEdad;
        this._chrSexo = _chrSexo;
       
    }

    public Persona(String _strNombre, int _intEdad, String _strRFC, double _dblPeso, double _dblAltura) {
        this._strNombre = _strNombre;
        this._intEdad = _intEdad;
        this._strRFC = _strRFC;
        this._dblPeso = _dblPeso;
        this._dblAltura = _dblAltura;
    }
    
   
    
    
    public String getStrNombre() {
        return _strNombre;
    }

    public void setStrNombre(String _strNombre) {
        this._strNombre = _strNombre;
    }

    public int getIntEdad() {
        return _intEdad;
    }

    public void setIntEdad(int _intEdad) {
        this._intEdad = _intEdad;
    }

    public String getStrRFC() {
        return _strRFC;
    }

    public void setStrRFC(String _strRFC) {
        this._strRFC = _strRFC;
    }

    public char getChrSexo() {
        return _chrSexo;
    }

    public void setChrSexo(char _chrSexo) {
        this._chrSexo = _chrSexo;
    }

    public double getDblPeso() {
        return _dblPeso;
    }

    public void setDblPeso(double _dblPeso) {
        this._dblPeso = _dblPeso;
    }

    public double getDblAltura() {
        return _dblAltura;
    }

    public void setDblAltura(double _dblAltura) {
        this._dblAltura = _dblAltura;
    }
    public double CalcularIMC(double Peso,double Altura){
       double Formula=Peso/(Math.pow(Peso,2));
       return Formula;   
    }
    public boolean esMayorDeEdad(int edad){
        if(edad>=18){
            return true;}
        else return false;
    }
   private void comprobarSexo(char Sexo){
        if(!(Sexo=='H')||!(Sexo== 'M')){
            _chrSexo='H';
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "_strNombre=" + _strNombre + ", _intEdad=" + _intEdad + ", _strRFC=" + _strRFC + ", _chrSexo=" + _chrSexo + ", _dblPeso=" + _dblPeso + ", _dblAltura=" + _dblAltura + '}';
    }
   public String GeneraRFC(){
       
       Random r= new Random();
     int NumerosRandom= r.nextInt(27);
       for(int i=0;i<=27;i++){
           if(i<=4)
               break; 
       }
       return this._strRFC;
   }
}
