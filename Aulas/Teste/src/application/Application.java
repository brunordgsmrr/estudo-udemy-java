package application;

import java.util.Scanner;

import entities.Aluno;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos: ");
		int qtd = sc.nextInt();
		sc.nextLine();
		
		Aluno[] aluno = new Aluno[qtd];
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("Qual o nome do aluno: ");
			String nome = sc.nextLine();
			System.out.println("Qual o rgm do aluno: ");
			int rgm = sc.nextInt();
			sc.nextLine();
			aluno[i] = new Aluno(nome, rgm); 
		}
		
		for (Aluno obj : aluno) {
			System.out.println(obj.getNome());
			System.out.println(obj.getRgm());
		}
		
		
		sc.close();

	}

}
