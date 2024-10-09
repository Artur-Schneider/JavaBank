package contas;

import cliente.Cliente;

//saldo, agencia, numero e titular.

public class Conta {
	private double saldo;
	private int agencia = 42;
	private int numero;
	private Cliente titular;

	public void deposita(double valor) {
		this.saldo = this.saldo + valor; //this.saldo += valor;
		System.out.println("O valor de " + valor + " reais foi depositado.");
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor; //this.saldo -= valor;
			System.out.println("Você sacou " + valor + " reais.");
			return true;
		} else {
			System.out.println("Saque NEGADO. O valor do saque é maior do que o saldo total em sua conta.");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			System.out.println("Saldo insuficiente para a realização da transferência");
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public double getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		if (novoNumero >= 1) {
		this.numero = novoNumero;
		} else {
			System.out.println("Número inválido.");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}