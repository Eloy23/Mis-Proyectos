/*
 * To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package queries;

import conexion.Conexion;
import static home.home.jDesktopPane1;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static queries.Image.imagell;


/**
 *
 * @author eloy
 */
public class queryproduct extends javax.swing.JInternalFrame {
   Conexion cc = new Conexion();
    Connection cn = cc.conexion();
     Connection con=null;
  Statement stmt=null;  
   
    public queryproduct() {
        initComponents();
         Color colorRosa=new Color(188,221,197 );
         this.getContentPane().setBackground(colorRosa);
               jTextField1.setEnabled(false);
       
               cargar();
    }
     public void oha1(){
        int cod= queryproduct.jTable1.getSelectedRow();
        String id= queryproduct.jTable1.getValueAt(cod,0).toString();
        
        
         String   sql="SELECT * FROM productos WHERE id_product='"+id+"'";
        try {
          Statement  st = cn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            FileInputStream archivofoto;

            if (rs.next()) 
               
           
         
                
                Image.xl.setText(rs.getString(2));
                
               
                
               // Image i=null;
                Blob blob=rs.getBlob(7);
                byte[] data=blob.getBytes(1,(int)blob.length());
                BufferedImage img = null;
                try{
                    img= ImageIO.read(new ByteArrayInputStream(data));
                }catch(Exception ex){
                    System.out.println("Error");
                }
                ImageIcon icono;
                 icono = new ImageIcon(img);
                 java.awt.Image h= icono.getImage();
                 java.awt.Image newh = h.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
                 
                 ImageIcon newic = new ImageIcon(newh);
                 
               imagell.setIcon(newic);
                System.out.println(imagell = new JLabel(newic));  
                
//                i=javax.imageio.ImageIO.read(blob.getBinaryStream());
//                ImageIcon image = new ImageIcon(i);
//                this.fotoL.setIcon(image);
                
                  
            
               
           
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
      
      
    }
  private void cargar(){
        
          DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CODE");
        modelo.addColumn("NAME");
        modelo.addColumn("DETAIL");
      
        modelo.addColumn("PRICE");
        modelo.addColumn("STOCK");
      
        jTable1.setModel(modelo);
        String []datos = new String [5];
    try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM productos");
        while(rs.next()){
            datos [0] = rs.getString(1);
            datos [1] = rs.getString(2);
            datos [2] = rs.getString(3);
            datos [3] = rs.getString(4);
            datos [4] = rs.getString(5);

            modelo.addRow(datos);
            jTable1.setModel(modelo);
        }
    } catch (SQLException ex) {
        Logger.getLogger(queryproduct.class.getName()).log(Level.SEVERE, null, ex);
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
        Show = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Products Queries...........");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Search by Detail");
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
                .addContainerGap(286, Short.MAX_VALUE))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        Show.setText("Show");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(Show)))
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
        modelo.addColumn("NAME");
        modelo.addColumn("DETAIL");
        modelo.addColumn("SUPPLIER");
        modelo.addColumn("PRICE");
        modelo.addColumn("STOCK");
        modelo.addColumn("CATEGORY");
        jTable1.setModel(modelo);
        String []datos = new String [7];
    try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM productos WHERE name='"+X+"'");
        while(rs.next()){
            datos [0] = rs.getString(1);
            datos [1] = rs.getString(2);
            datos [2] = rs.getString(3);
            datos [3] = rs.getString(4);
            datos [4] = rs.getString(5);
            datos [5] = rs.getString(6);
            datos [6] = rs.getString(7);
            modelo.addRow(datos);
            jTable1.setModel(modelo);
        }
    } catch (SQLException ex) {
        Logger.getLogger(queryproduct.class.getName()).log(Level.SEVERE, null, ex);
    }
       this.jTable1.setModel(modelo);
jLabel2.setText(""+jTable1.getRowCount());  
    }
    else if(jRadioButton2.isSelected()==true){
    DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CODE");
        modelo.addColumn("NAME");
        modelo.addColumn("DETAIL");
        modelo.addColumn("SUPPLIER");
        modelo.addColumn("PRICE");
        modelo.addColumn("STOCK");
        modelo.addColumn("CATEGORY");
        jTable1.setModel(modelo);
        String []datos = new String [7];
    try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM productos WHERE detail='"+X+"'");
        while(rs.next()){
            datos [0] = rs.getString(1);
            datos [1] = rs.getString(2);
            datos [2] = rs.getString(3);
            datos [3] = rs.getString(4);
            datos [4] = rs.getString(5);
            datos [5] = rs.getString(6);
            datos [6] = rs.getString(7);
            modelo.addRow(datos);
            jTable1.setModel(modelo);
        }
    } catch (SQLException ex) {
        Logger.getLogger(queryproduct.class.getName()).log(Level.SEVERE, null, ex);
    }
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

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        // TODO add your handling code here:
        try{
        Image p=new Image();
       jDesktopPane1.add(p);
        p.show();
        p.setLocation(50, 195);
        oha1();
    }catch(Exception e){}
    }//GEN-LAST:event_ShowActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Show;
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
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
