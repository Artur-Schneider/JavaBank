package contas;

public class TestandoMetodo {
	public static void main(String[] args) {
		Conta contaDoArtur = new Conta();
		
		contaDoArtur.deposita(87.23);
		System.out.println("Sua conta tem " + contaDoArtur.getSaldo() + " reais.");
		
		contaDoArtur.deposita(82.46);
		System.out.println("Agora sua conta tem " + contaDoArtur.getSaldo() + " reais.");
		
		contaDoArtur.sacar(30);
		System.out.println("Você possui " + contaDoArtur.getSaldo() + " reais em sua conta bancária.");
		
		Conta contaDaLuiza = new Conta();
		contaDaLuiza.deposita(1000);
		System.out.println("A conta da Luiza possui um saldo de " + contaDaLuiza.getSaldo() + " reais.");
		
		contaDaLuiza.transfere(300, contaDoArtur);
		System.out.println("O saldo da Luiza após a transferência é de " + contaDaLuiza.getSaldo() + " reais.");
		System.out.println("O saldo do Artur após a transferência é de " + contaDoArtur.getSaldo() + " reais.");
	}
}
