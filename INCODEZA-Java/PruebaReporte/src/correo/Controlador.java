/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correo;

import static com.sun.javafx.fxml.BeanAdapter.put;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import static javax.swing.UIManager.put;

/**
 *
 * @author eloy2311
 */
public class Controlador {
    
    
    public boolean sendmail(corre c){
    try{
        Properties p = new Properties();
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.setProperty("mail.smtp.starttls.enable","true");
        p.setProperty("mail.smtp.port", "587");
        p.setProperty("mail.smtp.user", c.getUser());
        p.setProperty("mail.smtp.auth", "true");
        
        Session s = Session.getDefaultInstance(p,null);
        BodyPart texto = new MimeBodyPart();
        texto.setText(c.getMensaje());
        
        
        BodyPart adjunto = new MimeBodyPart();
        if(!c.getRuta().equals("")){
            adjunto.setDataHandler(new DataHandler(new FileDataSource(c.getRuta())));
            adjunto.setFileName(c.getFilename());
            
        }
        MimeMultipart m = new MimeMultipart();
        m.addBodyPart(texto);
        
        if(!c.getRuta().equals("")){
            m.addBodyPart(adjunto);
        }
        MimeMessage mensaje = new MimeMessage(s);
        mensaje.setFrom(new InternetAddress(c.getUser()));
        mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(c.getDestino()));
        mensaje.setSubject(c.getAsunto());
        mensaje.setContent(m);
        
        Transport t = s.getTransport("smtp");
        t.connect(c.getUser(),c.getPass());
        t.sendMessage(mensaje, mensaje.getAllRecipients());
        t.close();
        
                
        
        
    }catch(Exception e){
        System.out.println("Error"+e);
    }
    
    return false;
    
}
}
