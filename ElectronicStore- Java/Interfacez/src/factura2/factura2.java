
package factura2;

import factura.*;
import factura2.*;
import conexion.Conexion;
import static empleado.empleado.jDesktopPane2;
import static home.home.jDesktopPane1;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;



public class factura2 extends javax.swing.JInternalFrame {
Connection con=null;
  Statement stmt=null;    
  
   CallableStatement cts=null;
   ResultSet rs=null;
   String sql=null;
   
  
    public factura2() throws SQLException {
        initComponents();
        datas();
            Color colorRosa=new Color(188,221,197 );
         this.getContentPane().setBackground(colorRosa);
  
          Calendar cal=Calendar.getInstance();
    String fecha=cal.get(Calendar.DATE)+"/"+cal.get(Calendar.MONTH)+"/"+cal.get(cal.YEAR);
    this.date.setText(fecha);
    num();
    }
   public void num(){
       String k="";
       int x;
       String z="";
      
       String sql="SELECT MAX(id_invoice) AS id_invoice FROM addinv";
       
       try{
        
         stmt=cn.createStatement();
       rs=stmt.executeQuery(sql);
    
       if (rs.next()){
         
          k=rs.getString("id_invoice");
             x=Integer.parseInt(k);
             x=x+1;
           z=String.valueOf(x);
      // c=rs.getString("id_invoice");
          System.out.println(x);
          
             }
       if(k==null){
           jTextField4.setText("1");
       }else{
           // jTextField4.setText(rs.getString(1));
              jTextField4.setText(z);
       }
       }catch (Exception e){} 
              }
   
             
public static void ajustarcolumnas(){
     TableColumn columna =null;
     for(int i=0;i<=4;i++){
         columna=jtableDetalle.getColumnModel().getColumn(i);
         if(i==0){
             columna.setPreferredWidth(6);
            
         }
         else if(i==1){
              columna.setPreferredWidth(250);
         }
          else if(i==2){
              columna.setPreferredWidth(20);
         }
         else {
            columna.setPreferredWidth(40); 
         }
     } 
 }
public void datas(){
       
   for(int i=0;i<jtableDetalle.getRowCount();i++){
        String num=jTextField4.getText();
          String a= jtableDetalle.getValueAt(i, 1).toString();
        String cuan=jtableDetalle.getValueAt(i , 2).toString(); 
    String tot=total1.getText();
       
   //
   
    ticket.kkk.setText(a);  
    ticket.quantity.setText(cuan); 
      
      ticket.sell.setText(num);
       ticket.total.setText(tot);
   
      
   }
this.dispose();
}
public void store() throws SQLException{
    String k="";
       int x;
       int d;
       int f;
       String z="";
     for(int i=0;i<jtableDetalle.getRowCount();i++){
        
        String codpro=jtableDetalle.getValueAt(i,0).toString();
        String cant=jtableDetalle.getValueAt(i,2).toString();
 
       
       String sql="SELECT stock from productos WHERE id_product='"+codpro+"'";
 try{
          Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        if(rs.equals(0)){
            javax.swing.JOptionPane.showMessageDialog(this,"There aren't products! \n","NOTICE!",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }else{
        
        
          
        
        while (rs.next()){
        k=rs.getString("stock");
        d=Integer.parseInt(cant);
        x=Integer.parseInt(k);
        
        f=x-d;
        if(x<d){
             javax.swing.JOptionPane.showMessageDialog(this,"It´s imposible, products insuficient! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
          z=String.valueOf(f);
          stmt = cn.createStatement(); 
          stmt.executeUpdate("UPDATE productos SET stock='"+z+"' WHERE id_product='"+codpro+"'");
            System.out.println(z);
        }} }

       }catch (Exception e){}    
         
    
     }
}
public void ticket(){
     try{
       
      ticket2 l=new ticket2();
       jDesktopPane2.add(l);
        l.show();
        l.setLocation(100, 195);
    }catch(Exception e){}
}
public void search1(){
      try {
         // TODO add your handling code here:
         buscarproduct3 v= new buscarproduct3();
         
         jDesktopPane2.add(v);
         v.toFront();
         v.setLocation(50,10);
         v.setVisible(true);
     } catch (SQLException ex) {
         Logger.getLogger(factura2.class.getName()).log(Level.SEVERE, null, ex);
     }
}
public void search2(){
     buscaCliente2 q=new buscaCliente2();
        jDesktopPane2.add(q);
        q.toFront();
        q.setLocation(50,10);
        q.setVisible(true);
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Pay = new javax.swing.JLabel();
        total1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableDetalle = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setClosable(true);
        setIconifiable(true);
        setFont(new java.awt.Font("Agency FB", 1, 10)); // NOI18N

        jLabel4.setText("Store Name");

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bill");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Address");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Fecha:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Cod.Client:");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("TICKET NUMBER");

        jLabel13.setText("N°:");

        jTextField4.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel13)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Pay.setText("Total");

        total1.setEditable(false);

        jLabel25.setText("Subtotal:");

        subtotal.setEditable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pay)
                    .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtableDetalle.setBackground(new java.awt.Color(233, 224, 107));
        jtableDetalle.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 255)));
        jtableDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPTION", "QUANTITY", "PRICE", "PRICE VENTA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtableDetalle);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/kk.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setText("Telefonos:      //  ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Name");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Search).jpg"))); // NOI18N
        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Address");

        name.setForeground(new java.awt.Color(0, 153, 153));
        name.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        id.setForeground(new java.awt.Color(0, 153, 153));
        id.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        address.setForeground(new java.awt.Color(0, 153, 153));
        address.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        date.setForeground(new java.awt.Color(0, 153, 153));
        date.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Products");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Search).jpg"))); // NOI18N
        jButton2.setText("SEARCH...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Save).jpg"))); // NOI18N
        jButton5.setText("DO SELL___");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User delete).jpg"))); // NOI18N
        jButton4.setText("DELETE PRODUCT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Delete).jpg"))); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("CALCULATE OPERATION");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(32, 32, 32)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton3, jButton4, jButton5, jButton6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(jButton1))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton3, jButton4, jButton5, jButton6});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   search1();
        
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       search2();
    }//GEN-LAST:event_jButton1ActionPerformed
