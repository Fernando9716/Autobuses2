/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;


import java.awt.Color;
import java.awt.GridLayout;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author fernando
 */

public class Asientos extends JPanel implements Serializable, ChangeListener {

    private int numeroA;
    private String dist;
   
    private JPanel l;
    private int ocup;
    private ArrayList<JCheckBox> asientos;
    
    public Asientos() {
        this.ocup = 0;
        this.dist = "Horizontal";
        this.numeroA = 12;
        
        this.asientos = new ArrayList<>();
        this.l = new JPanel();
        this.ocup=0;
        this.l.setBackground(Color.WHITE);
        add(this.l);
        
       
    }

    private void Vertical() {
        int filas = numeroA / 4;
        l.setLayout(new GridLayout(filas, 0));
        int r=2;
        
        for (int i = 1; i <= numeroA; i++) {
            JCheckBox temp = new JCheckBox();
            temp.setText("" + i);
            temp.setBackground(Color.WHITE);
            temp.setIcon(new ImageIcon(getClass().getResource("libre.pgn")));
            temp.setBorderPaintedFlat(true);
            temp.addChangeListener(this);
            asientos.add(temp);
            l.add(temp);
            if (i == r) {
               
                    JLabel lab = new JLabel("");
                    lab.setIcon(new ImageIcon(getClass().getResource("pasillo.png")));
                    l.add(lab);
                    r+=4;
            }
        }
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
            if(!asientos.get(i).isEnabled()){
                asientos.get(i).setEnabled(true);
                asientos.get(i).setSelected(false);
            }    
            return bnd;
        }
        return bnd;
    }
    public void setDistribucion(String dis){
        asientos.clear();
        if(l.getComponentCount()>0){
            l.removeAll();        
        }
        if(dis.equalsIgnoreCase("Vertical")||dis.toUpperCase().contains("V")){
            dis="Vertical";
            Vertical();
        } 
        l.repaint();
    }
    
    public void setnumeroA(int numero){
        this.numeroA= numero;
        asientos.clear();
        if (l.getComponentCount()>0){
            l.removeAll();
        }
        else if(dist.equals("Vertical")){
            Vertical();
        }
        l.repaint();
        
    }
    
    public void setAsignar(ArrayList<Integer> r){
        if(r.size()>0 && r.size()<= numeroA && !asientos.isEmpty()){
            for (int i = 0; i < asientos.size(); i++) {
                if(r.contains(Integer.valueOf(Integer.parseInt(asientos.get(i).getText())))){
                    asientos.get(i).setEnabled(false);
                }
                l.repaint();
            }
        }
    }
    public ArrayList<Integer> getSeleccionados(){
     ArrayList<Integer> numero = new ArrayList<Integer>();
        for (int i = 0; i < asientos.size(); i++) {
            if(asientos.get(i).isSelected()&& asientos.get(i).isEnabled()){
                numero.add(Integer.valueOf(Integer.parseInt(asientos.get(i).getText())));
            }
        }
        return numero;
    }
    
    public ArrayList<Integer> getReservados(){
        ArrayList<Integer> reservados = new ArrayList<Integer>();
        for (int i = 0; i <asientos.size(); i++) {
            if (!asientos.get(i).isEnabled()) {
                reservados.add(Integer.valueOf(Integer.parseInt(asientos.get(i).getName())));
            }
       }
        return reservados;
    }
    public int getDisponibles(){
    return numeroA - ocup;
}
    public int getOcupado(){
        return ocup;
    }
      public int getNumeroA (){
        return numeroA;
    }

    public void stateChanged(ChangeEvent ce) {
        JCheckBox asiento = (JCheckBox)ce.getSource();
        if(((JCheckBox)ce.getSource()).isSelected()){
            if(dist.equals("Vertical")){
                asiento.setIcon(new ImageIcon(getClass().getResource("ocupado.png")));
            }
           } else if (dist.equals("Vertical")){
               asiento.setIcon(new ImageIcon(getClass().getResource("disponible.png")));
           }
    }

    

}
