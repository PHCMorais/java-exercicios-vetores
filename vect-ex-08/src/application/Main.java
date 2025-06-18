package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um vetor de N números inteiros. Em seguida,
		 * mostrar na tela a média aritmética somente dos números pares lidos, com uma
		 * casa decimal. Se nenhum número par for digitado, mostrar a mensagem
		 * "NENHUM NUMERO PAR"
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		int count = 0, sum = 0;
		
		//vetor recebe os elementos
		for (int i = 0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			//se for par, conta +1 e adiciona na soma
			if (vect[i]%2 == 0 ) {
				count++;
				sum+=vect[i];
			}
		}
		
		//calculo de média e impressão.
		
		if (count > 0) {
			double avg = sum/count;
			System.out.println("MÉDIA DE NÚMEROS PARES: " + avg);
		}else {
			System.out.println("NENHUM NÚMERO PAR");
		}
		
		
		
		
		sc.close();
		

	}

}
