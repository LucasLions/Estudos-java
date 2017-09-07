import java.util.Scanner;

public class Desafio2{

	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o valor do raio: ");
		double raio = scan.nextDouble();
		
		double area = 3.14159*(raio*raio);
		System.out.println(area);
		
	
	}


}
