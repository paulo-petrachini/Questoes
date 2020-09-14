
public class Questao {
	private String enunciado;
	private String resposta;
	
	public Questao(String enunciado, String resposta) {
	this.enunciado = enunciado;
	this.resposta = resposta;
	}
	
	public String apresentarQuestao() {
		return enunciado;
	}
	
	public boolean corrigir(String resposta) {
		if (this.resposta.equals(resposta)) {
			return true;
		}
		else
			return false;
	}
	
}
