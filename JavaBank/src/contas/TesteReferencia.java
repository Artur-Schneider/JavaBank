package contas;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(300);
		System.out.println("O saldo da primeira conta é: " + primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		System.out.println("O saldo da segunda conta é: " + segundaConta.getSaldo());
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		}
		
		segundaConta.deposita(100);
		System.out.println("Agora o saldo da segunda conta é: " + segundaConta.getSaldo());
		System.out.println("Agora o saldo da primeira conta é: " + primeiraConta.getSaldo());
		System.out.println("Isso acontece por causa do 'new Conta'");
	}
}
