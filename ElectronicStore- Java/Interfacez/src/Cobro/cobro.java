
package Cobro; 

import factura.*;
import conexion.Conexion;
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
import queries.queryproduct;


public final class cobro extends javax.swing.JInternalFrame {
Connection con=null;
  Statement stmt=null;    
  
   CallableStatement cts=null;
   ResultSet rs=null;
   String sql=null;
   
  
    public cobro() throws SQLException {
        initComponents();
  CargarCB();
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
      
       String sql="SELECT MAX(num_sell) AS num_sell FROM sells";
       
       try{
        
         stmt=cn.createStatement();
       rs=stmt.executeQuery(sql);
    
       if (rs.next()){
         
          k=rs.getString("num_sell");
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
            javax.swing.JOptionPane.showMessageDialog(this,"There aren't products! \n","!",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
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
public void CargarCB(){
   Conexion cc = new Conexion();
    Connection cn = cc.conexion();
    String cap="";
        String sql="SELECT * FROM employees";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            employee.removeAllItems();
            employee.addItem("Select..");
          
            while(rs.next()){
                 employee.addItem(rs.getString("name"));
            }
    
    
}    catch (SQLException ex) {   
         Logger.getLogger(cobro.class.getName()).log(Level.SEVERE, null, ex);
     }   
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableDetalle = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        employee = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setClosable(true);
        setIconifiable(true);
        setFont(new java.awt.Font("Agency FB", 1, 10)); // NOI18N

        jLabel4.setText("Store Name:");

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SELL PRODUCT");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Date");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("SELL NUMBER");

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

        Pay.setText("Total for Pay:");

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

        jTextField1.setEnabled(false);

        jLabel8.setText("Change");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(Pay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Pay)
                        .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE))
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

        jLabel5.setText("PHONES:      //  ");

        jLabel3.setText("ADDRESS");

        date.setForeground(new java.awt.Color(0, 153, 153));
        date.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Products");

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Search).jpg"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Save).jpg"))); // NOI18N
        jButton5.setText("DO SELL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User delete).jpg"))); // NOI18N
        jButton4.setText("ELIMINAR ARTICULO");
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

        employee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Employee");

        jButton1.setText("Check Price");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(jButton1)
                                        .addGap(34, 34, 34))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton3, jButton4, jButton5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(Search)
                                    .addComponent(employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton3, jButton4, jButton5});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
     try {
         // TODO add your handling code here:
         buscarproduct1 x= new buscarproduct1();
         
         jDesktopPane1.add(x);
         x.toFront();
         x.setLocation(350, 300);
         x.setVisible(true);
     } catch (SQLException e) {
         Logger.getLogger(cobro.class.getName()).log(Level.SEVERE, null, e);
     }
        
      
    }//GEN-LAST:event_SearchActionPerformed
