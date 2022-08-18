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
 * @author huixi
 */
public class BlackjackGameTest {

    public BlackjackGameTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Start of unit tests for Game class:\n");
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

    @Test
    public void testGetPlayersGood() {
        System.out.println("getPlayers");
        Player player = new Player("Tommy");
        Dealer dealer = new Dealer();
        BlackjackGame instance = new BlackjackGame(player, dealer);
        Player expResult = player;
        Player result = instance.getPlayers();
        assertEquals(expResult, result);
     
    }

    public void testGetPlayersBad() {
        System.out.println("getPlayers");
        Player player = new Player("A");
        Dealer dealer = new Dealer();
        BlackjackGame instance = new BlackjackGame(player, dealer);
        Player expResult = player;
        Player result = instance.getPlayers();
        assertEquals(expResult, result);
      
    }

    public void testGetPlayersBoundary() {
        System.out.println("getPlayers");
        Player player = new Player("Tommy Harry");
        Dealer dealer = new Dealer();
        BlackjackGame instance = new BlackjackGame(player, dealer);
        Player expResult = player;
        Player result = instance.getPlayers();
        assertEquals(expResult, result);
     
    }

    @Test
    public void testSetPlayersGood() {
        System.out.println("setPlayers");
        Player player = new Player("Tommy");
        Dealer dealer = new Dealer();
        BlackjackGame instance = new BlackjackGame(player, dealer);
        instance.setPlayers(player);
  
    }

    @Test
    public void testSetPlayersBad() {
        System.out.println("setPlayers");
        Player player = new Player("A");
        Dealer dealer = new Dealer();
        BlackjackGame instance = new BlackjackGame(player, dealer);
        instance.setPlayers(player);
      
    }

    @Test
    public void testSetPlayersBoundary() {
        System.out.println("setPlayers");
        Player player = new Player("Tommy Harry");
        Dealer dealer = new Dealer();
        BlackjackGame instance = new BlackjackGame(player, dealer);
        instance.setPlayers(player);
   
    }

    @Test
    public void testPlayGood() {
        System.out.println("play");
        Player player = new Player("Tommy");
        Dealer dealer = new Dealer();
        BlackjackGame instance = new BlackjackGame(player, dealer);
        instance.play();
        
    }

    @Test
    public void testPlayBad() {
        System.out.println("play");
        Player player = new Player("A");
        Dealer dealer = new Dealer();
        BlackjackGame instance = new BlackjackGame(player, dealer);
        instance.play();
      
    }

    @Test
    public void testPlayBoundary() {
        System.out.println("play");
        Player player = new Player("Tommy Harry");
        Dealer dealer = new Dealer();
        BlackjackGame instance = new BlackjackGame(player, dealer);
        instance.play();
  
    }

    @Test
    public void testExitGood() {
        Player player = new Player("Tommy");
        Dealer dealer = new Dealer();
        System.out.println("exit");
        BlackjackGame instance = new BlackjackGame(player, dealer);
        instance.exit();
        
    }
        @Test
    public void testExitBad() {
        Player player = new Player("A");
        Dealer dealer = new Dealer();
        System.out.println("exit");
        BlackjackGame instance = new BlackjackGame(player, dealer);
        instance.exit();
    
    }
        @Test
    public void testExitBoundary() {
        Player player = new Player("Tommy Harry");
        Dealer dealer = new Dealer();
        System.out.println("exit");
        BlackjackGame instance = new BlackjackGame(player, dealer);
        instance.exit();

    }

    @Test
    public void testDeclareWinnerGood() {
        System.out.println("declareWinner");
        Player player = new Player("Tommy Harry");
        Dealer dealer = new Dealer();
        Object object = player;
        BlackjackGame instance = new BlackjackGame(player, dealer);
        instance.declareWinner(object);
   
    }
    @Test
    public void testDeclareWinnerBad() {
        System.out.println("declareWinner");
        Player player = new Player("Tommy Harry");
        Dealer dealer = new Dealer();
        Object object = dealer;
        BlackjackGame instance = new BlackjackGame(player, dealer);
        instance.declareWinner(object);

    }
}
