package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {

		// ESTOS STRINGS LO QUE HACEN ES DARLE VALOR A LAS VARIABLES SUITS Y VALUES.
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		// EL ARRAYLIST CREA UNA LISTA LLAMADA DECK COGIENDO DATOS DE TIPO CARD
		ArrayList<Card> deck = new ArrayList<Card>();

		
		// ESTE BUCLE CREE LA COMBINACIÓN DE SUITS Y VALUES
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}

		// ESTE BUCLE MEZCLA ALEATORIAMENTE LA COMBINACIÓN DE CARTAS
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}

		// ESTE BUCLE TE DEVUELVE 5 CARTAS SIENDO ASI EL RESULTADO DE LA COMBINACION Y LA MEZCLA
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}
		

	}

}
