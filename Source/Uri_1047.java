import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *Solved by: Felippe George Haeitmann
 *Email: felippegeorge@utexas.edu
 *Problem source: urionlinejudge.com.br
 *
 
**/

public class Uri_1047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int[] vet = new int[4];
		int pri = 0;
		int seg = 0;
		int aux = 0;
		int hor = 0;
		int min = 0;
		
		for (int i = 0; i < 4; i++){
			vet[i] = Integer.parseInt(temp[i]);
		}
		
		pri = ((vet[0] * 60) + vet[1]);
		seg = ((vet[2] * 60) + vet[3]);
				
		if (pri >= seg){
			aux = ((1440 - pri) + seg); 
		}else{
			aux = seg - pri;
		}
		
		hor = aux / 60;
		min = aux % 60;
		
		System.out.println("O JOGO DUROU " + hor + " HORA(S) E " + min + " MINUTO(S)");

	}

}
