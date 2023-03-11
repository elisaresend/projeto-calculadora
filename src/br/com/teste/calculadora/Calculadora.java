package br.com.teste.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[]args) {
		try (Scanner scan = new Scanner(System.in)) {
			int a,b;		
			System.out.println("Digite o primeiro valor: ");
			a = scan.nextInt();
			System.out.println("Digite o segundo valor: ");
			b = scan.nextInt();
			
			int soma = soma(a,b);
			int subtracao = subtracao(a,b);
			int multiplicacao = multiplicacao(a,b);		
			double divisao = divisao(a,b);
				
			System.out.println(String.format("O resultado da soma �: %d \n", soma));
			System.out.println(String.format("O resultado da subtra��o �: %d \n", subtracao));
			System.out.println(String.format("O resultado da divis�o �: %.2f \n", divisao));
			System.out.println(String.format("O resultado da multiplicacao �: %d \n", multiplicacao));
		}
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static double divisao(double a, double b) {
		return a / b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	
}
