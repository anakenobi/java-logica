import java.util.Scanner;
import java.util.Locale;

public class Questao2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		double x, y, area;
		double pi = 3.14159;
		
		System.out.println("Digite o valor do raio do circulo: ");
		x = sc.nextDouble();
		y = Math.pow(x, 2); 
		area = pi * y;
		
		System.out.printf("Área é igual a: %.4f", area); 
		
		
		sc.close();
		
		
	}

}

/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
 * valor da área deste círculo com quatro casas decimais conforme exemplos.
 */