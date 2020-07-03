import java.util.Locale;

import java.util.Scanner;

public class Circulo1002 { 
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double Pi = 3.14159;
		double area = Pi * (Math.pow(raio,2.0)); 

		System.out.printf("A = %.4f%n", area);
		
		sc.close();
	}

}
