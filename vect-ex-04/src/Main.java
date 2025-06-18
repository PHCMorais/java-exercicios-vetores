import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
		 * seguida, mostre na tela todos os números pares, e também a quantidade de
		 * números pares.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		//armazena os números em um vetor
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		System.out.println();
		
		//imprime os pares e conta quantos tem
		int cont =0;
		System.out.println("Numeros Pares: ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i]%2 == 0) {
				System.out.print(vect[i] + " ");
				cont++;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Quantidade de pares = " + cont);
		sc.close();
	}

}
