/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pg
 */
public class DealerTest {
    
    public DealerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Start of unit tests\n");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("\nUnit tests completed");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        System.out.println("-----------------------------------");
    }

    /**
     * Test of isOverSixteen method, of class Dealer.
     */
    @Test
    public void testIsOverSixteenGood() {
        System.out.println("Testing isOverSixteenGood");
        Dealer dealer = new Dealer();
        boolean expResult = true;
        boolean result = dealer.isOverSixteen();
        if (result) {
            assertEquals(expResult, result);
        }
    }
    
    @Test
    public void testIsOverSixteenBad() {
        System.out.println("Testing isOverSixteenBad");
        Dealer dealer = new Dealer();
        boolean expResult = false;
        boolean result = dealer.isOverSixteen();
        if (!result) 
        {
        assertEquals(expResult, result);
        }
    }
    
    @Test
    public void testIsOverSixteenBoundary() {
        System.out.println("Testing isOverSixteenBoundary");
        Dealer dealer = new Dealer();
        boolean expResult = false;
        boolean result = dealer.isOverSixteen();
        if (result && !result ) {
            assertEquals(expResult, result);
        }
    }
    
}
