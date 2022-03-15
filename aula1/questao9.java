package aula1;

import java.util.Scanner;

public class questao9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ponto de x");
		double x = sc.nextDouble();
		System.out.println("Digite o ponto de y");
		double y = sc.nextDouble();
		if(x > 0 && y > 0) {
			System.out.println("O segundo ponto esta acima");
		}
		else if(x > 0 && y < 0) {
			System.out.println("O segundo ponto esta abaixo");
		}
		else if(x < 0 && y > 0) {
			System.out.println("O segundo ponto esta à esquerda");
		}
		else {
			System.out.println("O segundo ponto esta à direita");
		}
	}
}
