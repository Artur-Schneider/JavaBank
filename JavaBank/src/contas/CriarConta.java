package contas;

public class CriarConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(200.50);
		System.out.println("O saldo da primeira conta é " + primeiraConta.getSaldo()+ " Reais");
		
		primeiraConta.deposita(100);
		System.out.println("A conta recebeu mais R$100,00");
		System.out.println("Agora, o saldo da conta é " + primeiraConta.getSaldo() + " Reais");
		
		Conta segundaConta = new Conta();
		segundaConta.deposita(50);
		System.out.println("O Saldo da segunda conta é " + segundaConta.getSaldo() + " Reais");
		
		System.out.println(segundaConta.getNumero());
	}
}
