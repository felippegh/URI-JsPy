/*
 *Solved by: Felippe George Haeitmann
 *Email: felippegeorge@utexas.edu
 *Problem source: urionlinejudge.com.br
 *
 
 **/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri_1045 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] temp = br.readLine().split(" ");
		double[] vet = new double[3];

		for (int i = 0; i < 3; i++) {
			vet[i] = Double.parseDouble(temp[i]);
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; ++j) {
				if (vet[j] < vet[j + 1]) {
					double aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}

		double a = vet[0];
		double b = vet[1];
		double c = vet[2];

		if (a >= (b + c)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if ((a * a) == ((b * b) + (c * c))) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if ((a * a) > ((b * b) + (c * c))) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if ((a * a) < ((b * b) + (c * c))) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if ((a == b) && (a == c)) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if (((a == b) && (b != c)) || ((b == c) && (c != a))
					|| ((a == c) && (c != b))) {
				System.out.println("TRIANGULO ISOCELES");
			}
		}
	}
}
