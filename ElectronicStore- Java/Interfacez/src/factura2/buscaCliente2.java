package factura2;

import factura.*;
import factura2.*;
import clientes.clientes;
import conexion.Conexion;
import static home.home.jDesktopPane1;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eloy
 */
public class buscaCliente2 extends javax.swing.JInternalFrame {
    Conexion cc = new Conexion();
    Connection cn = cc.conexion();

   CallableStatement cts;
   ResultSet r;
    public buscaCliente2() {
        initComponents();
         Color colorRosa=new Color(188,221,197 );
         this.getContentPane().setBackground(colorRosa);
           
//             cargar();
    }
 private void SelecionaCLiente(){
        int row=tb1.getSelectedRow();
        String id=tb1.getValueAt(row, 0).toString();
         String nom=tb1.getValueAt(row, 1).toString();
        String ape=tb1.getValueAt(row, 2).toString();
       // String dni=tb1.getValueAt(row, 4).toString();
         String dir=tb1.getValueAt(row, 6).toString();
         
        factura2.name.setText(ape+""+nom);
       // factura.dni.setText(dni);
        factura2.id.setText(id);
       factura2.address.setText(dir);
        
        this.dispose();
        //jTextField5.setText(id);
        
        
            
           // jTextField1.setText(Clientes.get(tb.getSelectedRows()).get);
        
    }
    
public void cargar(String value){
     
            DefaultTableModel tabla= new DefaultTableModel();
       
         tabla.addColumn("ID");
       tabla.addColumn("NAME");
       tabla.addColumn("LASTNAME");
       tabla.addColumn("GENDER");
      
       tabla.addColumn("TELEFONO");
       tabla.addColumn("E_MAIL");
       tabla.addColumn("ADDRESS");
         tb1.setModel(tabla);
        String []datos = new String [6];
        String sql="";
        
        if(value.equals("")){
                sql="SELECT * FROM clients";
        }
        else{
        sql="SELECT * FROM clients WHERE name='"+value+"'";
        }    
        
       try{
          Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()){
       Object dato[]=new  Object[7];
       for (int i=0; i<7; i++){
           dato[i]=rs.getString(i+1);

       }
       tabla.addRow(dato);
       }
       this.tb1.setModel(tabla);

       }catch (Exception e){}
}   
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        busc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        all = new javax.swing.JButton();

        jMenuItem2.setText("Export");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        tb1.setBackground(new java.awt.Color(233, 224, 107));
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tb1);

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("NAME");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SEARCH CLIENT");

        jButton2.setText("REGISTER NEW CLIENT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        all.setText("All");
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(134, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(busc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(all)
                                .addGap(28, 28, 28)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(179, 179, 179))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(busc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(all))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         /*String cadena1;
         cadena1 = busc.getText();
          String   sql="SELECT * FROM clients WHERE id='"+cadena1+"'";
        try {
            Statement  st = cn.createStatement();
            ResultSet rs= st.executeQuery(sql);

            if(rs.next()){
            JOptionPane.showMessageDialog(this,"Cliente Encontrado!!","Aviso",JOptionPane.INFORMATION_MESSAGE);
           
      
        
           
            }else{

           JOptionPane.showMessageDialog(this,"Cliente  No Encontrado!!","Aviso",JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (Exception e) {JOptionPane.showMessageDialog(this, e.toString());
        }*/
       cargar(busc.getText());
           this.busc.setText(""); 
       
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        clientes cli = new clientes();
        jDesktopPane1.add(cli);
        cli.toFront();
        cli.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        SelecionaCLiente();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        // TODO add your handling code here:
        cargar("");
    }//GEN-LAST:event_allActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton all;
    private javax.swing.JTextField busc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
