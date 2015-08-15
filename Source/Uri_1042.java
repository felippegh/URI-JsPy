/*
 *Solved by: Felippe George Haeitmann
 *Email: felippegeorge@utexas.edu
 *Problem source: urionlinejudge.com.br
 **/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri_1042 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int fir = 0;
		int sec = 0;
		int thi = 0;
		int ord1 = 0;
		int ord2 = 0;
		int ord3 = 0;

		String[] aux = br.readLine().split(" ");
		fir = Integer.parseInt(aux[0]);
		sec = Integer.parseInt(aux[1]);
		thi = Integer.parseInt(aux[2]);

		if ((fir < sec) && (fir < thi) && (sec < thi)) {
			ord1 = fir;
			ord2 = sec;
			ord3 = thi;
		} else if ((fir < sec) && (fir < thi) && (thi < sec)) {
			ord1 = fir;
			ord2 = thi;
			ord3 = sec;
		} else if ((fir > sec) && (fir > thi) && (thi < sec)) {
			ord1 = thi;
			ord2 = sec;
			ord3 = fir;
		} else if ((sec < fir) && (fir < thi) && (thi > sec)) {
			ord1 = sec;
			ord2 = fir;
			ord3 = thi;
		} else if ((sec < fir) && (fir > thi) && (thi > sec)) {
			ord1 = sec;
			ord2 = thi;
			ord3 = fir;
		} else if ((sec > fir) && (fir > thi) && (thi < sec)) {
			ord1 = thi;
			ord2 = fir;
			ord3 = thi;
		}

		System.out.println(ord1);
		System.out.println(ord2);
		System.out.println(ord3);
		System.out.println("");
		System.out.println(fir);
		System.out.println(sec);
		System.out.println(thi);

	}

}
