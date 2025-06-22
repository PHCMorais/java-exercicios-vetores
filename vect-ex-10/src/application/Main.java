package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	/*
	 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
	 * notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve
	 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
	 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0
	 * (seis).
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// recebe número de alunos e cria o vetor com os alunos
		System.out.println("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		Student[] vect = new Student[n];
		sc.nextLine();
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Nota 1:");
			double n1 = sc.nextDouble();
			System.out.print("Nota 2: ");
			double n2 = sc.nextDouble();
			sc.nextLine();
			vect[i] = new Student(name, n1, n2);
		}

		// Verifica quem foi aprovado e imprime
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getResult()) {
				System.out.println("Alunos Aprovados: ");
				System.out.println(vect[i].getName());
			}
		}

		sc.close();

	}

}
