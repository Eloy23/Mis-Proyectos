
package reports;

import conexion.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author eloy
 */
public class reportinvoice extends javax.swing.JInternalFrame {
  Conexion cc = new Conexion();
    Connection cn = cc.conexion();
     Connection con=null;
  Statement stmt=null;  
  
    public reportinvoice() {
        initComponents();
        cargar();
        Color colorRosa=new Color(188,221,197 );
         this.getContentPane().setBackground(colorRosa);
    }
    private void cargar(){
        
         
      DefaultTableModel tabla= new DefaultTableModel();
       
         tabla.addColumn("ID");
         tabla.addColumn("DATE");
         tabla.addColumn("ID CLIENT");
       tabla.addColumn("SUBTOTAL");
       tabla.addColumn("TOTAL");
         jTable1.setModel(tabla);
        String []datos = new String [4];
       try{
          Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM addinv");
        while (rs.next()){
       Object dato[]=new  Object[5];
       for (int i=0; i<5; i++){
           dato[i]=rs.getString(i+1);

       }
       tabla.addRow(dato);
       }
       this.jTable1.setModel(tabla);

       }catch (Exception e){}
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("invoices"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(233, 224, 107));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 418, 257));

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
