/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deck.data;

/**
 *
 * @author user
 */
public class Card {
    private String suit;    //each card has a suit
    private String rank;    //Each card has a rank
    private String colour;  //Easier card has a colour, calculated by ruit
    public Card(String s, String r){
        this.suit = s;
        this.rank = r;
        if ((s.equalsIgnoreCase("clubs"))||(s.equalsIgnoreCase("spades"))){
            this.colour = "black";  //assigns black if suit is spades or clubs
        }
        else{
            this.colour = "red";    //assigns red if not clubs or spades
        }
    }
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    
}