private void venta() throws InstantiationException{
      
        String cadena2,cadena3,cadena4,cadena5,cadena6,cadena7;
        cadena2 = date.getText();
        
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
 
       
       String sql="SELECT stock from productos WHERE id_product='"+codpro+"'"; //This is a if Sentence for do a selection of products from a table in the database
        
        try{
            
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
         while (rs.next()){
        k=rs.getString("stock");
        d=Integer.parseInt(cant);
        x=Integer.parseInt(k);
        if(x<=0 || d==0){
            javax.swing.JOptionPane.showMessageDialog(this,"There aren't products! \n","!",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }else{
        
        
          
        
       
        
        f=x-d;
        if(x<d){
             javax.swing.JOptionPane.showMessageDialog(this,"It´s imposible, products insuficient! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
          z=String.valueOf(f);
          //stmt = cn.createStatement(); 
         // stmt.executeUpdate("UPDATE productos SET stock='"+z+"' WHERE id_product='"+codpro+"'");
            System.out.println(z);
             }}}
           }catch (Exception e){}
     }
     try{
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
       
          stmt.executeUpdate("INSERT INTO sells VALUES('" + 0 + "','"+cadena2+"','"+cadena4+"','"+cadena7+"')");
          System.out.println("Los valores han sido agregados a la base de datos ");
             javax.swing.JOptionPane.showMessageDialog(this,"Register success! \n","NOTICE!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
      
        } catch (ClassNotFoundException ex) {
           Logger.getLogger(cobro.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           Logger.getLogger(cobro.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
        Logger.getLogger(cobro.class.getName()).log(Level.SEVERE, null, ex);
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
      
        
        
     
}
private void order(){
     for(int i=0;i<jtableDetalle.getRowCount();i++){
         String nfac=jTextField4.getText();
        String codpro=jtableDetalle.getValueAt(i,0).toString();
        String prod=jtableDetalle.getValueAt(i,1).toString();
        String cant=jtableDetalle.getValueAt(i,2).toString();
        String pre_u=jtableDetalle.getValueAt(i,3).toString();
        String pre_v=jtableDetalle.getValueAt(i,4).toString();
        int empl=employee.getSelectedIndex();
       
         String k="";
            int x;
       int d;
       int f;
       String z="";
          String sql="SELECT stock from productos WHERE id_product='"+codpro+"'";
              
          try{
                Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
           while (rs.next()){
        k=rs.getString("stock");
        d=Integer.parseInt(cant);
        x=Integer.parseInt(k);
        
        if(x<=0 || d==0){
            javax.swing.JOptionPane.showMessageDialog(this,"There aren't products! \n","!",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }else{
        
        
          
        
     
        
        f=x-d;
        if(x<d){
            // javax.swing.JOptionPane.showMessageDialog(this,"It´s imposible, products insuficient! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
          z=String.valueOf(f);
         // stmt = cn.createStatement(); 
         // stmt.executeUpdate("UPDATE productos SET stock='"+z+"' WHERE product_id='"+codpro+"'");
            System.out.println(z);
              
//          String url="jdbc:mysql://sql12.freesqldatabase.com:3306/sql12221227";
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
          stmt.executeUpdate("INSERT INTO orders VALUES('" + 0 + "','"+nfac+"','"+codpro+"','"+prod+"','"+cant+"','"+pre_u+"','"+pre_v+"','"+empl+"')");
          System.out.println("Los valores han sido agregados a la base de datos ");
            
        }}}
        } catch (ClassNotFoundException ex) {
           Logger.getLogger(cobro.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           Logger.getLogger(cobro.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
        Logger.getLogger(cobro.class.getName()).log(Level.SEVERE, null, ex);
    }    catch (InstantiationException ex) {
             Logger.getLogger(cobro.class.getName()).log(Level.SEVERE, null, ex);
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
       //  javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
       
     }
}
public void botones(){
  
    
  
    this.date.setText("");
    
   
   
    
}
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
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
             //discount.setText(""+des);
             //iva.setText(""+igv);
             total1.setText(""+total);             
          
             
              String monex= JOptionPane.showInputDialog("Bill");
             
          double oha = Double.parseDouble(monex);
          if(oha>=subtot){
          double change = 0.0; 
                  change= oha - subtot; 
                  String change1 = String.valueOf(change);
                  jTextField1.setText(change1);
                   JOptionPane.showMessageDialog(rootPane, "Your change is "+change1);
          }else{
              JOptionPane.showMessageDialog(rootPane, "insuficient ");
          }
              
         }
        
        try {
        // TODO add your handling code here:
        venta();
        store();
    } catch (InstantiationException ex) {
        Logger.getLogger(cobro.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(cobro.class.getName()).log(Level.SEVERE, null, ex);
    }
      order();
      
      botones();
       
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          try{
        queryproduct p=new queryproduct();
       jDesktopPane1.add(p);
        p.show();
        p.setLocation(350, 300);
    }catch(Exception e){}
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pay;
    private javax.swing.JButton Search;
    private javax.swing.JLabel date;
    private javax.swing.JComboBox<String> employee;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    public static javax.swing.JTable jtableDetalle;
    public static javax.swing.JTextField subtotal;
    private javax.swing.JTextField total1;
    // End of variables declaration//GEN-END:variables
 Conexion cc = new Conexion();
    Connection cn = cc.conexion();

    public void setLocation(float CENTER_ALIGNMENT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
