package contas;

public class TesteSaqueNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(4887);
		conta.sacar(5000);
		System.out.println(conta.getSaldo());
		
		// conta.saldo = conta.saldo - 5000;
		// System.out.println(conta.getSaldo());
	}
}
