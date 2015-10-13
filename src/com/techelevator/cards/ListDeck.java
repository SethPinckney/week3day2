package com.techelevator.cards;


import static com.techelevator.cards.Card.*;

import java.util.ArrayList;
import java.util.List;

public class ListDeck implements Deck {
	private List<Card> cardsInDeck;
	
	public ListDeck() {
		cardsInDeck = new ArrayList<Card>();
		for (String suit : SUITS) {
			for (int rank = 1; rank <= 13; rank++) {
				Card newCard = new Card(rank, suit);
				cardsInDeck.add(newCard);
			}
		}
	}
	
	public Card [] deal(int handDealt) {
		Card [] hand = new Card [handDealt];
		for(int i = 0;i < handDealt; i++){
			hand [i] = cardsInDeck.get(0);
			cardsInDeck.remove(0);
		}
		return hand;
	}
}
