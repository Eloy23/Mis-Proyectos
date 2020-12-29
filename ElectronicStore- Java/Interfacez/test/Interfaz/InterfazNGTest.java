/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Image;
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
public class InterfazNGTest {
    
    public InterfazNGTest() {
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
     * Test of getIconImage method, of class Interfaz.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        Interfaz instance = new Interfaz();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acceder method, of class Interfaz.
     */
    @Test
    public void testAcceder() {
        System.out.println("acceder");
        String usuario = "";
        String password = "";
        Interfaz instance = new Interfaz();
        instance.acceder(usuario, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Interfaz.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Interfaz.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
