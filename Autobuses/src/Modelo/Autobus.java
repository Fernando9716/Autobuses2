/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author fernando
 */
public class Autobus {
    private int idClase;
    private String nombre;
    private int numAsiento;
    
    public Autobus(int idClase,String nombre, int numAsiento){
        this.idClase = idClase;
        this.nombre = nombre;
        this.numAsiento = numAsiento;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getNumAsiento(){
        return numAsiento;
    }
}
