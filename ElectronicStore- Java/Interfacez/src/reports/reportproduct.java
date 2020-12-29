
package reports;

import conexion.Conexion;

import java.awt.Color;
import java.security.Principal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author eloy
 */
public class reportproduct extends javax.swing.JInternalFrame {
  Conexion cc = new Conexion();
    Connection cn = cc.conexion();
     Connection con=null;
  Statement stmt=null;  
    public reportproduct() {
        initComponents();
        cargar();
        Color colorRosa=new Color(188,221,197 );
         this.getContentPane().setBackground(colorRosa);
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
        Logger.getLogger(reportproduct.class.getName()).log(Level.SEVERE, null, ex);
    }
       this.jTable1.setModel(modelo);
jLabel2.setText(""+jTable1.getRowCount()); 
  
  }/* */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("products"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(233, 224, 107));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 418, 257));

        jLabel1.setText("Total Result");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 27, -1, -1));

        jLabel2.setEnabled(false);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 27, 68, 14));

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);
        jPanel1.getAccessibleContext().setAccessibleName("Products");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
