package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Application {

	public static void main(String[] args) {
		/*
		 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
		 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
		 * média de altura das mulheres, e o número de homens
		 * 
		 * 
		 * CHECKLIKST
		 *  - Criar conjunto de dados contendo a altura e o gênero (M, F) de N pessoas; OK
		 *  - Calcular e escrever a maior altura do grupo; OK
		 *  - Calcular e escrever a menor altura do grupo; OK
		 *  - Calcular e escrever a média de altura das mulheres;
		 *  - Qtd de homens.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		//cria o vetor e adiciona as pessoas nela. 
		
		System.out.print("Quantas pessoas você vai digitar: ");
		int n = sc.nextInt();
		Person[] pessoas = new Person[n];
		
		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("Digite a altura da %dª pessoa: ", i+1);
			double height = sc.nextDouble();
			System.out.printf("Genero da %dª pessoa: ", i+1);
			char gender = sc.next().charAt(0);
			pessoas[i] = new Person(gender, height);
		}
		
		//Loop para verificar o maior e menor
		double maior = 0, menor = 0;
		for (int i = 0; i < pessoas.length; i++) {
			if (i == 0) {
				maior = pessoas[i].getHeight();
				menor = pessoas[i].getHeight();
			} else if(maior < pessoas[i].getHeight()) {
				maior = pessoas[i].getHeight();
			} else if (menor > pessoas[i].getHeight()) {
				menor = pessoas[i].getHeight();
			}
		}
		
		System.out.println("MENOR ALTURA: " + menor);
		System.out.println("MAIOR ALTURA: " + maior);
		
		// Loop para verificar quantas mulheres e homens tem no vetor e soma suas alturas
		int qtdM = 0, qtdH = 0;
		double sum = 0;
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getGender() == 'f') {
				qtdM++;
				sum += pessoas[i].getHeight();
			} else {
				qtdH++;
			}		
		}
		
		double avg = sum / qtdM; // calcula média de altura mulheres
		System.out.printf("MÉDIA DA ALTURA DAS MULHERES %.2f%n", avg);
		System.out.println("QUANTIDADE DE HOMENS: " + qtdH);
		sc.close();
		
	}

}
