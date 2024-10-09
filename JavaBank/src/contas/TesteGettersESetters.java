package contas;

import cliente.Cliente;

public class TesteGettersESetters {
	public static void main(String[] args) {
		
		Conta contaDaLu = new Conta();
		contaDaLu.setNumero(11);
		System.out.println(contaDaLu.getNumero());
		
		Cliente cliente = new Cliente();
		cliente.setCPF("256.322.148-03");
		cliente.setNome("Luiza Schaedler");
		cliente.setProfissao("Direitista e Corretora de Imóveis");
		contaDaLu.setTitular(cliente);
		
		System.out.println(contaDaLu.getTitular().getCPF());
	}
}
