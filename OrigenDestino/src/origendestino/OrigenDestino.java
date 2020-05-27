/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package origendestino;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
/**
 *
 * @author fernando
 */
public class OrigenDestino extends JPanel implements Serializable,ActionListener{

private DefaultComboBoxModel modelO; 
private DefaultComboBoxModel modelD; 

public OrigenDestino(){
    modelO= new DefaultComboBoxModel();
    modelD= new DefaultComboBoxModel();
    JComboBox origen = new JComboBox(modelO);
    JComboBox destino = new JComboBox(modelD);
    add(origen);
    add(destino);
    origen.addActionListener(this);
}    
public void setCiudades(String c []){
    for (int i = 0; i <c.length; i++) {
        modelO.addElement(c[i]);
    }
}
public String getOrigen(){
    return (String)modelO.getSelectedItem();
}
public String getDestino(){
    return (String)modelD.getSelectedItem();
}
public void actionPerformed(ActionEvent e){
    modelD.removeAllElements();
    for (int i = 0; i < modelO.getSize(); i++) {
        if(!modelO.getElementAt(i).equals(modelO.getSelectedItem())){
            modelD.addElement(modelO.getElementAt(i));
        }
    }
}
}
