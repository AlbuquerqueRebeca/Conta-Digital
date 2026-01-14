package OrientaçãoObjetos;

import java.util.Scanner;

public class Conta {

//atributo 
	
		private int numero;
		private String agencia;
		private String nomeCliente;
		private double saldo;
		        double deposito;
		        double saque;
		        double tranferencia;
		
		
		
		
		
		//metodos 
		
		public void adicionarNumero() {
			Scanner entrada = new Scanner(System.in);
			System.out.print("Digite o número da conta: ");
			this.numero = entrada.nextInt();
		}
		
		public void adicionarAgencia() {
			Scanner entrada = new Scanner(System.in);
			System.out.print("Digite o número da agência:");
			this.agencia = entrada.next();
		}
		
		public void digitarNome() {
			Scanner entrada = new Scanner(System.in);
			System.out.print("Digite seu nome: ");
			this.nomeCliente = entrada.next();
		}
		
		public void mostrarSaldo() {
			System.out.println("Seu saldo é: " + this.saldo);
		}
		
		public void fazerDeposito(double valor) {
			this.saldo += valor;
			
			System.out.println("deposito realizado: " + valor);
		}
		
		public void fazerSaque(double valor) {
			if (this.saldo >= valor) {
			this.saldo -= valor;
			
			System.out.println("Saque realizado: " + valor);
		} else {
			System.out.println("Saldo insuficiente para saque");
		}
		}
		public void fazerTransferencia(Conta destino, double valor) {
			if(this.saldo >= valor) {
		   this.fazerSaque(valor); 
		   destino.fazerDeposito(valor);
		   System.out.println("Transferência realizada: " + valor);
	       
			} else {
				System.out.println("Saldo insuficiente para transferência");
			}
		}

		
	
	  
      public static void main(String[] args) {
	   Scanner entrada = new Scanner(System.in);
       
	 
	   ContaPoupança conta1 = new ContaPoupança();
       
       conta1.adicionarNumero();
	   conta1.adicionarAgencia();
       conta1.digitarNome();
       
	   System.out.println("Digite o valor do depósito:  ");
       double valorDeposito = entrada.nextDouble();
       conta1.fazerDeposito(valorDeposito);

	   System.out.println("Digite o valor do saque:    ");
	   double valorSaque = entrada.nextDouble();
	   conta1.fazerSaque(valorSaque);

       conta1.mostrarSaldo();


       ContaCorrente conta2 = new ContaCorrente();
       conta2.adicionarNumero();
       conta2.adicionarAgencia();
       conta2.digitarNome();
        
	   System.out.println("Digite o valor da Transferência:  ");
	   double valorTransferencia = entrada.nextDouble();
	   conta2.fazerTransferencia(conta1, valorTransferencia);
	 
	 
	   conta1.mostrarSaldo();
	   conta2.mostrarSaldo();




	   
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	   entrada.close();
      
  
  
  







































      }   
}
