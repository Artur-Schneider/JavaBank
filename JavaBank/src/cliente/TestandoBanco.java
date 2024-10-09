package cliente;

import contas.Conta;

public class TestandoBanco {
	public static void main(String[] args) {
		Cliente Artur = new Cliente();
		Artur.setNome("Artur G. Schneider");
		Artur.setCPF("040.380.860-03");
		Artur.setProfissao("Programador");
		System.out.println("O nome do cliente é: " + Artur.getNome());
		System.out.println("O CPF do cliente é: " + Artur.getCPF());
		System.out.println("A Profissão do cliente é: " + Artur.getProfissao());
		
		Cliente Luiza = new Cliente();
		
		Conta contaDaLuiza = new Conta();
		contaDaLuiza.setTitular(Luiza);
		System.out.println("O Saldo da Luiza é: " + contaDaLuiza.getSaldo());
		
		Conta contaDoArtur = new Conta();
		contaDoArtur.setTitular(Artur);
		contaDoArtur.deposita(1250.26);
		contaDoArtur.sacar(567.38);
		contaDoArtur.transfere(230, contaDaLuiza);
		contaDoArtur.getTitular().setNome("Artur");
		System.out.println("O Saldo do Artur é: " + contaDoArtur.getSaldo());
		System.out.println("O Saldo da Luiza é: " + contaDaLuiza.getSaldo());
		System.out.println(contaDoArtur.getTitular().getNome());
		
		
		//contaDoArtur.titular = Artur;
		//System.out.println(contaDoArtur.titular.nome);
	}
}
