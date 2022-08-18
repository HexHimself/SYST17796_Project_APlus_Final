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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getName method, of class Player.
     */
    @Test
    public void testIsGetNameGood() {
        System.out.println("Testing IsGetNameGood");
        String name = "player";
        Player player = new Player(name);
        String expResult = player.getName();
        String result = player.getName();
        assertEquals(expResult, result);
        
    }
    
    public void testIsGetNameBad() {
        System.out.println("Testing IsGetNameBad");
        String name = ";.,/";
        Player player = new Player(name);
        String expResult = player.getName();
        String result = player.getName();
        assertEquals(expResult, result);
        
    }
    
    public void testIsGetNameBoundary() {
        System.out.println("Testing IsGetNameBoundary");
        String name = "player123";
        Player player = new Player(name);
        String expResult = player.getName();
        String result = player.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testIsSetNameGood() {
        System.out.println("Testing IsSetNameGood");
        String name = "player";
        Player player = new Player(name);
        player.setName(name);
        String expResult = player.getName();
        String result = player.getName();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsSetNameBad() {
        System.out.println("Testing IsSetNameBad");
        String name = "./d'" ;
        Player player = new Player(name);
        player.setName(name);
        String expResult = player.getName();
        String result = player.getName();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsSetNameBoundary() {
        System.out.println("Testing IsSetNameBoundary");
        String name = "player123";
        Player player = new Player(name);
        player.setName(name);
        String expResult = player.getName();
        String result = player.getName();
        assertEquals(expResult, result);
    }
    
}
