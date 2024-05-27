package desafio1;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {

	public static void main(String[] args) {
		
	   // Leitor para o numero inserido pelo usuario 	
		 Scanner scanner = new Scanner(System.in);
	   // Gera um número inteiro aleatório entre 0 (inclusive) e 100 (exclusive)
	     int numeroAleatorio = new Random().nextInt(100);
	     int contador = 0;
		 int numDigitado = 0;

		 while (contador < 5 ) {
			 
			 System.out.print("Digite um número entre 0 e 100: ");
			 numDigitado = scanner.nextInt();
			 contador++;
			 
			 if(numeroAleatorio == numDigitado) {
				 System.out.println("Parabéns, você acertou o número em  " + contador + "tentativas!");
				 break; // interrompe o loop
			 } else if (numeroAleatorio < numDigitado) {
				 System.out.println("O número digitado é menor que o número gerado.");
			 } else {
	                System.out.println("O número digitado é maior que o número gerado.");
	         }		 
			 
		 }
		 
	        if (contador == 5 && numDigitado != numeroAleatorio) {
	             System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroAleatorio);
	        }
	}

}