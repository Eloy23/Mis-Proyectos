
package productos;

import Interfaz.Interfaz;
import java.sql.*;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import conexion.Conexion;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import conexion.Conexion;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Productos extends javax.swing.JInternalFrame {
Conexion cc = new Conexion();
    Connection cn = cc.conexion();
    
     CallableStatement cst;
     Statement stm=null;
    ResultSet r;
    
    public Productos() {
        initComponents();
//        CargarCB();
          cn=cc.conexion();
          Color colorRosa=new Color(188,221,197 );
         this.getContentPane().setBackground(colorRosa);
    //cargar();
    MostrarDatos();
    try
{
    /* El "patrón" para el editor. Las # representan cifras. En la API puedes ver más. Ojo con el punto decimal, según el idioma puede ser una coma.*/
    MaskFormatter mascara = new MaskFormatter("##.##");
    // Se construye el JFormattedTextField pasándole la máscara
    JFormattedTextField textField = new JFormattedTextField(mascara);
    // Se da un valor inicial válido para evitar problemas
    textField.setValue(new Float("12.34"));
}
catch ( ParseException | NumberFormatException e){}
    }
    
    void MostrarDatos(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NAME");
        modelo.addColumn("DETAIL");
        
        modelo.addColumn("PRICE");
        modelo.addColumn("STOCK");
        
        tbproduct.setModel(modelo);
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
            tbproduct.setModel(modelo);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
    }
      desabilitar();
           this.jButton1.setEnabled(false);
           this.jButton2.setEnabled(true);
           this.jButton3.setEnabled(true);
           this.modi.setEnabled(false);
           this.jButton5.setEnabled(false);
    }
  
    public void abilitar (){
           this.name.setEnabled(true);
           this.detail.setEnabled(true); 
         
           this.stock.setEnabled(true); 
           this.fotoL.setEnabled(true);
         this.image1.setEnabled(true);
           this.name.requestFocus();
           
    }
    public void desabilitar(){
           this.name.setEnabled(false);
           this.detail.setEnabled(false); 
         this.fotoL.setEnabled(false);
         this.image1.setEnabled(false);
           this.stock.setEnabled(false); 
         
                          }
    public void limpiar(){
     this.id.setText("");
           this.name.setText("");
           this.detail.setText(""); 
         this.fotoL.setIcon(null);
                 this.image1.setText("");
           this.stock.setText("");//esto sirve para limpiar los campos..
         

}
    /*public void CargarCB(){
  
    String cap="";
        String sql="SELECT * FROM category ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
         
            while(rs.next()){
                
         
            }
    
    
}   catch (SQLException ex) {
        Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
    }
      

    }*/
    private void SelecionaCLiente(){
        int z;
        int row=tbproduct.getSelectedRow();
        String id=tbproduct.getValueAt(row, 0).toString();
         String nom=tbproduct.getValueAt(row, 1).toString();
        String det=tbproduct.getValueAt(row, 2).toString();
       String st=tbproduct.getValueAt(row,4).toString();
           String x2=tbproduct.getValueAt(row, 3).toString();
         
        z=Integer.parseInt(x2);
        this.id.setText(id);
        this.name.setText(nom);
        this.detail.setText(det);
       this.stock.setText(st);
        this.price.setText(x2);
       
        
    }
     public void oha1(){
        int cod= tbproduct.getSelectedRow();
        String id= tbproduct.getValueAt(cod,0).toString();
        
        
         String   sql="SELECT * FROM productos WHERE id_product='"+id+"'";
        try {
          Statement  st = cn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            FileInputStream archivofoto;

            if (rs.next()) 
               
           
         
                
              image1.setText(rs.getString(2));
                
               
                
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
                 
               fotoL.setIcon(newic);
                System.out.println(fotoL = new JLabel(newic));  
                
//                i=javax.imageio.ImageIO.read(blob.getBinaryStream());
//                ImageIcon image = new ImageIcon(i);
//                this.fotoL.setIcon(image);
                
                  
            
               
           
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        detail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        fotoL = new javax.swing.JLabel();
        image1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        modi = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbproduct = new javax.swing.JTable();

        jMenuItem1.setText("Update Registers");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Maintenace of the Products");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        id.setToolTipText("");
        id.setEnabled(false);
        id.setFocusAccelerator('*');
        id.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                idCaretUpdate(evt);
            }
        });

        jLabel1.setText("Code:");

        jLabel2.setText("Product Name:");

        jLabel3.setText("Detail:");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        detail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                detailKeyTyped(evt);
            }
        });

        jLabel5.setText("Price:");

        price.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                priceCaretUpdate(evt);
            }
        });
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });

        jLabel6.setText("Stock:");

        stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockKeyTyped(evt);
            }
        });

        fotoL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fotoL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotoLMouseClicked(evt);
            }
        });

        image1.setBackground(new java.awt.Color(204, 255, 204));
        image1.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stock)
                    .addComponent(price)
                    .addComponent(detail)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(fotoL, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel5))))
                    .addComponent(fotoL, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Save).jpg"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Search).jpg"))); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        modi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User edit).jpg"))); // NOI18N
        modi.setText("Update");
        modi.setToolTipText("");
        modi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modiActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User delete).jpg"))); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wzdelete.jpg"))); // NOI18N
        jButton6.setText("Cancel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Delete).jpg"))); // NOI18N
        jButton7.setText("Exit");
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(modi))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(modi)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Maintenance of the Products", jPanel2);

        tbproduct.setBackground(new java.awt.Color(233, 224, 107));
        tbproduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbproduct.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tbproduct);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Products List", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Maintenace of the Products");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_idCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_idCaretUpdate

    private void priceCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_priceCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_priceCaretUpdate

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Connection conectar = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                //conectar=DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12221227","sql12221227","w4iMpnC4kL");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic_1st","root","");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
            }
          String insert="INSERT INTO productos(name,detail,stock,price,ruta,image)VALUES(?,?,?,?,?,?)";
          PreparedStatement ps=conectar.prepareStatement(insert);
          FileInputStream archivofoto;
          ps.setString(1,name.getText());
          ps.setString(2,detail.getText());
          ps.setString(3,stock.getText());
          ps.setString(4,price.getText());
          ps.setString(5,image1.getText());
          archivofoto = new FileInputStream(image1.getText());
          ps.setBinaryStream(6, archivofoto);
          int i=ps.executeUpdate();
          if(i>0){
              JOptionPane.showMessageDialog(null, "It is save");
              MostrarDatos();
         //  BOTONES();
            desabilitar();
            limpiar();
              this.jButton1.setEnabled(true);
          }else{
               JOptionPane.showMessageDialog(null, "Error");
          }
          
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
      String cod = JOptionPane.showInputDialog("WRITE THE ID OF THE PRODUCT");
     String   sql="SELECT * FROM productos WHERE id_product='"+cod+"'";
        try {
          Statement  st = cn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            FileInputStream archivofoto;

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Product Found!!", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
            
               this.jButton2.setEnabled(false);
// abilitar();
                this.id.setText(rs.getString(1));
                this.name.setText(rs.getString(2));
                this.detail.setText(rs.getString(3));
                this.stock.setText(rs.getString(4));
                this.price.setText(rs.getString(5));
                this.image1.setText(rs.getString(6));
                
               // Image i=null;
                Blob blob=rs.getBlob(7);
                byte[] data=blob.getBytes(1,(int)blob.length());
                BufferedImage img = null;
                try{
                    img= ImageIO.read(new ByteArrayInputStream(data));
                }catch(Exception ex){
                    System.out.println("Error");
                }
                ImageIcon icono = new ImageIcon(img);
               fotoL.setIcon(icono);
                System.out.println( fotoL = new JLabel(icono));  
                
//                i=javax.imageio.ImageIO.read(blob.getBinaryStream());
//                ImageIcon image = new ImageIcon(i);
//                this.fotoL.setIcon(image);
                
                  
            
               
            } else {

                JOptionPane.showMessageDialog(this, "Product  Not Found!!", "NOTICE", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void modiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modiActionPerformed
              String cadena1= id.getText();
        try{
            Connection conectar = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12221227","sql12221227","w4iMpnC4kL");
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
            }
          String insert="UPDATE  productos SET name=?,detail=?,stock=?,price=?,ruta=?,image=? WHERE products.id_product='"+cadena1+"'";
          PreparedStatement ps=conectar.prepareStatement(insert);
            System.out.println(insert);   
          FileInputStream archivofoto;
          ps.setString(1,name.getText());
          ps.setString(2,detail.getText());
          ps.setString(3,stock.getText());
          ps.setString(4,price.getText());
          ps.setString(5,image1.getText());
          archivofoto = new FileInputStream(image1.getText());
          ps.setBinaryStream(6, archivofoto);
          int i=ps.executeUpdate();
          if(i>0){
     JOptionPane.showMessageDialog(null, "UPDATE DONE");
                  
              this.id.setText("");
              this.jButton1.setEnabled(true);
              Productos x= new Productos();
              x.setVisible(true);
              this.dispose();

              
          }else{
               JOptionPane.showMessageDialog(null, "Error");
          }
          
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
    }//GEN-LAST:event_modiActionPerformed

        
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
      String cadena1= id.getText();
        int conf=JOptionPane.showConfirmDialog(rootPane, "Are you sure?", "CONFIRM", JOptionPane.YES_NO_OPTION);
        if(conf==JOptionPane.YES_OPTION){
            try{
            Connection conectar = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12221227","sql12221227","w4iMpnC4kL");
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
            }
          String delete="DELETE FROM productos WHERE products.id_product='"+cadena1+"'";
          PreparedStatement ps=conectar.prepareStatement(delete); 
          int i=ps.executeUpdate();
          if(i>0){
              JOptionPane.showMessageDialog(null, "UPDATE DONE");
              
               this.id.setText("");
              this.jButton1.setEnabled(true);
              fotoL.setIcon(null);
               Productos x= new Productos();
              x.setVisible(true);
              this.dispose();
          }else{
               JOptionPane.showMessageDialog(null, "Error");
          }
        }   catch (SQLException ex) {
                Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
             JOptionPane.showMessageDialog(rootPane, "CANCELED");
        }  
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        limpiar();
        desabilitar();
        this.jButton1.setEnabled(false);
        this.jButton2.setEnabled(true);
        this.jButton3.setEnabled(true);
        this.modi.setEnabled(false);
        this.jButton5.setEnabled(false);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiar();
         try{
        
         cst=cn.prepareCall("{call Genera_num_PRODUCTOS}");
       r=cst.executeQuery();
       if (r.next())
        
          id.setText(r.getString(1));
            }catch (Exception e){} 
        abilitar();
        this.jButton1.setEnabled(true);
        this.jButton2.setEnabled(false);
        this.jButton3.setEnabled(false);
        this.modi.setEnabled(false);
        this.jButton5.setEnabled(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
//        cargar();

              SelecionaCLiente();
              oha1();
         abilitar ();
         
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if(  name.getText().length()>=25)evt.consume();
if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
     
    }//GEN-LAST:event_nameKeyTyped

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
         if(  price.getText().length()>=4)evt.consume();
if((car<'0' || car>'9')&&(car<'.'||car>'.')) evt.consume();
       
    }//GEN-LAST:event_priceKeyTyped

    private void stockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockKeyTyped
        // TODO add your handling code here:
           char car = evt.getKeyChar();
           if(  stock.getText().length()>=4)evt.consume();
if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_stockKeyTyped

    private void detailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_detailKeyTyped
char car = evt.getKeyChar();
if(  detail.getText().length()>=35)evt.consume();
if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_detailKeyTyped

    private void fotoLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotoLMouseClicked
        // TODO add your handling code here:
        JFileChooser archivo = new JFileChooser();
        int window = archivo.showOpenDialog(null);
        if(window==JFileChooser.APPROVE_OPTION){
            File file= archivo.getSelectedFile();
            image1.setText(String.valueOf(file));
            Image foto =getToolkit().getImage(image1.getText()).getScaledInstance(150,150, Image.SCALE_DEFAULT);
            fotoL.setIcon(new ImageIcon(foto));
            this.repaint();
        }
    }//GEN-LAST:event_fotoLMouseClicked

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField detail;
    public javax.swing.JLabel fotoL;
    private javax.swing.JTextField id;
    private javax.swing.JTextField image1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton modi;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JTextField stock;
    private javax.swing.JTable tbproduct;
    // End of variables declaration//GEN-END:variables

     
}