private void agregarfactura() throws InstantiationException{
       
        String cadena2,cadena3,cadena4,cadena5,cadena6,cadena7;
        cadena2 = date.getText();
        cadena3 = id.getText();
        cadena4 = subtotal.getText();
       
        cadena7 = total1.getText();
        
         String k="";
            int x;
       int d;
       int f;
       String z="";
     for(int i=0;i<jtableDetalle.getRowCount();i++){
        
        String codpro=jtableDetalle.getValueAt(i,0).toString();
        String cant=jtableDetalle.getValueAt(i,2).toString();
 
       
       String sql="SELECT stock from productos WHERE id_product='"+codpro+"'";
        
        try{
            
         Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
         while (rs.next()){
        k=rs.getString("stock");
        d=Integer.parseInt(cant);
        x=Integer.parseInt(k);
        
        if(x<=0 || d==0 ){
            javax.swing.JOptionPane.showMessageDialog(this,"There aren't products! \n","!",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }else{
        
        
          
        
       /* while (rs.next()){
        k=rs.getString("stock");
        d=Integer.parseInt(cant);
        x=Integer.parseInt(k);*/
        
        f=x-d;
        if(x<d){
             javax.swing.JOptionPane.showMessageDialog(this,"It´s imposible, products insuficient! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
          z=String.valueOf(f);
          stmt = cn.createStatement(); 
        //  stmt.executeUpdate("UPDATE productos SET stock='"+z+"' WHERE product_id='"+codpro+"'");
            System.out.println(z);   }}}
           }catch (Exception e){}
     }
     try{
         
//           
String url="jdbc:mysql://localhost:3306/electronic_1st";
String user="root";
String pass="";
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
             con = DriverManager.getConnection(url,user,pass); 
             if ( con != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
  
         stmt = con.createStatement(); 
          stmt.executeUpdate("INSERT INTO addinv VALUES('" + 0 + "','"+cadena2+"','"+cadena3+"','"+cadena4+"','"+cadena7+"')");
          System.out.println("Los valores han sido agregados a la base de datos ");
          javax.swing.JOptionPane.showMessageDialog(this,"Register Done! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
              
         
     
            
        } catch (ClassNotFoundException ex) {
           Logger.getLogger(factura2.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           Logger.getLogger(factura2.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
        Logger.getLogger(factura2.class.getName()).log(Level.SEVERE, null, ex);
    }
        finally {
            if (con != null) {
                try {
                    con.close();
                    stmt.close();
                } catch ( Exception e ) { 
                         System.out.println( e.getMessage());
                }
            }
        
        }
         //javax.swing.JOptionPane.showMessageDialog(this,"Register Done! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
     
       
        
}
private void agregarDETALLEfactura(){
     for(int i=0;i<jtableDetalle.getRowCount();i++){
         String nfac=jTextField4.getText();
        String codpro=jtableDetalle.getValueAt(i,0).toString();
        String prod=jtableDetalle.getValueAt(i,1).toString();
        String cant=jtableDetalle.getValueAt(i,2).toString();
        String pre_u=jtableDetalle.getValueAt(i,3).toString();
        String pre_v=jtableDetalle.getValueAt(i,4).toString();
        String k="";
            int x;
       int d;
       int f;
       String z="";
          String sql="SELECT stock from productos WHERE id_product='"+codpro+"'";
       
          try{
                Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        if(rs.equals(0)){
      //      javax.swing.JOptionPane.showMessageDialog(this,"There aren't products! \n","!",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }else{
        
        
          
        
        while (rs.next()){
        k=rs.getString("stock");
        d=Integer.parseInt(cant);
        x=Integer.parseInt(k);
        
        f=x-d;
        if(x<=d || d==0){
            // javax.swing.JOptionPane.showMessageDialog(this,"It´s imposible, products insuficient! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
          z=String.valueOf(f);
          stmt = cn.createStatement(); 
        //  stmt.executeUpdate("UPDATE productos SET stock='"+z+"' WHERE product_id='"+codpro+"'");
            System.out.println(z);
            
//            String url="jdbc:mysql://sql12.freesqldatabase.com:3306/sql12221227";
//            String user="sql12221227";
//            String pass= "w4iMpnC4kL";
String url="jdbc:mysql://localhost:3306/electronic_1st";
String user="root";
String pass="";
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
             con = DriverManager.getConnection(url,user,pass); 
             if ( con != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
  
         stmt = con.createStatement(); 
          stmt.executeUpdate("INSERT INTO detinv VALUES('" + 0 + "','"+nfac+"','"+codpro+"','"+prod+"','"+cant+"','"+pre_u+"','"+pre_v+"')");
          System.out.println("Los valores han sido agregados a la base de datos ");
      
        }}}
        } catch (ClassNotFoundException ex) {
           Logger.getLogger(factura2.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           Logger.getLogger(factura2.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
        Logger.getLogger(factura2.class.getName()).log(Level.SEVERE, null, ex);
    }    catch (InstantiationException ex) {
             Logger.getLogger(factura2.class.getName()).log(Level.SEVERE, null, ex);
         }
        finally {
            if (con != null) {
                try {
                    con.close();
                    stmt.close();
                } catch ( Exception e ) { 
                         System.out.println( e.getMessage());
                }
            }
            
        }
        // javax.swing.JOptionPane.showMessageDialog(this,"Register Done! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
       
     }
          ticket();
}
public void botones(){
    this.name.setText("");
    
    this.id.setText("");
    this.address.setText("");
    this.date.setText("");
    
   
   
    
}

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    try {
        // TODO add your handling code here:
        agregarfactura();
        store();
    } catch (InstantiationException ex) {
        Logger.getLogger(factura2.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(factura2.class.getName()).log(Level.SEVERE, null, ex);
    }
      agregarDETALLEfactura();
      
      botones();
      datas();

      
    

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel modelo = (DefaultTableModel) jtableDetalle.getModel();
        //obtenemos la fila selccionada
        int fila_select = jtableDetalle.getSelectedRow();
        
        if(fila_select<0){
            // no se puede eliminar
            JOptionPane.showMessageDialog(this,"Table empty or haven´t selected one row.");
        }else {
          // la eliminamos del modelo:
        modelo.removeRow(fila_select);
        }

        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
             int opcion=JOptionPane.showConfirmDialog(null,"Are you sure to exit","confirm",JOptionPane.YES_NO_OPTION);
if(opcion==JOptionPane.YES_NO_OPTION){
this.dispose();

}


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
         double suma=0.0;
         double subtot=0.0;
         double des=0.0;
         double igv=0.0;
         double total=0.0;
             for(int i=0;i<jtableDetalle.getRowCount();i++){
            String precio= jtableDetalle.getValueAt(i, 3).toString();
          String cantidad=jtableDetalle.getValueAt(i , 2).toString();
          int c=Integer.parseInt(cantidad);
          double p=Double.parseDouble(precio);
          suma=c*p;
             subtot+=suma;    
             des=(subtot*0.1)/100;
             igv=(subtot*16)/100;
             total=subtot;
            jtableDetalle.setValueAt(suma, i, 4);
             subtotal.setText(""+subtot);
            
             total1.setText(""+total);             
             
         }
         
         
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pay;
    public static javax.swing.JLabel address;
    private javax.swing.JLabel date;
    public static javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    public static javax.swing.JTable jtableDetalle;
    public static javax.swing.JLabel name;
    public static javax.swing.JTextField subtotal;
    private javax.swing.JTextField total1;
    // End of variables declaration//GEN-END:variables
 Conexion cc = new Conexion();
    Connection cn = cc.conexion();
}
