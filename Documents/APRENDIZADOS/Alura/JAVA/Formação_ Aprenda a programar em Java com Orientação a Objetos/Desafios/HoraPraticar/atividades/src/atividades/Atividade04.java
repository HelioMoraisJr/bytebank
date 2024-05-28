// 4. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
package atividades;

import java.util.Scanner;

public class Atividade04 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
    }
}