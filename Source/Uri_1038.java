/*
 *Solved by: Felippe George Haeitmann
 *Email: felippegeorge@utexas.edu
 *Problem source: urionlinejudge.com.br
 *
 
**/
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        StringBuilder resposta = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x ,y;
        double total;
         
        Double preco[] = {4.00,4.50,5.00,2.00,1.50};
        String[] temporario = br.readLine().split(" ");
         
        x = Integer.parseInt(temporario[0]);
        y = Integer.parseInt(temporario[1]);
         
        total = preco[x-1] * y;
         
        System.out.format("Total: R$ %.2f\n",total);
    
}
         
    }