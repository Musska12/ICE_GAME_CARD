/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in 
 * 
 * ICE 1
 * Student: Musska
 * Student ID: 991785933
 * @author srinivsi
 */
public class CardTrick {
    
    
    public static void main(String[] args)
    {
    
    Random rand = new Random ();
    Scanner input = new Scanner(System.in);
        
    //here we create hand of 7 cards 
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++){
            Card c = new Card();
            c.setValue(rand.nextInt(13)+ 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
            
            // print the cards 
            System.out.println(c.getSuit()+ " " + c.getValue());
        }
        
        // asking the user for input 
//        System.out.print("Enter a card value (1-13): ");
//        
//        int val = input.nextInt();
//        
//        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades:) ");
//        
//        int suitIndex = input.nextInt();
//        
//        
//        Card theUserCard = new Card();
//        
//        theUserCard.setValue(val);
//        theUserCard.setSuit(Card.SUITS[suitIndex]);
        
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");
        
        boolean found = false;
        for (Card c : magicHand){
            if (c.getValue() == luckyCard.getValue() &&
                c.getSuit().equals(luckyCard.getSuit())){
                found = true;
        
            }
        
        }
        // here will be the result 
        if (found) {
            
            System.out.println("Your card is in the magic hand!");
        } 
        else {
            System.out.println("Sorry, your card is not in the magic hand.");
        
        }

//        

        if (luckyCard.getValue() == luckyCard.getValue() && 
           luckyCard.getSuit().equals(luckyCard.getSuit())) {
            System.out.println("You found the lucky card!");
           }
    
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
