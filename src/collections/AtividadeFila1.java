package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila1 {

	public static void main(String[] args) {
		Queue<String> filaCliente = new LinkedList<String>();
		String nome = "";
		Scanner leia = new Scanner(System.in);
		int opcao;
		Iterator<String> remova = filaCliente.iterator();

		do {
			System.out.println("----------------------------------------");
			System.out.println("1: Adicionar um novo Cliente na fila");
			System.out.println("2: Listar todos os Clientes na fila");
			System.out.println("3: Chamar (retirar) um Cliente da fila");
			System.out.println("0: Finalizar o programa");
			System.out.print("\nEscolha uma opção: \n");
			System.out.println("----------------------------------------");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do cliente: \n");
				nome = leia.next();
				filaCliente.add(nome);
				System.out.println("\nCliente adicionado na fila\n" + filaCliente);

				break;

			case 2:
				if (filaCliente.isEmpty()) {
					System.out.println("A fila estar vazia!");
				} else {
					System.out.print("\nListas de clientes na fila:\n  ");
					for (String Cliente : filaCliente) {
						System.out.println("- " + Cliente);
					}

				}

				break;

			case 3:
				if (filaCliente.isEmpty()) {
					System.out.print("A fila esta vazia");
				} else {
					filaCliente.remove();
					System.out.println("Fila: ");
					for (String Cliente : filaCliente) {
						System.out.println("- " + Cliente);
					}

					System.out.println("O Cliente foi chamado");

				}

				break;

			case 0:
				System.out.println("Programa finalizado.");
				break;

			default:
				System.out.println("Opção inválida.");
			}
		} while (opcao != 0);
	}
}
