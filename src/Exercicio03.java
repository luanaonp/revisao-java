import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		int codPeca;
		int numPeca;
		double valorPeca;
		
		int codPeca2;
		int numPeca2;
		double valorPeca2;
		
		
		double total;
		
		codPeca=sc.nextInt();
		numPeca= sc.nextInt();
		valorPeca = sc.nextDouble();
		
		codPeca2=sc.nextInt();
		numPeca2= sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		
		total = (numPeca * valorPeca) + (numPeca2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		

	}

}
