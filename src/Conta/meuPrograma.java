package Conta;

public class meuPrograma {
	public static void main(String[] args) {
		System.out.println("Instanciando meu primeiro objeto!");
		conta contaLucas = new conta();
		contaLucas.dono="Lucas";
		contaLucas.saldo=1500.0;
		
		System.out.println("Saldo Atual: " +contaLucas.saldo);
		
		contaLucas.sacar(200);
		System.out.println("Saque efetuado.");
		
		System.out.println("Saldo Atual: " +contaLucas.saldo);
		
		contaLucas.depositar(500);
		System.out.println("Depósito efetuado.");
		
		System.out.println("Saldo Atual: " +contaLucas.saldo);
	}
}
