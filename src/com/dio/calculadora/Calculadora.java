package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
				
	int a, b;
		
	System.out.println("Digite o primeiro valor: ");
	a = scan.nextInt();
	System.out.println("Digite o segundo valor: ");
	b = scan.nextInt();
	
	int soma = soma(a,b);
	int subtracao = subtracao(a,b);
	int multiplicacao = multiplicacao(a,b);
	int divisao = divisao(a,b);
	
	System.out.println(soma);
	System.out.println(subtracao);
	System.out.println(multiplicacao);
	System.out.println(divisao);
	
	}
	
	private static int subtracao(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int soma(int a, int b) {
 	   return a + b;
	}
	
	public static int subtrtacao(int a, int b) {
		return a - b;
	}
	
	public static int divisao(int a, int b) {
		return a / b;
	}
	
	public static int multiplicacao(int a, int b) {
	    return a * b;
	}
}
	
	
	
	
	
	
	
	
	