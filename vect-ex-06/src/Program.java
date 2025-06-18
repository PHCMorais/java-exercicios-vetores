import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em
		 * seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
		 * elementos correspondentes de A e B. Imprima o vetor C gerado.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor: ");
		int n = sc.nextInt();

		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];

		//Cria o vetor A
		System.out.println("Digite os valores do vetor A");
		for (int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		//Cria o vetor B
		System.out.println("Digite os valores do Vetor B");
		for (int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
			
		//Cria o vetor C
		for (int i = 0; i < vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
		}

		System.out.println("Vetor resultante:");
		for (int i = 0; i < vectC.length; i++)
			System.out.println(vectC[i]);
		sc.close();
	}

}
