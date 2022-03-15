package aula1;

import java.util.Scanner;

public class questao5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//CDU = centena, dezena, unidade
		//UCD = unidae, centena, dezena
		System.out.println("Informe o número CDU:");
		int cdu = sc.nextInt();
		int c,d,dezena,u;
		c = cdu / 100;
		d = cdu %100;
		dezena = d / 10;
		u = d %10;
		System.out.println(u+""+c+""+dezena);
	}
}
