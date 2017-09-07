import java.util.Scanner;

public class Desafio3{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
			System.out.println("Digite um valor: ");
			int a = scan.nextInt();
			System.out.println("Digite um outro valor: ");
			int b = scan.nextInt();

			int prod = a*b;

			System.out.println("Prod = " +prod);
	}

}
