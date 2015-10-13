package com.techelevator.cards;

import static com.techelevator.cards.Card.*;

public class ArrayDeck implements Deck {
	private Card[] cardsInDeck;
	int topOfDeck = 0;
	
	public ArrayDeck() {
		cardsInDeck = new Card[52];

		int offset = 0;

		for (String suit : SUITS) {
			for (int rank = 1; rank <= 13; rank++) {
				Card newCard = new Card(rank, suit);
				cardsInDeck[rank + offset - 1] = newCard;
			}
			offset += 13;
		}

	}
	
	public Card [] deal(int handDealt) {
		Card [] hand = new Card [handDealt];
		for(int i = 0;i < handDealt; i++){
			hand [i] = cardsInDeck [topOfDeck];
			topOfDeck++;
		}
		return hand;
		
	}
}