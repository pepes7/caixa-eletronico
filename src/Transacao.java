
public class Transacao {
	public String operacao;
	public float valor;
	public float valorSaldo;
	public String dataHora;
	
	public Transacao(float valorSaldo, String operacao, float valor) {
		this.valorSaldo = valorSaldo;
		this.valor = valor;
		this.operacao = operacao;
	}
}
