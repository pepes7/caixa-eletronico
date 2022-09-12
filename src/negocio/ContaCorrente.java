package negocio;
import java.util.ArrayList;

public class ContaCorrente {
	private float saldo;
	private int numeroConta;
	private int numeroAgencia;
	private ArrayList<Transacao> transacoes;

	public ContaCorrente(int numeroAgencia, int numeroConta) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = 0.0f;
		this.transacoes = new ArrayList<Transacao>();
	}

	public void depositar(float v) {
		this.saldo += v;
		Transacao t = new Transacao(this.saldo,"depósito", v);
		this.registrarTransacao(t);
	}

	public boolean sacar(float v) {
		if(v > this.saldo) {
			return false;
		}
		this.saldo -= v;
		Transacao t = new Transacao(this.saldo,"saque", v);
		this.registrarTransacao(t);
		return true;	
	}


	private void registrarTransacao(Transacao transacao) {
		this.transacoes.add(transacao);
	}

	public ArrayList<Transacao> getExtrato() {
		return this.transacoes;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public int getNumeroAgencia() {
		return this.numeroAgencia;
	}
}
