import java.util.Locale;
import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int funcionario, horasTrabalhadas;
		double salarioHora, salario;
		
		System.out.println("Digite o numero do funcionario: ");
		funcionario = sc.nextInt();
		System.out.println("Digite o total de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt(); 
		System.out.println("Digite o valor do salário por hora: ");
		salarioHora = sc.nextDouble();
		
		salario = horasTrabalhadas * salarioHora;
		
		System.out.printf("Number = %d%n", funcionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		
		sc.close();
	}

}

/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas
 * trabalhadas, o valor que recebe por hora e calcula o salário desse
 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
 * casas decimais.
 */