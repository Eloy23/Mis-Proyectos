
package Cobro;

//import cobro.*;
import conexion.Conexion;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author eloy
 */
public final class buscarproduct1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form BuscarArticulos
     */
     Conexion cc = new Conexion();
    Connection cn = cc.conexion();
  
  
   CallableStatement cts;
   ResultSet r;
    public buscarproduct1() throws SQLException {
        initComponents();
     Color colorRosa=new Color(188,221,197 );
         this.getContentPane().setBackground(colorRosa);
       // cargar();
    }
 public void cargar(String value){
    
     DefaultTableModel tabla= new DefaultTableModel();
       
         tabla.addColumn("ID");
       tabla.addColumn("NAME");
       tabla.addColumn("DETAIL");
      
       tabla.addColumn("PRICE");
       tabla.addColumn("STOCK");
      
       
         tb1.setModel(tabla);
        String []datos = new String [4];
       
        String sql="";
        
        if(value.equals("")){
                sql="SELECT * FROM productos";
        }
        else{
        sql="SELECT * FROM productos WHERE name='"+value+"'";
        }    
        
       try{
          Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()){
       Object dato[]=new  Object[5];
       for (int i=0; i<5; i++){
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        busc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        all = new javax.swing.JButton();

        jMenuItem2.setText("Export");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SEARCH PRODUCTS");

        jLabel2.setText("NAME");

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tb1.setBackground(new java.awt.Color(233, 224, 107));
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tb1);

        all.setText("Show All");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(busc, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(all)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(busc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(all))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void Selecionaarticulo(){
       
         DefaultTableModel modelo = (DefaultTableModel) cobro.jtableDetalle.getModel();
        int[] row=tb1.getSelectedRows();
         for(int x= 0; x< row.length; x++){
        String id=tb1.getValueAt(row[x], 0).toString();
         String nom=tb1.getValueAt(row[x], 1).toString();
        String det=tb1.getValueAt(row[x], 2).toString();
         String pre=tb1.getValueAt(row[x], 3).toString();
              
      
       String cod=JOptionPane.showInputDialog("Write the Quantity");
      int a = Integer.parseInt(cod);
      int s = Integer.parseInt(pre);
      int total= a*s;
      String total1= String.valueOf(total);
         int i=0; 
         i=i+1;
         Object[]  dato=new Object[5];
         
            dato[0]=id;
            dato[1]=nom+" "+det;
            dato[2]=cod;
            dato[3]=pre.toString();
            dato[4]=total;
          
            modelo.addRow(dato);
           cobro.jtableDetalle.setModel(modelo);
           cobro.jtableDetalle.editCellAt(row[x], 2);
           cobro.ajustarcolumnas();
            this.dispose();
         }

         
       
 }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*String x=jTextField1.getText();
        DefaultTableModel tabla= new DefaultTableModel();
       try{
        tabla.addColumn("CODIGO");
       tabla.addColumn("PRODUCTO");
       tabla.addColumn("DETALLE");
       tabla.addColumn("PROVEEDOR");
       tabla.addColumn("PRECIO");
       tabla.addColumn("STOCK");
         cts=cn.prepareCall("{call buscarpro(?)}");
            cts.setString(1, x);
            r=cts.executeQuery();
       while (r.next()){
       Object dato[]=new  Object[6];
       for (int i=0; i<6; i++){
           dato[i]=r.getString(i+1);

       }
       tabla.addRow(dato);
       }
       this.jTable1.setModel(tabla);

       }catch (Exception e){}*/
        cargar(busc.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Selecionaarticulo();

   
                
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        // TODO add your handling code here:
        cargar("");
    }//GEN-LAST:event_allActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton all;
    private javax.swing.JTextField busc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
