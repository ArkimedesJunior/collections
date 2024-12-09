package collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class AtividadeSet02 {

	public static void main(String[] args) {
		Set <Integer> setNumeros = new HashSet<Integer>();
		
		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o numero que voce deseja encontrar:");
		
		int numero = leia.nextInt();
		
		if(setNumeros.contains(numero)) {
			System.out.println("\nO numero " + numero + " foi encontrado!");
		
			
		} else {
			System.out.println("\nO numero " + numero + " não foi encontrado!");
		}
		
	    
	}

}
