package introducao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		int numero, resultado, contador = 3;
        Scanner leia = new Scanner(System.in);

        do { // bloco de repeticao
        	System.out.println("\nDigite um numero inteiro");
        	numero = leia.nextInt();
        	
        	resultado = numero * 5; 
        	
            System.out.println("\nO resultado da multiplicação é: " + resultado);
            
            contador = contador + 1;
            // contador = contador + 1;
            
            
        }   while (contador <= 2);  // condicao limite para repetir
        	
            
            
        }
	}


