import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumo1014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		double A = sc.nextDouble();
        double B = sc.nextDouble();
        double T = (A / B);
        DecimalFormat df = new DecimalFormat("0.###");
        String S = df.format(T);
        System.out.printf(S+" km/l%n");
       		
		sc.close();
	}

}
