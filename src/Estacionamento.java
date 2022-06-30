import java.util.Scanner;

public class Estacionamento {
	
	private static final double TARIFA_MINIMA=2.00;
	private static final double TARIFA_MAXIMA=10.00;
	private static final double TARIFA_ADICIONAL = 0.50;
	private static double valorEstacionamento;	
	private static double somaTotal;	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas horas passou o cliente atual? ");
		int horasClienteAtual = sc.nextInt();
		calcularValor(horasClienteAtual);
		System.out.printf("Valor estacionamento cliente atual: R$ %.2f%n",valorEstacionamento);
		
		System.out.print("Quantos clientes estacionaram ontem? ");
		int n = sc.nextInt();
		
		for(int i =0; i<n;i++){
			System.out.printf("Horas passadas pelo cliente %d: ", i+1);
			int horas = sc.nextInt();
			calcularValor(horas);
			System.out.printf("Valor estacionamento: R$ %.2f%n",valorEstacionamento);
			somaTotal = somaTotal + valorEstacionamento;
		}
		
		System.out.printf("Valor total do estacionamento de ontem: R$ %.2f",somaTotal);
	}
	
	public static void calcularValor(int horas){
			
		if(horas <= 3) {
			valorEstacionamento = TARIFA_MINIMA;
			
		}else if(horas > 3 && horas < 24){
			valorEstacionamento = TARIFA_MINIMA + (horas - 3) * TARIFA_ADICIONAL;
			
		}
		else if (horas == 24) {
			valorEstacionamento = TARIFA_MAXIMA;
		}
		
	} 

}
