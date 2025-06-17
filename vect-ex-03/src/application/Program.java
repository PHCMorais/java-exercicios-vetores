package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		 System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		//int n = 2;
		Person[] person = new Person[n];

		// Pega as informações das pessoas e insere no vetor PERSON

		for (int i = 0; i < person.length; i++) {
			System.out.printf("Dados da %dª pessoa%n", i + 1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			sc.nextLine();

			person[i] = new Person(name, age, height);

		}

		// ALTURA MÉDIA
		System.out.println();
		double sum = 0.0;
		for (int i = 0; i < person.length; i++) {
			sum += person[i].getHeight();
		}
		double avg = sum / person.length;
		System.out.printf("Altura média: %.2f%n", avg);

		// PORCENTAGEM Pessoas com menos de 16 anos
		int cont = 0;
		for (int i = 0; i < person.length; i++) {

			if (person[i].getAge() < 16) {
				cont++;
			}
		}
		double porcent = ((double) cont / person.length) * 100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n ", porcent);

		// Imprime os nomes dos menores
		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}
		}

		sc.close();

	}

}
