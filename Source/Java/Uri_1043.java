import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Uri_1043 {

	public static void main(String[] args) throws IOException {
		double a = 0; 
		double b = 0;
		double c = 0;
		double peri = 0;
		double area = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] aux = br.readLine().split(" ");
		a = Double.parseDouble(aux[0]);
		b = Double.parseDouble(aux[1]);
		c = Double.parseDouble(aux[2]);
		
		if(((a + b) > c) && ((a + c) > b) && ((b + c) > a)){
			peri = a + b + c;
			System.out.println("Perimetro = " + peri);
		}else{
			area = (((a + b) * c) / 2);
			System.out.println("Area = " + area);
		}
	}

}
