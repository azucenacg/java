import java.util.Scanner;

public class Interfaz {

	public static void main(String[] args) {
		System.out.println("Escriba 1 para consulta de saldo");
		System.out.println("Escriba 2 para ingresar dinero");
		System.out.println("Escriba 3 para sacar dinero");
		System.out.println("Escriba 4 para consultar movimientos");
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("¿Qué opción desea elegir?");
		int opcionElegida= entrada.nextInt(); 
		System.out.println("Tu opción es la número: " + opcionElegida);
		
	}

}
