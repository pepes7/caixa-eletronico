package iu;
import java.util.ArrayList;

import negocio.Cliente;
import negocio.ContaCorrente;
import negocio.Transacao;

public class CaixaEletronico {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Gabriel Pepes", "87456995", "Rua Piriri, 876 - Compensa");
		ContaCorrente contaCorrente = new ContaCorrente(547, 478);

		contaCorrente.depositar(1500);
		contaCorrente.sacar(500);

		System.out.println("Client: " + cliente.getNome());
		System.out.println("Número da conta: " + contaCorrente.getNumeroConta());
		System.out.println("Agência: " + contaCorrente.getNumeroAgencia());
		System.out.println("Saldo: " + contaCorrente.getSaldo());
		System.out.println("===========================================");
		System.out.println("Extrato");
		
		ArrayList<Transacao> transacao =  contaCorrente.getExtrato();
		for(int i = 0; i < transacao.size(); i++) {
			System.out.println("Operação: " +transacao.get(i).operacao);
			System.out.println("Valor: " +transacao.get(i).valor);
			System.out.println("Saldo: " +transacao.get(i).valorSaldo);
			System.out.println("===========================================");
		}
	}
}
