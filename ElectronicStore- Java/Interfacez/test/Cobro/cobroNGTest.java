/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cobro;

import java.sql.SQLException;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author eloy2311
 */
public class cobroNGTest {
    
    public cobroNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of num method, of class cobro.
     */
    @Test
    public void testNum() throws SQLException {
        System.out.println("num");
        cobro instance = new cobro();
        instance.num();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajustarcolumnas method, of class cobro.
     */
    @Test
    public void testAjustarcolumnas() {
        System.out.println("ajustarcolumnas");
        cobro.ajustarcolumnas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of store method, of class cobro.
     */
    @Test
    public void testStore() throws Exception {
        System.out.println("store");
        cobro instance = new cobro();
        instance.store();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CargarCB method, of class cobro.
     */
    @Test
    public void testCargarCB() throws SQLException {
        System.out.println("CargarCB");
        cobro instance = new cobro();
        instance.CargarCB();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of botones method, of class cobro.
     */
    @Test
    public void testBotones() throws SQLException {
        System.out.println("botones");
        cobro instance = new cobro();
        instance.botones();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class cobro.
     */
    @Test
    public void testSetLocation() throws SQLException {
        System.out.println("setLocation");
        float CENTER_ALIGNMENT = 0.0F;
        cobro instance = new cobro();
        instance.setLocation(CENTER_ALIGNMENT);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
