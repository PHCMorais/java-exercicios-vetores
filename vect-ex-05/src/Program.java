import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida, mostrar na tela o maior número do vetor (supor não haver empates).
		 * Mostrar também a posição do maior elemento, considerando a primeira posição
		 * como 0 (zero).
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double maior = 0;
		int position = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if (vect[i] > maior) {
				maior = vect[i];
				position = i;
			}
		}

		System.out.println();
		System.out.println("Maior valor: " + maior);
		System.out.println("Posição do maior valor = " + position);
		sc.close();

	}

}
