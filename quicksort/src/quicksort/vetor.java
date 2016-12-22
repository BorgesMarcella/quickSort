package quicksort;

import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {

		Scanner tamanhoVetor = new Scanner(System.in);

		System.out.println("Quantos numeros deseja ordenar? ");
		Integer tam = tamanhoVetor.nextInt();
		int[] valores = new int[tam];
		for (int x = 0; x < valores.length; x++) {
			System.out.println("Entre com os valores do vetor");
			valores[x] = tamanhoVetor.nextInt();

		}

		Ordenacao sort = new Ordenacao (valores);
		sort.inicia();
		System.out.println("a ordem crescente dos numeros é : ");
		for (int i : valores) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

}