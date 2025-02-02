package collections;

import java.util.ArrayList;

public class ExemploCollections {

	public static void main(String[] args) {

		// Cria a Collection ArrayList, do tipo Double, chamada notas
		ArrayList<Double> notas = new ArrayList<Double>();

		// Cria um Objeto da Classe Wrapper Double
		Double y = Double.valueOf(9);
		

		/**
		 * Adiciona algumas Notas. Observe que a primeira nota é o Objeto Wrapper
		 * Double.
		 */
		notas.add(y);
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);

		/**
		 * Mostra na tela todas as notas adicionadas. Observe que a nota duplicada foi
		 * adicionada duas vezes.
		 */
		System.out.println("\nNotas cadastradas: " + notas);

		/**
		 * Mostra a posição (indice) de uma determinada nota. Caso existam 2 notas
		 * iguais será exibida a posição da primeira nota encontrada.
		 */
		System.out.println("\nA posição da nota 5 é: " + notas.indexOf(5d));

		// Mostra se uma determinada nota existe na lista
		System.out.println("\nA nota 5 existe na lista? " + notas.contains(5d));

		// Mostra a nota inserida em uma determinada posição (indice)
		System.out.println("\nNa posição 1 da lista, a nota é: " + notas.get(1));

		// Altera a nota 5.0 para 6.0 e mostra que a alteração foi efetuada
		notas.set(notas.indexOf(5d), 6.0d);
		System.out.println("\nA nota 5 foi alterada para 6: " + notas);

		/**
		 * Apaga a nota 4.0 e mostra que a exclusão foi efetuada. Observe que apenas a
		 * primeira nota 4.0 foi apagada.
		 */
		notas.remove(notas.indexOf(4.0d));
		System.out.println("\nA nota 4 foi apagada: " + notas);

		// Checa se a lista está vazia
		System.out.println("\nA lista está vazia? " + notas.isEmpty());

		// Exibe o tamanho da lista (numero de elementos)
		System.out.println("\nO tamanho da lista é: " + notas.size());

		// Limpa a lista e mostra que ela está vazia
		notas.clear();
		System.out.println("\nA lista está vazia: " + notas);

	}

}
