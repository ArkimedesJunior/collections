package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		// Variaveis
		// Inserir o nome, temperatura
		
		 String nome;
		 float temperatura;
		 float fahrenheit;
		 
		 // Construindo o leia 
		 
		 Scanner leia = new Scanner(System.in);
		 
		 // Entrada de Dados -  Pedir/Inserir o nome, temperatura
		 
		 System.out.println("Insira seu nome:");
		 nome = leia.next();
		 
		 System.out.println("Insira a temperatura em Celsius: ");
		 temperatura = leia.nextFloat();
		 

		
		// Processamento 
		 fahrenheit = temperatura * 1.8f + 32;
		 
		
		
		// Saida dos Dados
		 
		 System.out.println("Bom Dia, " + nome);
		 System.out.printf("A temperatura em Fahrenheit é %.1f. " , fahrenheit); // Concatenação 
		 System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
		 
		
	}
	

}
