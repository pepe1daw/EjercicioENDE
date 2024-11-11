package ejercicio2;

public class Card {

	// CREAMOS LAS VARIABLES SUIT Y VALUE
	public String suit;
	public String value;
	
	// AQUI INDICAMOS LOS DATOS SUIT Y VALUE
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	
	// AQUI DEVOLVEMOS EL TIPO Y EL VALOR DE LA CARTA
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}
