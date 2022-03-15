package aula1;

import java.util.Scanner;

public class questao7 {
	public static void main(String[] args) {
		System.out.println("Informe o valor de uma carta");
		Scanner sc = new Scanner(System.in);
		int valor_carta = sc.nextInt();
		if(valor_carta == 1) {
			System.out.println("ouro");
		}
		else if(valor_carta == 2) {
			System.out.println("paus");
		}
		else if(valor_carta == 3) {
			System.out.println("copas");
		}
		else if(valor_carta == 4) {
			System.out.println("espadas");
		}
		else {
			System.out.println("VALOR NÃO INDENTIFICADO");
		}
	}
}
