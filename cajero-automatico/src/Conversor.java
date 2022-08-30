import java.util.Scanner;

//CURRENCY CALCULATOR

/*
 * This program introduces the euros quantity and converts it into US dollars
 * *** Euros equals *** dollars 
 * 
 */

public class Conversor {

	public static void main(String[] args) {
		//Welcome message
		System.out.println("EUROS to USD");
		
		//EXCHANGE RATE EURO TO US DOLLAR
		//1 euro equals (exchangeRate) dollars
				
		double exchangeRate= 1.002189;
				
		//Inform the customer about the exchange rate
		System.out.println("The exchange rate today is:");
		System.out.println("1.00 Euro = " + exchangeRate + " USD");
				
		//What the user types is scanned in here
		//userInput is a Scanner class object 
		Scanner userInput= new Scanner (System.in);
		
		//Message for the user
		
		System.out.println("Introduce Euros quantity");
		
		//Read the user entry (euros amount)
		double euros= userInput.nextDouble();
		
		
		//Convert euros to usd
		
		double usdExchange=euros*exchangeRate;
		
		//Print to console USD Exchange
		
		System.out.println("EXCHANGE: " + euros + " Euros equals " + usdExchange + " USD");
		
	}

}
