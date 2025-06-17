import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois
		 * N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
		 * todos os números negativos lidos.
		 */
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] valores = new int[n];
		
		//pega os valores e armazena no vetor VALORES
		for (int i=0; i<n; i++) {
			valores[i] = sc.nextInt();
		}
		
		//imprime os negativos
		System.out.println("Valores Negativos");
		for (int i=0; i<n; i++) {
			if (valores[i]<0) {
				System.out.println(valores[i]);
			}
		}

		sc.close();

	}

}
