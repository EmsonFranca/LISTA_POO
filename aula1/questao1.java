package aula1;

import java.util.Scanner;

public class questao1 {
	public static void main (String[] args) {
		double aux;
		System.out.println("Informe o lado do quadrado");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextFloat();
		aux = Math.pow(x,2);
		System.out.println("O lado do quadrado é "+x+", e sua area é "+aux+".");
	}
	
}