package clientes;
import conexion.Conexion;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class clientes extends javax.swing.JInternalFrame {
   CallableStatement cts;
   ResultSet r;
    Connection con=null;
  Statement stmt=null; 

    public clientes() {
        initComponents();
          Color colorRosa=new Color(188,221,197 );
         this.getContentPane().setBackground(colorRosa);
        cargar();   
        DESABILITAR();
        BOTONES();
            }
public void cargar(){
        
         DefaultTableModel tabla= new DefaultTableModel();
       
         tabla.addColumn("ID");
       tabla.addColumn("NAME");
       tabla.addColumn("LASTNAME");
       tabla.addColumn("GENDER");
      
       tabla.addColumn("TELEFONO");
       tabla.addColumn("E_MAIL");
       tabla.addColumn("ADDRESS");
         tbclient.setModel(tabla);
        String []datos = new String [6];
       try{
          Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM clients");
        while (rs.next()){
       Object dato[]=new  Object[7];
       for (int i=0; i<7; i++){
           dato[i]=rs.getString(i+1);

       }
       tabla.addRow(dato);
       }
       this.tbclient.setModel(tabla);

       }catch (Exception e){}
}
   public boolean isEmail(String mail){
      Pattern pat = null;
Matcher mat = null;
pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
mat = pat.matcher(mail);
if (mat.find()) {
System.out.println("[" + mat.group() + "]");
return true;
}else{
return false;
}
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox();
        phone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbclient = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Clients Maintenance");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clients Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 0, 255))); // NOI18N

        jLabel1.setText("ID");

        jLabel2.setText("Name:");

        jLabel3.setText("Lastname:");

        jLabel4.setText("Gender");

        jLabel6.setText("Telephone:");

        jLabel7.setText("E_mail:");

        id.setEnabled(false);
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastnameKeyTyped(evt);
            }
        });

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "M", "F" }));

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneKeyTyped(evt);
            }
        });

        jLabel9.setText("Address");

        mail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mailFocusLost(evt);
            }
        });
        mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mailKeyTyped(evt);
            }
        });

        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addressKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(mail))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(address))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(22, 22, 22)
                                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(178, 178, 178)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Search).jpg"))); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Save).jpg"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User edit).jpg"))); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Delete).jpg"))); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User delete).jpg"))); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wzdelete.jpg"))); // NOI18N
        jButton7.setText("Cancel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User add).jpg"))); // NOI18N
        jButton2.setText("New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addGap(5, 5, 5))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7});

        tbclient.setBackground(new java.awt.Color(233, 224, 107));
        tbclient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbclient);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       
    String cadena2,cadena3,cadena4,cadena5,cadena6,cadena7,cadena8;
   
        cadena2 = name.getText();
        cadena3 = lastname.getText();
        cadena4 = gender.getSelectedItem().toString();
      
        cadena6 = phone.getText();
        cadena7 = mail.getText();
        cadena8 = address.getText();
       

        if (name.getText().equals("") || (lastname.getText().equals("")) || (gender.getSelectedItem().equals(""))
            || (phone.getText().equals("")) || (mail.getText().equals("")) || (address.getText().equals(""))) {
                   // if(  mail.getText().length()>=30)evt.consume();

            javax.swing.JOptionPane.showMessageDialog(this,"You must to write on all the fields \n","NOTICE!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            name.requestFocus();
        }
         else{
            try{
        
//             String url="jdbc:mysql://sql12.freesqldatabase.com:3306/sql12221227";
//            String usuario="sql12221227";
//            String contraseña= "w4iMpnC4kL";
String url="jdbc:mysql://localhost:3306/electronic_1st";
String usuario="root";
String contraseña="";
            
             Class.forName("com.mysql.jdbc.Driver").newInstance(); 
             cn = DriverManager.getConnection(url,usuario,contraseña); 
             if ( cn != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
  
                  stmt = cn.createStatement(); 
          stmt.executeUpdate("INSERT INTO clients VALUES('" + 0 + "','"+cadena2+"','"+cadena3+"','"+cadena4+"','"+cadena6+"','"+cadena7+"','"+cadena8+"')");
          System.out.println("Los valores han sido agregados a la base de datos ");
          cargar();
           BOTONES();
            DESABILITAR();
            limpiar();
          
         } catch (SQLException ex) {
                Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
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
         javax.swing.JOptionPane.showMessageDialog(this,"Register Done! \n","NOTICE!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
   
       
        /*this.password.setText("");
        this.nick.setText("");*/
         

       
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      /*  limpiar();
         try{
        
         cts=cn.prepareCall("{call Genera_num_CLIENTES}");
       r=cts.executeQuery();
       if (r.next())
        
          id.setText(r.getString(1));
            }catch (Exception e){} 
         ABILITAR();*/
       ABILITAR();
         this.jButton1.setEnabled(true);
           this.jButton2.setEnabled(false);
           this.jButton3.setEnabled(false);
           this.jButton4.setEnabled(false);
           this.jButton5.setEnabled(false);
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      
        String cod=JOptionPane.showInputDialog("Write the id of the client");
          String   sql="SELECT * FROM clients WHERE id='"+cod+"'";
        try {
            Statement  st = cn.createStatement();
            ResultSet rs= st.executeQuery(sql);

            if(rs.next()){
            JOptionPane.showMessageDialog(this,"Client  Found!!","NOTICE",JOptionPane.INFORMATION_MESSAGE);
            this.id.setText(rs.getString(1));
            this.name.setText(rs.getString(2));
            this.lastname.setText(rs.getString(3));
            this.gender.setSelectedItem(rs.getString(4).toString());
            
            this.phone.setText(rs.getString(5));
            this.mail.setText(rs.getString(6));
            this.address.setText(rs.getString(7));
         ABILITAR();
         this.jButton1.setEnabled(false);
           this.jButton2.setEnabled(false);
           this.jButton3.setEnabled(false);
           this.jButton4.setEnabled(true);
           this.jButton5.setEnabled(true);
            }else{

           JOptionPane.showMessageDialog(this,"Client  No Encontrado!!","Aviso",JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (Exception e) {JOptionPane.showMessageDialog(this, e.toString());
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
     String cadena1,cadena2,cadena3,cadena4,cadena5,cadena6,cadena7,cadena8;
       
         cadena1 =id.getText();
        cadena2 = name.getText();
        cadena3 = lastname.getText();
        cadena4 = gender.getSelectedItem().toString();
      
        cadena6 = phone.getText();
        cadena7 = mail.getText();
        cadena8 = address.getText();
       

        if (name.getText().equals("") || (lastname.getText().equals("")) || (gender.getSelectedItem().equals(""))
            || (phone.getText().equals("")) || (mail.getText().equals("")) || (address.getText().equals(""))) {
                   // if(  mail.getText().length()>=30)evt.consume();

            javax.swing.JOptionPane.showMessageDialog(this,"Write on all the fields \n","NOTICE!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            name.requestFocus();
        }
         else{
            try{
        
//              String url="jdbc:mysql://sql12.freesqldatabase.com:3306/sql12221227";
//            String usuario="sql12221227";
//            String contraseña= "w4iMpnC4kL";
String url="jdbc:mysql://localhost:3306/electronic_1st";
String usuario="root";
String contraseña="";
            
             Class.forName("com.mysql.jdbc.Driver").newInstance(); 
             cn = DriverManager.getConnection(url,usuario,contraseña); 
             if ( cn != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
  
                  stmt = cn.createStatement(); 
                  stmt.executeUpdate("UPDATE clients SET name='"+cadena2+"', lastname='"+cadena3+"',gender='"+cadena4+"', phone='"+cadena6+"', mail='"+cadena7+"', address='"+cadena8+"' WHERE clients.id='"+cadena1+"'");
                  System.out.println("Los valores han sido agregados a la base de datos ");
                   JOptionPane.showMessageDialog(this, "Producto Update", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                DESABILITAR();
                this.jButton1.setEnabled(false);
                this.jButton2.setEnabled(true);
                this.jButton3.setEnabled(true);
                this.jButton4.setEnabled(false);
                this.jButton5.setEnabled(false);
                   
                    cargar();
                  
                  
                  
                  
                   
        
        }   catch (InstantiationException ex) {
                Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
               
            }
             finally {
            if (cn != null) {
                try {
                    cn.close();
                    stmt.close();
                } catch ( Exception e ) { 
                         System.out.println( e.getMessage());
                }
            }
            
        }
         javax.swing.JOptionPane.showMessageDialog(this,"Update Done! \n","NOTICE!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        /*this.name.setText("");
        this.detail.setText("");
        this.supplier.setText("");
        this.precio.setText("");
        this.stock.setText(""); */ 
            limpiar();
           
          
            this.jButton1.setEnabled(false);
            this.jButton2.setEnabled(true);
            this.jButton3.setEnabled(true);
            this.jButton4.setEnabled(false);
            this.jButton5.setEnabled(false);

       
        

    }//GEN-LAST:event_jButton4ActionPerformed
public void BOTONES(){
    this.jButton1.setEnabled(false);
           this.jButton2.setEnabled(true);
           this.jButton3.setEnabled(true);
           this.jButton4.setEnabled(false);
           this.jButton5.setEnabled(false);
}
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String cadena1;
        
        cadena1= id.getText();
        int conf=JOptionPane.showConfirmDialog(rootPane,"Are you sure?");
        if(conf==JOptionPane.YES_OPTION){
        try{
//               String url="jdbc:mysql://sql12.freesqldatabase.com:3306/sql12221227";
//            String usuario="sql12221227";
//            String contraseña= "w4iMpnC4kL";
String url="jdbc:mysql://localhost:3306/electronic_1st";
String usuario="root";
String contraseña="";
            
             Class.forName("com.mysql.jdbc.Driver").newInstance(); 
             cn = DriverManager.getConnection(url,usuario,contraseña); 
             if ( cn != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
             
             stmt = cn.createStatement(); 
                  stmt.executeUpdate("DELETE FROM clients WHERE clients.id='"+cadena1+"'");
                  System.out.println("Los valores han sido eliminados a la base de datos ");
                   JOptionPane.showMessageDialog(this, "Product Delete", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                DESABILITAR();
                this.jButton1.setEnabled(false);
                this.jButton2.setEnabled(true);
                this.jButton3.setEnabled(true);
                this.jButton4.setEnabled(false);
                this.jButton5.setEnabled(false);
                   
                    cargar();
             
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
    }
        finally {
            if (cn != null) {
                try {
                    cn.close();
                    stmt.close();
                } catch ( Exception e ) { 
                         System.out.println( e.getMessage());
                }
            }
            
        }
         javax.swing.JOptionPane.showMessageDialog(this,"Update Done! \n","NOTICE!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showConfirmDialog(rootPane,"Back to the menu");
        }
        /*this.name.setText("");
        this.detail.setText("");
        this.supplier.setText("");
        this.precio.setText("");
        this.stock.setText(""); */ 
            limpiar();
            DESABILITAR();
          
          
            this.jButton1.setEnabled(false);
            this.jButton2.setEnabled(true);
            this.jButton3.setEnabled(true);
            this.jButton4.setEnabled(false);
            this.jButton5.setEnabled(false);
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
       this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        // TODO add your handling code here:
      
        char car=evt.getKeyChar();
         if(  id.getText().length()>=5)evt.consume();
          if((car<'c' || car>'c') && (car<'C' || car>'C')&&(car<'0'||car>'9')) evt.consume();
 
    }//GEN-LAST:event_idKeyTyped

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        // TODO add your handling code here:
         char car=evt.getKeyChar();
         if(  name.getText().length()>=25)evt.consume();
       if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
 
    }//GEN-LAST:event_nameKeyTyped

    private void lastnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastnameKeyTyped
  char car=evt.getKeyChar();
   if(  lastname.getText().length()>=25)evt.consume();
       if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
 
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameKeyTyped
   
    private void phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyTyped
        // TODO add your handling code here:
        char car=evt.getKeyChar();
         if(  phone.getText().length()>=9)evt.consume();
        if ((car<'0'||car>'9'))evt.consume();
    }//GEN-LAST:event_phoneKeyTyped

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
        // TODO add your handling code here:
     
    }//GEN-LAST:event_idKeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        BOTONES();
        DESABILITAR();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void addressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyTyped
        // TODO add your handling code here:
         char car=evt.getKeyChar();
   if(  lastname.getText().length()>=45)evt.consume();
       if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
    }//GEN-LAST:event_addressKeyTyped

    private void mailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailKeyTyped
  
        // TODO add your handling code here:

  
                
    }//GEN-LAST:event_mailKeyTyped

    private void mailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailFocusLost
        // TODO add your handling code here:
        String correo = mail.getText();

if(isEmail(correo)){
System.out.println("Mail correcto");
}else{
    JOptionPane.showMessageDialog(rootPane, "Bad");
}
    }//GEN-LAST:event_mailFocusLost
 public void limpiar(){
            this.id.setText("");
          this.name.setText("");
           this.lastname.setText(""); 
           this.gender.setSelectedIndex(0);
     
           this.phone.setText("");
         
           this.mail.setText("");
           address.setText("");
 }
         
  public void ABILITAR(){
          this.name.setEnabled(true);
           this.lastname.setEnabled(true);
           this.gender.setEnabled(true);
        
           this.phone.setEnabled(true);
        
           this.mail.setEnabled(true);
           address.setEnabled(true);
           this.name.requestFocus();
  }
   public void DESABILITAR(){
          this.name.setEnabled(false);
           this.lastname.setEnabled(false); 
           this.gender.setEnabled(false);
      
           this.phone.setEnabled(false);
          
           this.mail.setEnabled(false);
           address.setEnabled(false);
           }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JComboBox gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JTable tbclient;
    // End of variables declaration//GEN-END:variables

Conexion cc = new Conexion();
    Connection cn = cc.conexion();
}
