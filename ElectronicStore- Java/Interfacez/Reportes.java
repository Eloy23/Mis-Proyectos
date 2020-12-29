/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Eloy
 */
public class Reportes {
       // Connection a=null;
    public void Reporte1() throws SQLException, JRException{
        Connection a;
        
        a=DriverManager.getConnection("jdbc:mysql://localhost/restaurant");
        JasperReport reporte=null;
        reporte= (JasperReport) JRLoader.loadObjectFromLocation("jdbc:mysql://localhost/restaurant//report1.jasper");
        JasperPrint print= JasperFillManager.fillReport(reporte,null,a);
        JasperViewer ver = new JasperViewer(print);
        ver.setTitle("Products");
        ver.setVisible(true);
        
    }
}
