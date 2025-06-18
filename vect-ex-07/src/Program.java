import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro N e depois um vetor de N números
		 * reais. Em seguida, mostrar na tela a média aritmética de todos elementos com
		 * três casas decimais. Depois mostrar todos os elementos do vetor que estejam
		 * abaixo da média, com uma casa decimal cada.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementor vai ter o vetor? ");
		int n = sc.nextInt();

		// Cria o vetor e adiciona o valor a soma.
		double sum = 0;
		double[] vect = new double[n];
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}

		// Calcula e imprime a média
		double avg = sum / vect.length;
		System.out.printf("MÉDIA DO VETOR %.3f%n", avg);
		
		// imprime os valores abaixo da média:
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < avg) {
				System.out.println(vect[i]);
			}
		}

		sc.close();

	}

}
