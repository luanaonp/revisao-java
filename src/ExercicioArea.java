import java.util.Locale;
import java.util.Scanner;

public class ExercicioArea {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A;
	    double B;
	    double C;
	    double pi = 3.14159;
	    
	    double areaTriangulo;
	    double areaCirculo;
	    double areaTrapezio;
	    double areaQuadrado;
	    double areaRetangulo;
	    
	    A = sc.nextDouble();
	    B = sc. nextDouble();
	    C = sc.nextDouble();
	    
	    areaTriangulo = A*C/2;
	    areaCirculo = pi * Math.pow(C, 2);
	    areaTrapezio = ((A + B) * C) / 2 ;
	    areaQuadrado = B*4;
	    areaRetangulo = A*B;
	    
	    System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
	    System.out.printf("CIRCULO: %.3f%n", areaCirculo);
	    System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
	    System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
	    System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		        
	   

	}

}
