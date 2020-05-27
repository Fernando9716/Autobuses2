/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author fernando
 */
public class Principal extends javax.swing.JFrame {
    private DefaultTableModel modeloPasajeros;
   
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
         RellenarTabla();
         reservar12.setDistribucion("V");
    }
    public void RellenarTabla(){
           tablaCorridas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "Oaxaca", "Nochixtlan", "01/05/2020", "12:50", "Mini", "100", "24"},
                {"1", "Jalapa", "Cuernavaca", "02/05/2020", "13:50", "Primera", "150", "40"},
                {"2", "CDMX",    "Tehuacan",  "03/05/2020", "14:50", "Lujo", "200", "36"},
                {"3", "Puebla", "Nochixtlan", "04/05/2020", "15:50","Mini","250","24"},
                {"4", "Nochixtlan","Cuernavaca", "05/05/2020","16:50","Primera","300","40"}
               ,{"5", "Cuernavaca","Tehucan","06/05/2020","17:50","Lujo","350","36"},
                {"6","Tehuacan","Nochixtlan","07/05/2020","18:50","Mini","400","40"},
                {"7","Oaxaca","Cuernavaca","08/05/2020","19:50","Primera","450","40"},
                {"8","Jalapa", "Tehuacan","09/05/2020","20:50","Lujo","500","36"},
                {"9","CMDX","Nochixtlan","10/05/2020","21:50","Mini","550","24"},
                {"10","Puebla","Cuernavaca","11/05/2020","22:50","Primera","600","40"},
                {"11","Nochixtlan","Tehuacan","12/05/2020","23:50","Lujo","650","46"},
                {"12","Cuernavaca","Nochixtlan","13/05/2020","00:50","Mini","700","24"},
                {"13","Tehucan","Cuernavaca","20/05/2020","02:50","Primera",750,"32"},
                
            },
            new String [] {
                "Num.Corr", "Origen", "Destino", "Fecha", "Hora", "Clase Autobus", "Precio", "Lugares"
            }));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        origenDestino1 = new origendestino.OrigenDestino();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCorridas = new javax.swing.JTable();
        aceptarCorrida = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Continuar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        reservar12 = new Componentes.Asientos();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        generaBoleto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pasaje = new javax.swing.JTable();
        panelBoletos = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Busqueda de corridas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 23, -1, -1));

        jCheckBox1.setText("Todas las corridas");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 212, -1, -1));

        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 258, -1, -1));

        jLabel1.setText("Origen");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, 20));

        jLabel3.setText("Destino");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jLabel4.setText("Fecha");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 207, -1, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 207, 197, -1));

        origenDestino1.setCiudades(new String[] {"Oaxaca", "Jalapa", "Nochixtlan", "Cuernavaca", "CDMX", "Tehuacan", "Puebla"});
        origenDestino1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                origenDestino1KeyTyped(evt);
            }
        });
        jPanel1.add(origenDestino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 254, -1));

        jTabbedPane4.addTab("Inicio", jPanel1);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Corridas disponibles");

        tablaCorridas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaCorridas);

        aceptarCorrida.setText("Aceptar");
        aceptarCorrida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarCorridaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(aceptarCorrida)))
                .addContainerGap(427, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aceptarCorrida)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Corridas", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Continuar.setText("Continuar");
        Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuarActionPerformed(evt);
            }
        });
        jPanel3.add(Continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Selecciona Tus Asientos");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 6, -1, -1));
        jPanel3.add(reservar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 660, 350));

        jTabbedPane4.addTab("Reserva", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("Asigna el Pasaje");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 6, -1, -1));

        generaBoleto.setText("Continuar");
        generaBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generaBoletoActionPerformed(evt);
            }
        });
        jPanel4.add(generaBoleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, -1));

        pasaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(pasaje);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 390, 230));

        jTabbedPane4.addTab("Asignar pasaje", jPanel4);

        javax.swing.GroupLayout panelBoletosLayout = new javax.swing.GroupLayout(panelBoletos);
        panelBoletos.setLayout(panelBoletosLayout);
        panelBoletosLayout.setHorizontalGroup(
            panelBoletosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
        );
        panelBoletosLayout.setVerticalGroup(
            panelBoletosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Boleto", panelBoletos);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Cancelar", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarCorridaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarCorridaActionPerformed
       int i = tablaCorridas.getSelectedRow();
       int asientos = Integer.parseInt(tablaCorridas.getValueAt(i, 7).toString());
       reservar12.setnumeroA(asientos);
       reservar12.setVisible(true);
        System.out.println(asientos);
    }//GEN-LAST:event_aceptarCorridaActionPerformed
    private JComboBox TipoCombo(){
        JComboBox combo = new JComboBox((Object[])new String[] {"Adulto","Tercera edad", "Niño"}){
          public void updateUI(){
              super.updateUI();
              setBorder(BorderFactory.createEmptyBorder());
              setUI (new BasicComboBoxUI(){
                  protected JButton createArrowButton(){
                      JButton button = super.createArrowButton();
                      button.setContentAreaFilled(false);
                      button.setBorder(BorderFactory.createEmptyBorder());
                      return button;
                  }
              });
          }
        };
        return combo;
    }
    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
       ArrayList<Integer> asientos = reservar12.getSeleccionados();
       int numero = asientos.size();
       JComboBox combo = TipoCombo();
       String titulos[]={"Asiento","Nombre pasajero","Tipo de pasajero"};
       Object datos [][]=new Object [numero][3];
       //modeloPasajeros = new DefaultTableModel(datos,titulos);
        for (int i = 0; i <numero; i++) {
            datos[i][0]=asientos.get(i);
            datos[i][1]=new String("");
            datos[i][2]=new String("Adulto");
        }
       modeloPasajeros = new DefaultTableModel(datos,titulos);
       pasaje.setModel(modeloPasajeros);
       TableColumn columna = pasaje.getColumnModel().getColumn(2);
       columna.setCellEditor(new DefaultCellEditor(combo));
    }//GEN-LAST:event_ContinuarActionPerformed

    private void generaBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generaBoletoActionPerformed
       panelBoletos.setLayout(new GridLayout(0,2));
       int numeroBoletos = modeloPasajeros.getRowCount();
       JTextArea[] boleto= new JTextArea[numeroBoletos];
       int cont = tablaCorridas.getSelectedRow();
       
       if(panelBoletos.getComponentCount()>0){
           panelBoletos.removeAll();
       }
        for (int i = 0; i < numeroBoletos; i++) {
            boleto[i]=new JTextArea();
            boleto[i].append("ID corrida "+ tablaCorridas.getValueAt(cont, 0) + "\n");
            boleto[i].append("Nombre " + pasaje.getValueAt(i, 1) + "\n" );
            boleto[i].append("Viaje " + tablaCorridas.getValueAt(cont, 1)+"->"+tablaCorridas.getValueAt(cont, 2)+ "\n");
            boleto[i].append("Numero de asiento " + pasaje.getValueAt(i, 0)+ "\n" );
            boleto[i].append("Tipo de pasajero " + pasaje.getValueAt(i, 2)+ "\n");
            boleto[i].append("Fecha " + tablaCorridas.getValueAt(cont, 3)+ "\n");
            boleto[i].append("Hora " + tablaCorridas.getValueAt(cont, 4)+ "\n");
            boleto[i].append("Precio " + tablaCorridas.getValueAt(cont, 6));
            panelBoletos.add(boleto[i]);
        }
       
    }//GEN-LAST:event_generaBoletoActionPerformed
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
    }//GEN-LAST:event_jButton1ActionPerformed
private void origenDestino1ItemStateChanged(java.awt.event.ItemEvent evt){
    String q = origenDestino1.getOrigen().toString();
    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel> (modeloPasajeros);
    tablaCorridas.setRowSorter(tr);
    
    if(q !=" "){
        tr.setRowFilter(RowFilter.regexFilter(q));
    } else {
        tablaCorridas.setRowSorter(tr);
    }
}
    private void origenDestino1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_origenDestino1KeyTyped
       
    }//GEN-LAST:event_origenDestino1KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continuar;
    private javax.swing.JButton aceptarCorrida;
    private javax.swing.JButton generaBoleto;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private origendestino.OrigenDestino origenDestino1;
    private javax.swing.JPanel panelBoletos;
    private javax.swing.JTable pasaje;
    private Componentes.Asientos reservar12;
    private javax.swing.JTable tablaCorridas;
    // End of variables declaration//GEN-END:variables
}
