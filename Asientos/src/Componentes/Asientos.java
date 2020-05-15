/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import java.awt.GridLayout;
import java.io.Serializable;
import java.util.ArrayList;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author fernando
 */
public class Asientos extends JPanel implements Serializable, ChangeListener {

    private int numeroA;
    private String dist;
    private ArrayList<JCheckBox> asientos;
    private JPanel l;
    private int h = 4;
    private int vehiculo;
    private int ocup;

    public Asientos() {
        this.ocup = 0;
        this.dist = "Horizontal";
        this.numeroA = 20;
        this.vehiculo = Integer.MAX_VALUE;
        this.asientos = new ArrayList<>();
        this.l = new JPanel();
    }

    private void DistribucionHorizontal() {
        int columnas = numeroA / 4;
        l.setLayout(new GridLayout(0, columnas));

        for (int i = 1; i < 4; i++) {
            for (int j = i; j < numeroA; j++) {
                JCheckBox temp = new JCheckBox();
                temp.setIcon(new ImageIcon(getClass().getResource("libre.png")));
                temp.setText("" + j);
                l.add(temp);
                asientos.add(temp);
            }
            if (i == 2) {
                for (int j = 1; j < numeroA; j++) {
                    JLabel p = new JLabel("");
                    p.setIcon(new ImageIcon(getClass().getResource("pasillo.png")));
                    l.add(p);
                }
            }
        }
    }

    private void DistribucionVertical() {
        int filas = numeroA / 4;
        l.setLayout(new GridLayout(0, filas));

        for (int i = 1; i < numeroA; i++) {
            JCheckBox temp = new JCheckBox();
            temp.setIcon(new ImageIcon(getClass().getResource("libre.pgn")));
            temp.setText("" + i);
            l.add(temp);
            asientos.add(temp);
            if (i == 2) {
                for (int j = 1; j < numeroA; j++) {
                    JLabel lab = new JLabel("");
                    lab.setIcon(new ImageIcon(getClass().getResource("pasillo.png")));
                    l.add(lab);
                }
            }
        }
    }
    
    public int getNumeroA (){
        return numeroA;
    }
    
    public void setReservar(){
        int c =0;
        for (int i = 0; i < asientos.size(); i++) {
            if (asientos.get(i).isSelected() && asientos.get(i).isEnabled()) {
                asientos.get(i).setEnabled(false);
            }
            if(!asientos.get(i).isEnabled()){
               c++;
            }
        }
        ocup=c;
        
    }
    
    public boolean setCancelar(int asiento){
        boolean bnd = false;
        for (int i = 0; i < asientos.size() && !bnd; i++) {
            bnd =((JCheckBox)asientos.get(i)).getText().equals(""+numeroA);
        }
    }

    public void stateChanged(ChangeEvent ce) {

    }

}
