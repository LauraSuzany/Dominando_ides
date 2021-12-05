package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		int a, b;
		System.out.println("Escreva o 1° valor: ");
		a = teclado.nextInt();
		System.out.println("Escreva o 2° valor: ");
		b = teclado.nextInt();
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao (a, b);
		int divisao = divisao(a, b);
		
		System.out.println("Soma: "+soma);
		System.out.println("Subtração: "+subtracao);
		System.out.println("Multiplicação: "+multiplicacao);
		System.out.println("Divisão: "+divisao);
	}
	public static int soma(int a, int b) {
		return a + b;
		
	}
	public static int subtracao(int a, int b) {
		return a - b;
		
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
		
	}
	public static int divisao(int a, int b) {
		return a / b;
		
	}

}
