package Conta;

public class conta {
	String dono;
	double saldo;
	
	boolean sacar(double quantidade) {
		if(this.saldo<quantidade) {
			return false;
		} else {
		double novoSaldo = this.saldo-quantidade;
		this.saldo=novoSaldo;
		return true;
	}
}

	
	void depositar(double quantidade) {
		this.saldo+=quantidade;
	}
}
