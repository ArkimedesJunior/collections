package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class AtividadePilha1 {

	public static void main(String[] args) {

		Stack<String> pilhaLivro = new Stack<String>();
		String nomeLivro = "";
		Scanner leia = new Scanner(System.in);
		int opcao;
		Iterator<String> remova = pilhaLivro.iterator();

		do {
			System.out.println("\n1- Adicionar livro na pilha");

			System.out.println("\n2- Listar todos os livros");
			System.out.println("\n3 - Retirar livro da pilha");
			System.out.println("\n0 - Sair");
			System.out.println("------------------------------------");
			opcao = leia.nextInt();

			leia.nextLine();

			if (opcao == 0) {
				System.out.println("O programa foi finalizado ");
				break;
			}

			switch (opcao) {
			case 1:
				System.out.print("Digite o Nome:");
				nomeLivro = leia.nextLine();
				pilhaLivro.add(nomeLivro);
				System.out.println("\nLivro adicionado \n" + pilhaLivro);

				break;

			case 2:
				if (pilhaLivro.isEmpty()) {
					System.out.println("A pilha esta vazia!");
				} else {
					System.out.println("Lista de livro na pilha\n:");
					for (String mostrar : pilhaLivro) {
						System.out.println("- " + mostrar);
					}

				}
				break;

			case 3:
				if (pilhaLivro.isEmpty()) {
					System.out.println("A pilha esta vazia!");
				} else {

					System.out.println("\nLivro  " + pilhaLivro.pop() + " retirado");
					System.out.println("Pilha: " + pilhaLivro);

				}

				break;

			default:
				System.out.println("Selecione uma opção valida.");
				break;
			}

		} while (opcao != 0);
		leia.close();
		System.out.println(opcao);
		System.out.println(nomeLivro);
		System.out.println(pilhaLivro);

	}

}
