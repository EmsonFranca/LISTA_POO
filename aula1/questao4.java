package aula1;

import java.util.Scanner;

public class questao4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a temparuta em Grau Celsius");
		double grau = sc.nextDouble();
		double fah = grau * 1.8 + 32;
		System.out.println("Graus = "+grau+"° Fahrenheit = "+fah+"°");
	}
}
