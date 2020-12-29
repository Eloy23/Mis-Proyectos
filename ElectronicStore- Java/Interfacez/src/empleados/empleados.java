
package empleados;

import conexion.Conexion;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class empleados extends javax.swing.JInternalFrame {
 Connection con=null;
  Statement stmt=null;    

 CallableStatement cts;
   ResultSet r;
   Connection cn;
   Conexion conectar=new Conexion();
    public empleados() {
        initComponents();
        BOTONES();
        DESABILITAR();
        Color colorRosa=new Color(188,221,197 );
         this.getContentPane().setBackground(colorRosa);
       cn=conectar.conexion();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox();
        age = new javax.swing.JSpinner();
        phone = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rol = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Maintenance Employees");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Code:");

        jLabel2.setText("Lastnames:");

        jLabel3.setText("Name(S):");

        jLabel4.setText("Gender:");

        jLabel6.setText("Age:");

        jLabel7.setText("Telephone:");

        jLabel8.setText("E-mail:");

        id.setEnabled(false);
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastnameKeyTyped(evt);
            }
        });

        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select...", "Male", "Female" }));

        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneKeyTyped(evt);
            }
        });

        mail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mailFocusLost(evt);
            }
        });
        mail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mailMousePressed(evt);
            }
        });

        jLabel9.setText("Roll");

        rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planta", "Temporal", "Prueba" }));
        rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastname)
                            .addComponent(name)
                            .addComponent(mail)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addGap(10, 10, 10)))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 226, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User add).jpg"))); // NOI18N
        jButton1.setText("NEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Save).jpg"))); // NOI18N
        jButton2.setText("REGISTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Search).jpg"))); // NOI18N
        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User edit).jpg"))); // NOI18N
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User delete).jpg"))); // NOI18N
        jButton5.setText("DELETE...");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wzdelete.jpg"))); // NOI18N
        jButton6.setText("CANCEL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Delete).jpg"))); // NOI18N
        jButton7.setText("EXIT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String cadena2,cadena3,cadena4,cadena5,cadena7,cadena8,cadena9;

        cadena2 = lastname.getText();
        cadena3 = name.getText();
        cadena4 = gender.getSelectedItem().toString();
        cadena5 = age.getValue().toString();
       
        cadena7 = phone.getText();
        cadena8 = mail.getText();
        cadena9 = rol.getSelectedItem().toString();
        
         

        if (lastname.getText().equals("") || name.getText().equals("") ||(gender.getSelectedItem().equals(null)) || (age.getValue().equals("")) ||  (phone.getText().equals("")) || mail.getText().equals("") || (rol.getSelectedItem().equals(null))) {

            javax.swing.JOptionPane.showMessageDialog(this,"You must to write on all the fields \n","NOTICE!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
           // name.requestFocus();
        }
       else{
            try{
        
//            String url="jdbc:mysql://sql12.freesqldatabase.com:3306/sql12221227";
//            String usuario="sql12221227";
//            String contraseña= "w4iMpnC4kL";
String url="jdbc:mysql://localhost:3306/electronic_1st";
String usuario="root";
String contraseña="";
            
             Class.forName("com.mysql.jdbc.Driver").newInstance(); 
             con = DriverManager.getConnection(url,usuario,contraseña); 
             if ( con != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
  
         stmt = con.createStatement(); 
          stmt.executeUpdate("INSERT INTO employees VALUES('" + 0 + "','"+cadena2+"','"+cadena3+"','"+cadena4+"','"+cadena5+"','"+cadena7+"','"+cadena8+"','"+cadena9+"')");
          System.out.println("Los valores han sido agregados a la base de datos ");
         } catch (SQLException ex) {
                Logger.getLogger(empleados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(empleados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(empleados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(empleados.class.getName()).log(Level.SEVERE, null, ex);
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
         javax.swing.JOptionPane.showMessageDialog(this,"Register exitoso! \n","NOTICE!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
   
       
        /*this.password.setText("");
        this.nick.setText("");*/
          limpiar();
          BOTONES();
         DESABILITAR();
                  

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String cod=JOptionPane.showInputDialog("WRITE THE NAME OF THE EMPLOYEE");
          String   sql="SELECT * FROM employees WHERE name='"+cod+"'"; 
        try {
              Statement  st = cn.createStatement();
            ResultSet r= st.executeQuery(sql);

            if(r.next()){
            JOptionPane.showMessageDialog(this,"Employee Found!!","NOTICE",JOptionPane.INFORMATION_MESSAGE);
            this.id.setText(r.getString(1));
            this.lastname.setText(r.getString(2));
            this.name.setText(r.getString(3));
            this.gender.setSelectedItem(r.getString(4).toString());
            this.age.setValue(r.getInt(5));
          
            this.phone.setText(r.getString(6));
            this.mail.setText(r.getString(7));
            this.rol.setSelectedItem(r.getString(8));
         ABILITAR();
         this.jButton2.setEnabled(false);
           this.jButton1.setEnabled(false);
           this.jButton3.setEnabled(false);
           this.jButton4.setEnabled(true);
           this.jButton5.setEnabled(true);
            }else{

           JOptionPane.showMessageDialog(this,"Employee  Not Found!!","NOTICE",JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       String cadena1,cadena2,cadena3,cadena4,cadena5,cadena6,cadena7,cadena8;
       
            cadena1 =id.getText();
            cadena2 = lastname.getText();
            cadena3 = name.getText();
       
            cadena4 = gender.getSelectedItem().toString();
            cadena5 = age.getValue().toString();
            cadena6 = phone.getText();
            cadena7 = mail.getText();
            cadena8 = rol.getSelectedItem().toString();
       

        if (name.getText().equals("") || (lastname.getText().equals("")) || (gender.getSelectedItem().equals(""))
            || (phone.getText().equals("")) || (mail.getText().equals("")) || (age.getValue().equals(""))) {

            javax.swing.JOptionPane.showMessageDialog(this,"You must to write on all the fields \n","NOTICE!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            name.requestFocus();
        }
         else{
            try{
        
//            String url="jdbc:mysql://sql12.freesqldatabase.com:3306/sql12221227";
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
                  stmt.executeUpdate("UPDATE employees SET last_name='"+cadena2+"', name='"+cadena3+"',gender='"+cadena4+"',age='"+cadena5+"' ,phone='"+cadena6+"', mail='"+cadena7+"', Roll='"+cadena8+"' WHERE Employee_id='"+cadena1+"'");
                  System.out.println("Los valores han sido agregados a la base de datos ");
                   JOptionPane.showMessageDialog(this, "Employee Update", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                DESABILITAR();
                this.jButton1.setEnabled(false);
                this.jButton2.setEnabled(true);
                this.jButton3.setEnabled(true);
                this.jButton4.setEnabled(false);
                this.jButton5.setEnabled(false);
                   
                 
                  
                  
                  
                   
        
        }   catch (InstantiationException ex) {
                Logger.getLogger(empleados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(empleados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(empleados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(empleados.class.getName()).log(Level.SEVERE, null, ex);
               
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
         javax.swing.JOptionPane.showMessageDialog(this,"Modification Done! \n","NOTICE!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
String cadena1;
        
        cadena1= id.getText();
        int conf=JOptionPane.showConfirmDialog(rootPane,"Are you sure?");
        if(conf==JOptionPane.YES_OPTION){
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
                  stmt.executeUpdate("DELETE FROM employees WHERE employees.Employee_id='"+cadena1+"'");
                  System.out.println("Los valores han sido eliminados a la base de datos ");
                   JOptionPane.showMessageDialog(this, "Product Delete", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                DESABILITAR();
                this.jButton1.setEnabled(false);
                this.jButton2.setEnabled(true);
                this.jButton3.setEnabled(true);
                this.jButton4.setEnabled(false);
                this.jButton5.setEnabled(false);
                   
          
             
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(empleados.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(empleados.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        Logger.getLogger(empleados.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(empleados.class.getName()).log(Level.SEVERE, null, ex);
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
        
        
        limpiar();
          BOTONES();
         DESABILITAR();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        // TODO add your handling code here:
        char car=evt.getKeyChar();
         if(  id.getText().length()>=5)evt.consume();
         
          if( (car<'E' || car>'E')&&(car<'0'||car>'9')) evt.consume();
 
    }//GEN-LAST:event_idKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpiar();
         try{
        
         cts=cn.prepareCall("{call Genera_num_EMPLEADOS}");
       r=cts.executeQuery();
       if (r.next())
        
          id.setText(r.getString(1));
            }catch (Exception e){} 
         ABILITAR();
        jButton2.setEnabled(true);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton1.setEnabled(false);
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
             int opcion=JOptionPane.showConfirmDialog(null,"ARE YOU SURE","confirm",JOptionPane.YES_NO_OPTION);
if(opcion==JOptionPane.YES_NO_OPTION){
dispose();
}
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       BOTONES();
        DESABILITAR();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyTyped
        // TODO add your handling code here:
        char car=evt.getKeyChar();
           if(  phone.getText().length()>=9)evt.consume();
       if((car<'0' || car>'9') ) evt.consume();
    }//GEN-LAST:event_phoneKeyTyped

    private void lastnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastnameKeyTyped
        // TODO add your handling code here:
        char car=evt.getKeyChar();
        if(  lastname.getText().length()>=25)evt.consume();
        if((car<'a'||car>'z')&&(car<'A'||car>'Z')&&(car<' '||car>' ')) evt.consume();
        
    }//GEN-LAST:event_lastnameKeyTyped

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        // TODO add your handling code here:
          char car=evt.getKeyChar();
          if(  name.getText().length()>=25)evt.consume();
        if((car<'a'||car>'z')&&(car<'A'||car>'Z')&&(car<' '||car>' ')) evt.consume();
       
    }//GEN-LAST:event_nameKeyTyped

    private void rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolActionPerformed

    private void mailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailMousePressed

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
           this.lastname.setText("");
           this.name.setText(""); 
           this.gender.setSelectedIndex(0);
           this.age.setValue(0);
           this.phone.setText("");
           this.mail.setText("");
           this.id.requestFocus();}
    
      public void ABILITAR(){
          this.lastname.setEnabled(true);
           this.name.setEnabled(true);
           this.gender.setEnabled(true);
          this.age.setEnabled(true);
           this.phone.setEnabled(true);
           this.mail.setEnabled(true);
           this.lastname.requestFocus();
  }
   private void DESABILITAR(){
          this.lastname.setEnabled(false);
           this.name.setEnabled(false); 
           this.gender.setEnabled(false);
           this.age.setEnabled(false);
           this.phone.setEnabled(false);
           this.mail.setEnabled(false);
                  }
  private void BOTONES(){
    this.jButton2.setEnabled(false);
           this.jButton1.setEnabled(true);
           this.jButton3.setEnabled(true);
           this.jButton4.setEnabled(false);
           this.jButton5.setEnabled(false);
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner age;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JComboBox<String> rol;
    // End of variables declaration//GEN-END:variables
}
