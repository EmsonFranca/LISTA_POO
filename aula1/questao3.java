package aula1;

import java.util.Scanner;

public class questao3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o grau para a conversão");
		float grau = sc.nextFloat();
		double rad = grau* (Math.PI/180);
		double seno = grau * (Math.sin(grau));
		double cosseno = grau * (Math.cos(grau));
		double tangente = grau * (Math.tan(grau));
		double cossecante = grau * (1/(Math.sin(grau)));
		//double secante = grau * (Math.(grau));
		//double cotangente = grau * (Math.(grau));
		System.out.println("O valor de "+grau+" em radiano é de "+rad);
		System.out.println("O valor de "+grau+" em seno é de "+seno);
		System.out.println("O valor de "+grau+" em cosseno é de "+cosseno);
		System.out.println("O valor de "+grau+" em tangente "+tangente);
		System.out.println("O valor de "+grau+" em cossecante "+cossecante);
	}
}
