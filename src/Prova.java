import java.util.Scanner;

public class Prova {
	public static void main(String args[]) {
		Questao lista[];
		lista = new Questao[6];
		Scanner teclado = new Scanner(System.in);
		String respostaUsuario;

		lista[0] = new Questao("Quanto é 1+1", "2");
		lista[1] = new Questao("Quanto é 2+2", "4");
		lista[2] = new Questao("Quanto é 4+4", "8");
		lista[3] = new Questao("Quem descobriu o Brasil?", "Cabral");
		lista[4] = new Questao("Qual a data da Independência?", "7 de setembro");
		lista[5] = new Questao("Qual a capital da Itália?", "Roma");

		for (int posicao = 0; posicao < lista.length; posicao++) {
			System.out.println("Questao: " + lista[posicao].apresentarQuestao());
			respostaUsuario = teclado.nextLine();
			if (lista[posicao].corrigir(respostaUsuario) == true) {
				System.out.println("Você acertou");
			} else {
				System.out.println("Você errou");
			}
		}
	teclado.close();
	}
}
