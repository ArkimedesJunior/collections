package introducao;

import java.util.Scanner;

public class ExemploVetores {

	public static void main(String[] args) {

		String cachorro[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi" };
         // tipo nome_vetor[] = {valores}
		
		
		for (int indice = 0; indice < 5; indice++) {
			System.out.println((indice + 1) + "º elemento: " + cachorro[indice]);
		}

		Scanner leia = new Scanner(System.in);
		
		// nome vetor [ indice ]
		//rua[1] == "João"
		// cachorro[0] = "Boxer"
		// cachorro[1] = "pastor alemão"

	}

}
