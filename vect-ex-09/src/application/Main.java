package application;

import java.util.Scanner;

import entities.Person;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		Person[] vect = new Person[n];

		// Criação das pessoas no vetor
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %da pessoa:%n", i + 1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			sc.nextLine();

			vect[i] = new Person(name, age);
		}

		// verificação da mais velha
		int maior = vect[0].getAge(), position = 0;

		for (int i = 1; i < vect.length; i++) {
			if (vect[i].getAge() > maior) {
			    maior = vect[i].getAge();
			    position = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + vect[position].getName());

		sc.close();
	}

}
