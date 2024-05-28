// 1,Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

package atividades;

import java.util.Scanner;

public class Atividade01 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numDigitado = 0;
		
		System.out.print("Digite um numero:");
		numDigitado = sc.nextInt();
		
		if(numDigitado >= 0) {
			System.out.println("Número positivo!!");
		} else {
			System.out.println("Número negativo!!");
		}
	
		sc.close();
		
	}
}


