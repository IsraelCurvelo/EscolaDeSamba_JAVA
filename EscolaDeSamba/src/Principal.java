
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double total;
		double[] vetor = new double[10];

		EscolaDeSamba[] objeto = new EscolaDeSamba[5];
		
			for (int i = 0; i < objeto.length; i++) {
			String nome = JOptionPane.showInputDialog(null, "Digite o nome da escola numero" + (i + 1) + " : ");

			JOptionPane.showMessageDialog(null, "Digite as notas");

			for (int j = 0; j < 10; j++) {
				
				
				String temporaria = JOptionPane.showInputDialog(null, "Nota" + (j + 1) + ": ");
				vetor[j] = Double.parseDouble(temporaria);
				

			}

			objeto[i] = new EscolaDeSamba();
			total = objeto[i].calcularMedia(vetor);
			objeto[i] = new EscolaDeSamba(nome, vetor, total);
			

		}

		sc.close();

		for (int i = 0; i < objeto.length; i++) {

			for (int j = 0; j < objeto.length; j++) {
				if (objeto[i].total > objeto[j].total) {
					EscolaDeSamba aux = objeto[i];
					objeto[i] = objeto[j];
					objeto[j] = aux;
				}
			}
		}
		JOptionPane.showMessageDialog(null,
				"***TOP RANKING***" 
						+ "\n1º: " + objeto[0].toString(objeto) 
						+ "\n2º: " + objeto[1].toString(objeto)
						+ "\n3º: " + objeto[2].toString(objeto) 
						+ "\n4º: " + objeto[3].toString(objeto) 
						+ "\n5º: " + objeto[4].toString(objeto));

	}
}
