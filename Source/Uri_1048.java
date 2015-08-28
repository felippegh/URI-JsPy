import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Locale;

/*
 *Solved by: Felippe George Haeitmann
 *Email: felippegeorge@utexas.edu
 *Problem source: urionlinejudge.com.br
 *

 **/

public class Uri_1048 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linha = br.readLine();
		double salario = Double.parseDouble(linha);
		double reajuste;
		int porcentagem;

		if (salario <= 400) {
			porcentagem = 15;
			reajuste = salario * 0.15;
		} else if (salario <= 800) {
			porcentagem = 12;
			reajuste = salario * 0.12;
		} else if (salario <= 1200) {
			porcentagem = 10;
			reajuste = salario * 0.1;
		} else if (salario <= 2000) {
			porcentagem = 7;
			reajuste = salario * 0.07;
		} else {
			porcentagem = 4;
			reajuste = salario * 0.04;
		}

		System.out.printf(Locale.US, "Novo salario: %.2f\n", salario + reajuste);
		System.out.printf(Locale.US, "Reajuste ganho: %.2f\n", reajuste);
		System.out.println("Em percentual: " + porcentagem + " %");

	}

}
