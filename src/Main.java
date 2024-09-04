import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int soma;
		
		System.out.println("Digite um número: ");
		a = sc.nextInt();
		System.out.println("Digite outro número: ");
		b = sc.nextInt();

		soma = a + b;

		System.out.printf("SOMA = %d", soma);

		sc.close();

	}

}
/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
 * soma desses números com uma mensagem explicativa, conforme exemplos.
 */