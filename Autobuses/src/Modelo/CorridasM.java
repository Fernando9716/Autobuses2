/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author fernando
 */
public class CorridasM extends AbstractTableModel{
    private String encabezado[];
    private ArrayList <Corrida>datos;
    
    public CorridasM(String encabezado[],ArrayList<Corrida>datos){
        this.datos=datos;
        this.encabezado=encabezado;
    }
    
    
}
