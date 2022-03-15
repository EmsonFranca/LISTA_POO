package aula1;

import java.util.Scanner;

public class questao6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o intervalo de minutos.");
		int minutos = sc.nextInt();
		int dias,horas,resto;
		dias = minutos / 1440;
		horas = (minutos / 60) % 24;
		resto = minutos % 60;
		System.out.println(minutos+" minutos = "+dias+" dias, "+horas+" horas "+resto+" minutos");
	}
}
