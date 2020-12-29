/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queries;

import conexion.Conexion;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author eloy
 */
public class queryemployee extends javax.swing.JInternalFrame {
   Conexion cc = new Conexion();
    Connection cn = cc.conexion();
     Connection con=null;
  Statement stmt=null;  
   
    public queryemployee() {
        initComponents();
         Color colorRosa=new Color(188,221,197 );
         this.getContentPane().setBackground(colorRosa);
               jTextField1.setEnabled(false);
       
               cargar();
    }
    
  private void cargar(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CODE");
        modelo.addColumn("LASTNAME");
        modelo.addColumn("NAME");
        modelo.addColumn("GENDER");
        modelo.addColumn("AGE");
        modelo.addColumn("PHONE");
        modelo.addColumn("MAIL");
        modelo.addColumn("ROLL");
        jTable1.setModel(modelo);
        String []datos = new String [8];
    try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM employees");
        while(rs.next()){
            datos [0] = rs.getString(1);
            datos [1] = rs.getString(2);
            datos [2] = rs.getString(3);
            datos [3] = rs.getString(4);
            datos [4] = rs.getString(5);
            datos [5] = rs.getString(6);
            datos [6] = rs.getString(7);
            datos [7] = rs.getString(8);
            modelo.addRow(datos);
            jTable1.setModel(modelo);
        }
    } catch (SQLException ex) {
        Logger.getLogger(queryemployee.class.getName()).log(Level.SEVERE, null, ex);
    }
       this.jTable1.setModel(modelo);
jLabel2.setText(""+jTable1.getRowCount());  
  
  }/* */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Employee Queries...........");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Search by Roll");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Search by Name");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Search).jpg"))); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Show all the register");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setBackground(new java.awt.Color(233, 224, 107));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Quantity of register");

        jLabel2.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(263, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField1.setEnabled(true);
        jTextField1.requestFocus();
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            String X=jTextField1.getText();
                
      if (jRadioButton1.isSelected()==true){
        
   DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CODE");
        modelo.addColumn("LASTNAME");
        modelo.addColumn("NAME");
        modelo.addColumn("GENDER");
        modelo.addColumn("AGE");
        modelo.addColumn("PHONE");
        modelo.addColumn("MAIL");
        modelo.addColumn("ROLL");
        jTable1.setModel(modelo);
        String []datos = new String [8];
    try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM employees WHERE name='"+X+"'");
        while(rs.next()){
            datos [0] = rs.getString(1);
            datos [1] = rs.getString(2);
            datos [2] = rs.getString(3);
            datos [3] = rs.getString(4);
            datos [4] = rs.getString(5);
            datos [5] = rs.getString(6);
            datos [6] = rs.getString(7);
            datos [7] = rs.getString(8);
            modelo.addRow(datos);
            jTable1.setModel(modelo);
        }
    } catch (SQLException ex) {
        Logger.getLogger(queryemployee.class.getName()).log(Level.SEVERE, null, ex);
    }
       this.jTable1.setModel(modelo);
jLabel2.setText(""+jTable1.getRowCount());  
    }
    else if(jRadioButton2.isSelected()==true){
     DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CODE");
        modelo.addColumn("LASTNAME");
        modelo.addColumn("NAME");
        modelo.addColumn("GENDER");
        modelo.addColumn("AGE");
        modelo.addColumn("PHONE");
        modelo.addColumn("MAIL");
        modelo.addColumn("ROLL");
        jTable1.setModel(modelo);
        String []datos = new String [8];
    try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM employees WHERE roll='"+X+"'");
        while(rs.next()){
            datos [0] = rs.getString(1);
            datos [1] = rs.getString(2);
            datos [2] = rs.getString(3);
            datos [3] = rs.getString(4);
            datos [4] = rs.getString(5);
            datos [5] = rs.getString(6);
            datos [6] = rs.getString(7);
            datos [7] = rs.getString(8);
            modelo.addRow(datos);
            jTable1.setModel(modelo);
        }
    } catch (SQLException ex) {
        Logger.getLogger(queryemployee.class.getName()).log(Level.SEVERE, null, ex);
    }
       this.jTable1.setModel(modelo);
jLabel2.setText(""+jTable1.getRowCount());  
    }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField1.setEnabled(true);
        jTextField1.requestFocus();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField1.setEnabled(false);
   cargar();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
