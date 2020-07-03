import java.util.Scanner;

public class Distancia1016 {
	public static void main(String[] args) {
		     
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        int qtdmin = (60*distancia)/30;
        System.out.println(qtdmin+ " minutos");
		sc.close();
	}

}
