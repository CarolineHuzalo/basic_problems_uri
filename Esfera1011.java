import java.util.Scanner;

public class Esfera1011 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
		double raio = sc.nextDouble();
        double pi = 3.14159;
        double result = (4/3.0) * (pi * raio * raio * raio);
        
        System.out.printf("VOLUME = %.3f\n", result);
        sc.close();
	}

}
