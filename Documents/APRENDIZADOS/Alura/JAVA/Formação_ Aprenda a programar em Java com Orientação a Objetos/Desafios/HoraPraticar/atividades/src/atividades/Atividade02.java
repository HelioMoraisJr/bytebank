// 2.Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

package atividades;

import java.util.Scanner;

public class Atividade02 {
	
	public void main(String[] args) {

	Scanner leitorFirst = new Scanner(System.in);
	Scanner leitorSecond = new Scanner(System.in);
	int numFirst = 0;
	int numSecond = 0;
	
	System.out.print("Digite o primeiro número: ");
	numFirst = leitorFirst.nextInt();
	
	System.out.print("Digite o segundo número: ");
	numSecond = leitorSecond.nextInt();
	
	
	if(numFirst == numSecond) {
		System.out.println("OS números são iguais!");
	} else if (numFirst > numSecond){
		System.out.println("O primeiro numero é maior!");
	} else {
		System.out.println("O segundo numero é maior!");
	}
	
	
	leitorFirst.close();
	leitorSecond.close();
	}	
	
	
}
