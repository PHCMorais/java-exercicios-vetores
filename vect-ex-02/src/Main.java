import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
		 * média dos elementos do vetor
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		int n = 4;
		double[] valores = new double[n];
		double soma = 0;

		
		//insere os valores no vetor e já faz a soma de cada um dos elementos
		for (int i=0; i<valores.length; i++) {
			System.out.print("Digite um número: ");
			valores[i] = sc.nextDouble();
			soma += valores[i];
		}
		
		//imprime os valores do vetor
		System.out.print("VALORES = ");
		for (int i=0; i<valores.length;i++) {
			System.out.printf("%.1f ", valores[i]);
		}
		
		
		System.out.println();
		
		//imprime soma
		System.out.printf("SOMA = %.2f%n", soma);
		
		//calcula média e imprime a média
		double media = soma/valores.length;
		System.out.printf("MÉDIA = %.2f%n", media);
		
		sc.close();

	}

}
