/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package hdt7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jsken
 */
public class OperacionesTest {
    
    public OperacionesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getEnglishTree method, of class Operaciones.
     */
    @Test
    public void testGetEnglishTree() {
        System.out.println("getEnglishTree");
        Operaciones instance = new Operaciones();
        ArbolesBinarios<String, String> expResult = null;
        ArbolesBinarios<String, String> result = instance.getEnglishTree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrenchTree method, of class Operaciones.
     */
    @Test
    public void testGetFrenchTree() {
        System.out.println("getFrenchTree");
        Operaciones instance = new Operaciones();
        ArbolesBinarios<String, String> expResult = null;
        ArbolesBinarios<String, String> result = instance.getFrenchTree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of settingUp method, of class Operaciones.
     */
    @Test
    public void testSettingUp() throws Exception {
        System.out.println("settingUp");
        Operaciones instance = new Operaciones();
        instance.settingUp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of treeCreation method, of class Operaciones.
     */
    @Test
    public void testTreeCreation() {
        System.out.println("treeCreation");
        Operaciones instance = new Operaciones();
        instance.treeCreation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
