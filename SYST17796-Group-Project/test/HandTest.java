/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.ArrayList;
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
public class HandTest {
    
    
    
    
    public HandTest() {
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
     * Test of showHandCards method, of class Hand.
     */
    @Test
    public void testShowHandCardsGood() {
        ArrayList cards = new ArrayList<Card>();
        cards.add(new Card(Value.ACE, Suit.DIAMONDS));
        cards.add(new Card(Value.ACE, Suit.DIAMONDS));
        System.out.println("showHandCards");
        Hand instance = new Hand();
        instance.showHandCards();
      
    }
    
     @Test
    public void testShowHandCardsBad() {
        ArrayList cards = new ArrayList<Card>();
        System.out.println("showHandCards");
        Hand instance = new Hand(cards);
        instance.showHandCards();
      
    }
    
    
     @Test
    public void testShowHandCardsBoundary() {
         ArrayList cards = new ArrayList<Card>();
         cards.add(new Card(Value.ACE, Suit.DIAMONDS));
        System.out.println("showHandCards");
        Hand instance = new Hand(cards);
        instance.showHandCards();
        
    }

    /**
     * Test of showIndexCards method, of class Hand.
     */
    @Test
    public void testShowIndexCardsGood() {
        ArrayList cards = new ArrayList<Card>();
        cards.add(new Card(Value.ACE, Suit.DIAMONDS));
        cards.add(new Card(Value.ACE, Suit.DIAMONDS));
         cards.add(new Card(Value.ACE, Suit.DIAMONDS));
        System.out.println("showIndexCards");
        int index = 1;
        Hand instance = new Hand(cards);
        instance.showIndexCards(index);
     
    }
    
      @Test
    public void testShowIndexCardsBad() {
        
          ArrayList cards = new ArrayList<Card>();
        cards.add(new Card(Value.ACE, Suit.DIAMONDS));
        cards.add(new Card(Value.ACE, Suit.DIAMONDS));
         cards.add(new Card(Value.ACE, Suit.DIAMONDS));
        System.out.println("showIndexCards");
        int index = -1;
        Hand instance = new Hand(cards);
        instance.showIndexCards(index);
   
    }
    
    
      @Test
    public void testShowIndexCardsBoundary() {
         ArrayList cards = new ArrayList<Card>();
        cards.add(new Card(Value.ACE, Suit.DIAMONDS));
        cards.add(new Card(Value.ACE, Suit.DIAMONDS));
         cards.add(new Card(Value.ACE, Suit.DIAMONDS));
        System.out.println("showIndexCards");
        int index = 2;
        Hand instance = new Hand(cards);
        instance.showIndexCards(index);
       
    }

    /**
     * Test of exceeded21 method, of class Hand.
     */
    @Test
    public void testExceeded21Good() {
         ArrayList cards = new ArrayList<Card>();
        cards.add(new Card(Value.JACK, Suit.DIAMONDS));
        cards.add(new Card(Value.JACK, Suit.DIAMONDS));
        cards.add(new Card(Value.JACK, Suit.DIAMONDS));
        System.out.println("exceeded21");
        Hand instance = new Hand(cards);
        boolean expResult = true;
        boolean result = instance.exceeded21();
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testExceeded21Bad() {
         ArrayList cards = new ArrayList<Card>();
        cards.add(new Card(Value.EIGHT, Suit.DIAMONDS));
        cards.add(new Card(Value.FOUR, Suit.DIAMONDS));
        System.out.println("exceeded21");
        Hand instance = new Hand(cards);
        boolean expResult = false;
        boolean result = instance.exceeded21();
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testExceeded21Boundary() {
         ArrayList cards = new ArrayList<Card>();
        cards.add(new Card(Value.TEN, Suit.DIAMONDS));
        cards.add(new Card(Value.ACE, Suit.DIAMONDS));
        System.out.println("exceeded21");
        Hand instance = new Hand(cards);
        boolean expResult = false;
        boolean result = instance.exceeded21();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of getTotalValue method, of class Hand.
     */
    @Test
    public void testGetTotalValueGood() {
         ArrayList cards = new ArrayList<Card>();
        cards.add(new Card(Value.TEN, Suit.DIAMONDS));
        cards.add(new Card(Value.FIVE, Suit.DIAMONDS));
        System.out.println("getTotalValue");
        Hand instance = new Hand(cards);
        int expResult = 15;
        int result = instance.getTotalValue();
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testGetTotalValueBad() {
         ArrayList cards = new ArrayList<Card>();
        cards.add(new Card(Value.TEN, Suit.DIAMONDS));
        cards.add(new Card(Value.FIVE, Suit.DIAMONDS));
        System.out.println("getTotalValue");
        Hand instance = new Hand(cards);
        int expResult = 15;
        int result = instance.getTotalValue();
        assertEquals(expResult, result);
       
    }
    
    
     @Test
    public void testGetTotalValueBoundary() {
          ArrayList cards = new ArrayList<Card>();
        cards.add(new Card(Value.TEN, Suit.DIAMONDS));
        cards.add(new Card(Value.FIVE, Suit.DIAMONDS));
        System.out.println("getTotalValue");
        Hand instance = new Hand(cards);
        int expResult = 15;
        int result = instance.getTotalValue();
        assertEquals(expResult, result);
      
    }
 
   
    
    

    /**
     * Test of drawCards method, of class Hand.
     */
    @Test
    public void testDrawCardsGood() {
         ArrayList cards = new ArrayList<Card>();
        Card card = new Card(Value.randomValue(),Suit.randomSuit());
            cards.add(card);
        System.out.println("drawCards");
        int num = 1;
        Hand instance = new Hand(cards);
        instance.drawCards(num);
      
    }
    
     @Test
    public void testDrawCardsBad() {
         ArrayList cards = new ArrayList<Card>();
        Card card = new Card(Value.randomValue(),Suit.randomSuit());
            cards.add(card);
        System.out.println("drawCards");
        int num = 0;
        Hand instance = new Hand(cards);
        instance.drawCards(num);
      
    }
    
     @Test
    public void testDrawCardsBoundary() {
        ArrayList cards = new ArrayList<Card>();
        Card card = new Card(Value.randomValue(),Suit.randomSuit());
        cards.add(card);
        System.out.println("drawCards");
        int num = 1;
        Hand instance = new Hand(cards);
        instance.drawCards(num);
       
    }

    /**
     * Test of countNumOfAce method, of class Hand.
     */
    @Test
    public void testCountNumOfAceGood() {
        
        ArrayList cards = new ArrayList<Card>();
        Card card = new Card(Value.ACE, Suit.DIAMONDS);
        cards.add(card);
        System.out.println("countNumOfAce");
        Hand instance = new Hand(cards);
        int expResult = 1;
        int result = instance.countNumOfAce();
        assertEquals(expResult, result);
      
    }
    
     @Test
    public void testCountNumOfAceBad() {
         ArrayList cards = new ArrayList<Card>();
        Card card = new Card(Value.EIGHT, Suit.DIAMONDS);
        cards.add(card);
        System.out.println("countNumOfAce");
        Hand instance = new Hand(cards);
        int expResult = 0;
        int result = instance.countNumOfAce();
        assertEquals(expResult, result);
     
    }
    
     @Test
    public void testCountNumOfAceBoundary() {
         ArrayList cards = new ArrayList<Card>();
        Card card = new Card(Value.ACE, Suit.DIAMONDS);
        cards.add(card);
        System.out.println("countNumOfAce");
        Hand instance = new Hand(cards);
        int expResult = 1;
        int result = instance.countNumOfAce();
        assertEquals(expResult, result);
     
    }


    
}