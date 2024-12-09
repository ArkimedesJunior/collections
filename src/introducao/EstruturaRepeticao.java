package introducao;

import java.util.Scanner;

public class EstruturaRepeticao {

	public static void main(String[] args) {
	
		
		String nome;
		int contador;
		
        Scanner leia = new Scanner(System.in);
       
       /* System.out.println("\nDigite o 2º nome: ");
        nome2 = leia.nextLine();
        System.out.println("O 2º nome é: "  + nome2);
        
        System.out.println("\nDigite o 3º nome: ");
        nome3 = leia.nextLine();
        System.out.println("O 3º nome é: "  + nome3);*/
        
        
        // contador = 1
        // contador = 1 + 1
        // contador = 2 + 1
        // contador = 3 + 1
      //  1 e menor que 4? sim //
        // contador++ ou == contador = contador + 1
        
        for(contador = 1; contador < 4; contador = contador + 1 ) {  	 
             System.out.println("Digite o " + contador + " nome: ");
            nome = leia.nextLine();
            System.out.println("O" + contador + "o nome e: " + nome ); 
            
        }
    }

	

}

