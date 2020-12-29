package Conteiner;


import java.awt.Color;
import java.security.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eloy2311
 */
public class Actividades extends javax.swing.JFrame {
  Connection con=null;
    Statement stmt=null; 
      ResultSet rs=null;
    /**
     * Creates new form Actividades
     */
    public Actividades() {
        initComponents();
       num();
         this.setLocationRelativeTo(null);
         Color colorFondo=new Color(174,203,243 );
         this.getContentPane().setBackground(colorFondo);
    
    }
    
    
    
    public void folio(){
    
       try {
                String k="";
                int x;
                String z="";
                
                String url="jdbc:mysql://localhost:3306/prueba";
                String usuario="root";
                String contraseña="";
                
                try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
                }
                con = DriverManager.getConnection(url,usuario,contraseña);
                if ( con != null )
                    System.out.println("Se ha establecido una conexión a la base de datos " +
                            "\n " + url );
                
                
                String sql="SELECT MAX(folio) AS folio FROM folio";
                
                try{
                    
                    stmt=con.createStatement();
                    rs=stmt.executeQuery(sql);
                    
                    if (rs.next()){
                        
                        k=rs.getString("folio");
                        x=Integer.parseInt(k);
                        
                        z=String.valueOf(x);
                        // c=rs.getString("id_invoice");
                        System.out.println(x+"uuuuuuuuuuuuuh");
                        
                        //num.setText(z);
                        
                        x=x+1;
                        
                        String sql1= "INSERT into folio values('"+0+"','"+x+"','"+num.getText()+"' );";
                         stmt=con.createStatement();
                    stmt.executeUpdate(sql1);
                    
                     System.out.println("Los valores han sido agregados a la base de datos ");
                    }
                    
                }catch (Exception e){}
            } catch (SQLException ex) {
                Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
            }
        
       
        
    }
     public void num(){
            try {
                String k="";
                int x;
                String z="";
                
                String url="jdbc:mysql://localhost:3306/prueba";
                String usuario="root";
                String contraseña="";
                
                try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
                }
                con = DriverManager.getConnection(url,usuario,contraseña);
                if ( con != null )
                    System.out.println("Se ha establecido una conexión a la base de datos " +
                            "\n " + url );
                
                
                String sql="SELECT MAX(id) AS id FROM cliente";
                
                try{
                    
                    stmt=con.createStatement();
                    rs=stmt.executeQuery(sql);
                    
                    if (rs.next()){
                        
                        k=rs.getString("id");
                        x=Integer.parseInt(k);
                        
                        z=String.valueOf(x);
                        // c=rs.getString("id_invoice");
                        System.out.println(x);
                        
                        num.setText(z);
                        
                    }
                    
                }catch (Exception e){}
            } catch (SQLException ex) {
                Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
            }
              }
    
        
    
    
    public void obtener(){
        
       ArrayList<String> act = new ArrayList<String>();
       otro.setEnabled(false);
       
       
       try{
        String url="jdbc:mysql://localhost:3306/prueba";
                String usuario="root";
                String contraseña="";
                
                
                
                  Class.forName("com.mysql.jdbc.Driver").newInstance(); 
             con = DriverManager.getConnection(url,usuario,contraseña); 
             if ( con != null ){ 
           System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
             }else{
                 System.out.println("fallo");
             }
                
       
       
       
       if(c1.isSelected()){
           act.add("Mantto Preventivo/ Correctivo");
            String uno = "Mantto Preventivo/ Correctivo";
           String Sql = "INSERT INTO actividad VALUES ('"+0+"','"+uno+"','"+num.getText()+"' );";
          
             
                    
                    stmt=con.createStatement();
                    stmt.executeUpdate(Sql);
                    
                     System.out.println("Los valores han sido agregados a la base de datos ");

                    
          
          // System.out.println(act);
       }
       if(c2.isSelected()){
           act.add("Reparacion de Accesorio");
           String dos = "Reparacion de Accesorio";
           String Sql = "INSERT INTO actividad VALUES ('"+0+"','"+dos+"','"+num.getText()+"' );";
          
             try{
                    
                    stmt=con.createStatement();
                    stmt.executeUpdate(Sql);
             }catch(Exception e){}
           //System.out.println(act);
       }
       if(c3.isSelected()){
           act.add("Instalacion de Hardware");
           String tres = "Instalacion de Hardware";
           String Sql = "INSERT INTO actividad VALUES('"+0+"','"+tres+"','"+num.getText()+"' ); ";
          
             try{
                    
                    stmt=con.createStatement();
                    stmt.executeUpdate(Sql);
             }catch(Exception e){}
           //System.out.println(act);
       }
        if(c4.isSelected()){
           act.add("Instalacion de Hardware");
           String cuatro="Instalacion de Hardware";
           String Sql = "INSERT INTO actividad VALUES ('"+0+"','"+cuatro+"','"+num.getText()+"' );";
          
             try{
                    
                    stmt=con.createStatement();
                    stmt.executeUpdate(Sql);
             }catch(Exception e){}
           //System.out.println(act);
       }
        if(c5.isSelected()){
           act.add("Revision/ Diagnostico");
           String cinco = "Revision/ Diagnostico";
           String Sql = "INSERT INTO actividad VALUES ('"+0+"','"+cinco+"','"+num.getText()+"' );";
          
             try{
                    
                    stmt=con.createStatement();
                    stmt.executeUpdate(Sql);
             }catch(Exception e){}
          // System.out.println(act);
       }
         if(c6.isSelected()){
           act.add("Configuracion de Acceso a Internet");
           String seis="Configuracion de Acceso a Internet";
           String Sql = "INSERT INTO actividad VALUES ('"+0+"','"+seis+"','"+num.getText()+"' ); ";
          
             try{
                    
                    stmt=con.createStatement();
                    stmt.executeUpdate(Sql);
             }catch(Exception e){}
           //System.out.println(act);
       }
          if(c7.isSelected()){
           act.add("Trabajo Realizado sobre Cotizacion");
           String siete="Trabajo Realizado sobre Cotizacion";
           String Sql = "INSERT INTO actividad VALUES ('"+0+"','"+siete+"','"+num.getText()+"' ); ";
          
             try{
                    
                    stmt=con.createStatement();
                    stmt.executeUpdate(Sql);
             }catch(Exception e){}
       //    System.out.println(act);
       }
        if(c8.isSelected()){
            
           act.add("CCTV");
           String ocho ="CCTV";
           String Sql = "INSERT INTO actividad VALUES ('"+0+"','"+ocho+"','"+num.getText()+"' ); ";
          
             try{
                    
                    stmt=con.createStatement();
                    stmt.executeUpdate(Sql);
             }catch(Exception e){}
         //  System.out.println(act);
       }
          if(c9.isSelected()){
         
            
            String text = otro.getText().toString();
           String Sql = "INSERT INTO actividad VALUES ('"+0+"','"+text+"','"+num.getText()+"' );";
          
             try{
                    
                    stmt=con.createStatement();
                    stmt.executeUpdate(Sql);
             }catch(Exception e){}
            act.add(text);
          
       }
       }catch(Exception e){}
          
          
          
          int x = act.size();
           System.out.println(act);
           System.out.println(x);
           
           
        
          
          
          
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        c5 = new javax.swing.JCheckBox();
        c6 = new javax.swing.JCheckBox();
        c7 = new javax.swing.JCheckBox();
        c8 = new javax.swing.JCheckBox();
        c9 = new javax.swing.JCheckBox();
        otro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        num = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        c1.setText("Mantto Preventivo/ Correctivo");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        c2.setText("Reparacion de Accesorio");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        c3.setText("Instalacion de Hardware");

        c4.setText("Instalacion de S.O/ Paqueteria");

        c5.setText("Revision/ Diagnostico");

        c6.setText("Configuracion de Acceso a Internet");
        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });

        c7.setText("Trabajo Realizado sobre Cotizacion");

        c8.setText("CCTV");

        c9.setText("Otro:");

        jLabel1.setText("Tareas Realizadas");

        jButton1.setText("SIGUIENTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        num.setText("jLabel2");

        jButton2.setText("VER HOJA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c1)
                                    .addComponent(c2)
                                    .addComponent(c3)
                                    .addComponent(c4))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c8)
                                    .addComponent(c7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(c9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(otro, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(num)
                                        .addComponent(c6))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c5)
                                .addGap(82, 369, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1)
                    .addComponent(c6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c2)
                    .addComponent(c7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c3)
                    .addComponent(c8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c4)
                    .addComponent(c9)
                    .addComponent(otro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        obtener();
        folio();
        entrada x = new entrada();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          JasperReport report;
        
        String path = "C:\\PruebaReporte\\src\\pruebareporte\\Reporte\\invoice.jasper";
        try{
            report = (JasperReport)JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(path,null,cn);
            JasperViewer viewer = new JasperViewer(jprint,false);
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
            viewer.setVisible(true); //Inicializamos la vista del Reporte
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c5;
    private javax.swing.JCheckBox c6;
    private javax.swing.JCheckBox c7;
    private javax.swing.JCheckBox c8;
    private javax.swing.JCheckBox c9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel num;
    private javax.swing.JTextField otro;
    // End of variables declaration//GEN-END:variables
}
