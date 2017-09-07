import java.util.Scanner;

public class Desafio5{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Qual a ID do Funcionario: ");
		int id = scan.nextInt();

		System.out.println("Qual o total de horas trabalhadas: ");
		double hrJobs = scan.nextDouble();
		
		System.out.println("Quanto ele recebe por hora: ");
		double hrmoney = scan.nextDouble();

		double sal = hrJobs*hrmoney;
		System.out.println("ID: "+id);
		System.out.println("Salario: "+sal);
		
	}

}
