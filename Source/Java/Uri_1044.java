/*
 *Solved by: Felippe George Haeitmann
 *Email: felippegeorge@utexas.edu
 *Problem source: urionlinejudge.com.br
 *
 
**/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Uri_1044 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = 0;
		int b = 0;
		int shift = 0;
		String[] aux = br.readLine().split(" ");
		
		a = Integer.parseInt(aux[0]);
		b = Integer.parseInt(aux[1]);
		if(b > a){
			shift = a;
			a = b;
			b = shift;
		}
		
		if(((a % b) == 0)){
			System.out.println("Sao Multiplos");
		}else{
			System.out.println("Nao sao Multiplos");
		}
		
		
	}

}
