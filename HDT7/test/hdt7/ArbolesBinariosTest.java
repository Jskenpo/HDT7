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
public class ArbolesBinariosTest {
    
    public ArbolesBinariosTest() {
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
     * Test of insert method, of class ArbolesBinarios.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Object key = "hola";
        Object value = "saludo";
        ArbolesBinarios instance = new ArbolesBinarios();
        instance.insert(key, value);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.root == null) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of search method, of class ArbolesBinarios.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Object key = "hola";
        Object value = "saludo";
        ArbolesBinarios instance = new ArbolesBinarios();
        instance.insert(key, value);
        Object expResult = "saludo";
        Object result = instance.search(key);
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
        
    }


    /**
     * Test of printTree method, of class ArbolesBinarios.
     */
    @Test
    public void testPrintTree_0args() {
        System.out.println("printTree");
        Object key = "hola";
        Object value = "saludo";
        ArbolesBinarios instance = new ArbolesBinarios();
        instance.insert(key, value);
        instance.printTree();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    
    
}
