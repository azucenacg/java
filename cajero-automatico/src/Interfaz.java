import java.util.Scanner;

public class Interfaz {

	public static void main(String[] args) {
		System.out.println("Type 1 for balance inquiry");
		System.out.println("Type 2 to enter money");
		System.out.println("Type 3 to withdraw money");
		System.out.println("Type 4 to check moves");
		System.out.println("To exit type any other number");
		
		Scanner input=new Scanner(System.in);
		System.out.println("Which option would you like to choose?");
		int choosenNumber= input.nextInt(); 
		System.out.println("Tu opción es la número: " + choosenNumber);
		
	}

}
