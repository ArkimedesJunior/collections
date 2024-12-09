package introducao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		String continua;
		int numero1, numero2, resultado;

		Scanner leia = new Scanner(System.in);
		

		while (	!
				
				continua.equals("n")
				
				) { // false => true // continua e igual a n? 
			
			System.out.println("Digite primeiro valor: ");
			numero1 = leia.nextInt();

			System.out.println("Digite segundo valor: ");
			numero2 = leia.nextInt();

			resultado = numero1 + numero2;

			System.out.println("O resultado da soma é: " + resultado);

			System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
			System.out.println("\nDeseja somar dois valores?");
			System.out.println("\nDigite s para sim OU digite n para não: ");
			continua = leia.next();
			System.out.println("++++++++++++++++++++++++++++++++++");
			
			while (continua.equals("s")) {
				System.out.println("Digite o primeiro valor");
				numero1 = leia.nextInt();
				
				System.out.println("Digite o segundo valor:");
				numero2 = leia.nextInt();
				
				resultado = numero1 + numero2;
				
				System.out.println(" o resultado da soma e:" + resultado);
				
				
			}
			
		}
	}
	
	// 0 == 1? = falso
	// nao -> portugol
	
	//!0 == 1 = verdadeiro

}
