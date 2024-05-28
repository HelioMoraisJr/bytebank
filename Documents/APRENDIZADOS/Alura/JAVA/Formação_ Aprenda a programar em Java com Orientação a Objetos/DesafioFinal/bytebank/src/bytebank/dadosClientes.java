package bytebank;

import java.util.Scanner;

public class dadosClientes {

	public static void main(String[] args) {
		
		String nome = "Helio  Junior";
		String tipoConta = "Corrente";
		double saldoInicial = 2500.00;
		int op = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***********************");
		System.out.println("Dados inicias do cliente: \n");
		System.out.println("Nome: " + nome);
		System.out.println("Tipo conta: " + tipoConta);
		System.out.println("Saldo inicial: " + saldoInicial);
		System.out.println("\n***********************");		

		
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair

                """;
		
		while(op != 4) {
			System.out.println(menu);
			 op = scanner.nextInt();
			 
			 if(op == 1) {
				 
				 System.out.println("Saldo atualizado em: " + saldoInicial);
			 } else if (op == 2){
				 System.out.println(" Qual o valor da tranferencia: ");
				 double valor =  scanner.nextDouble();
				 if(valor > saldoInicial) {
					 System.out.println("Saldo insuficente.");
				 } else {
					 System.out.println("Saldo atualizado em: " + (saldoInicial -= valor)); 
				 }
				 
				 
			 } else if (op == 3) {
				 System.out.println("Valor a recebido: ");
				 double valor = scanner.nextDouble();
				 
				 System.out.println("Saldo atualizado em: " + (saldoInicial += valor)); 
			 } else if (op != 4)
				 System.out.println("OPÇÃO INVÁLIDA");
			}
		}
		
}
