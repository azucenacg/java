import java.math.BigDecimal;
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
				
		double exchangeRate= 1.09; //1.002189
				
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
		
		
		//USING BIGDECIMAL
		//To avoid results as 3.2700000000000005 this one, because of using a double type
		
		//Convert double variables to String 
			
			//double euros
			String eurosString = Double.toString(euros);
			
			//double usdExchange
			String exchangeRateString = Double.toString(exchangeRate);
			
		//Creating a BIG DECIMAL Class Object (using the strings)
			
			//Object euros
			BigDecimal eurosBigDecimal = new BigDecimal(eurosString);
			
			//Object usdExchange
			BigDecimal exchangeRateBigDecimal=new BigDecimal(exchangeRateString);
		
		//Using MULTIPLY which is a BigDecimal class method
			
		BigDecimal usdExchangeBigDecimal= eurosBigDecimal.multiply(exchangeRateBigDecimal);
			
		//Print to console USD Exchange using bigdecimal
			
		System.out.println("EXCHANGE (BigDecimal): " + eurosBigDecimal + " Euros equals " + usdExchangeBigDecimal + " USD");	
		
	}

}
