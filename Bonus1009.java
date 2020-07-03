import java.util.Scanner;

public class Bonus1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 	//String nome = sc.nextLine();
    	double salario = sc.nextDouble();
    	double bonus = sc.nextDouble();
    	double salariobonus = (salario+(bonus*0.15));
    	System.out.printf("TOTAL = R$ %.2f\n",salariobonus);
    	sc.close();   
	}

}
