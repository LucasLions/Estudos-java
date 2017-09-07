import java.util.Scanner;

public class Desafio4{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		double a = scan.nextDouble();
		System.out.println("Digite o valor de B: ");
		double b = scan.nextDouble();
		System.out.println("Digite o valor de C: ");
		double c = scan.nextDouble();		
		System.out.println("Digite o valor de D: ");
		double d = scan.nextDouble();

		int dif = (a*b)-(c*d);

		System.out.println("Diferença: "+dif); 
	}
}
