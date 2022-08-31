import java.util.Scanner;

public class Interfaz {

	public static void main(String[] args) {
		int chosenNumber;
		do {
			System.out.println("Type 1 for balance inquiry");
			System.out.println("Type 2 to enter money");
			System.out.println("Type 3 to withdraw money");
			System.out.println("Type 4 to check moves");
			System.out.println("To exit type any other number");
			
			System.out.println("---Please type the option you need and press Enter---");
			Scanner input=new Scanner(System.in);
			chosenNumber= input.nextInt(); 
		
			//System.out.println("You chose number: " + chosenNumber);
			
			switch(chosenNumber) {
			case 1:
				System.out.println("You chose: balance inquiry");
			break;
			
			case 2:
				System.out.println("You chose: enter money");
			break;
			
			case 3:
				System.out.println("You chose: withdraw money");
			break;
			
			case 4:
				System.out.println("You chose: check moves");
			break;
			
			default:
				System.out.println("You left the system, come back soon!");
			
			}
		}while(chosenNumber==1||chosenNumber==2||chosenNumber==3||chosenNumber==4);
			
	}

}
