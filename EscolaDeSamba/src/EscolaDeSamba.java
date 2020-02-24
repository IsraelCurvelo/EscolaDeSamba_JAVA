import javax.swing.JOptionPane;

public class EscolaDeSamba {
	public String nome;

	public double[] quesito;
	public double total;


	public EscolaDeSamba(String nome, double[] quesito, double total) {

		this.nome = nome;
		this.quesito = quesito;
		this.total = total;
	}

	public EscolaDeSamba() {

	}

	public EscolaDeSamba(String nome, double[] quesito) {

		this.nome = nome;
		this.quesito = quesito;
	}
	

	public double calcularMedia(double[] notaQuesito) {

		double maior = Integer.MIN_VALUE;
		int posicaoMaior = 0;
		int posicaoMenor = 0;
		double menor = Integer.MAX_VALUE;
		double soma = 0;

		for (int i = 0; i < notaQuesito.length; i++) {
			if (notaQuesito[i] > maior) {
				maior = notaQuesito[i];
				posicaoMaior = i;

			}

			if (notaQuesito[i] < menor) {
				menor = notaQuesito[i];
				posicaoMenor = i;
			}

		}
		JOptionPane.showMessageDialog(null, "MAIOR NOTA PARA CORTE: " + maior + "\nMENOR NOTA PARA CORTE: " + menor);
		for (int i = 0; i < notaQuesito.length; i++) {
			notaQuesito[posicaoMaior] = (double) 0;
		}

		for (int i = 0; i < notaQuesito.length; i++) {
			notaQuesito[posicaoMenor] = (double) 0;
		}

		for (int i = 0; i < notaQuesito.length; i++) {
			soma = soma + notaQuesito[i];
		}
		JOptionPane.showMessageDialog(null,"NOTA TOTAL: "+ soma);
		
		return soma;
	}
	
	
	public String toString(EscolaDeSamba[]objeto) {
		String resumo =  nome +" || NOTA :"+ total;
		return resumo;
	}
	
	public String toString(Double [] vetor) {
		String resumo =  "Nota 1 : "+ vetor[0]
						+"Nota 2 : "+ vetor[1]
						+"Nota 3 : "+ vetor[2]
						+"Nota 4 : "+ vetor[3]
						+"Nota 5 : "+ vetor[4]
						+"Nota 6 : "+ vetor[5]
						+"Nota 7 : "+ vetor[6]
						+"Nota 8 : "+ vetor[7]
						+"Nota 9 : "+ vetor[8]
						+"Nota 10 : "+ vetor[9];
		return resumo;
	}
	
}

		
		