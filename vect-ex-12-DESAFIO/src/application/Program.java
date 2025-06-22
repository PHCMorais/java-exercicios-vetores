package application;

import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que inicie com todos os dez quartos vazios
		 * e depois leia uma quantidade N representando o número de estudantes
		 * que vão alugar os quartos. (N pode ser de 0 a 10). Em seguida,
		 * registre o aluguel dos N estudantes
		 * Para cada registro de aluguel, informar nome e email do estudante,
		 * bem como o qual dos quartos ele escolheu (de 0 a 9). Suponha que seja
		 * escolhido um quarto vago. Ao final, seu programa deve imprimir um 
		 * relatório simples de todas ocupações do pensionato por ordem de quarto,
		 * conforme o exemplo. 
		 * 
		 * 	CHECKLIST 
		 * - criar os quartos (0,9)
		 * - Criar os alunos (nome , email)
		 * - Imprimir qual quarto ele escolheu + nome + email
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		Rooms[] rooms = new Rooms[10]; //criar os 10 quartos numerados de 0 a 9
		
		//cria o vetor quartos
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d%n", i+1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: "); //pega o número do quarto e já atribui diretamente na posição do vetor correta
			int room = sc.nextInt();
			rooms[room] = new Rooms(name, email);
		}
		
		
		//imprime os quartos ocupados:
		System.out.println("Busy Rooms: ");
		for (int i=0; i<rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.printf("%d: %s, %s%n", i, rooms[i].getName(), rooms[i].getEmail()) ;			
				}
		}
		sc.close();
	}

}
