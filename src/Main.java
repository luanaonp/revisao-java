import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		double area;
		double pi =  3.14159;
		double raio;
		
		raio = sc.nextDouble();
		sc.nextLine();
		
		
		area = pi * Math.pow(raio,2);
		
		System.out.printf("A= %.4f", area);
		
		
	}

}
