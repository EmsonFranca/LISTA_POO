package aula1;

import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Infome a primeira nota do aluno");
		float n1 = sc.nextFloat();
		System.out.println("Informe a segunda nota do aluno");
		float n2 = sc.nextFloat();
		System.out.println("Informe a terceira nota do aluno");
		float n3 = sc.nextFloat();
		float media = (n1+n2+n3)/3;
		System.out.println("A media do aluno é "+media);
	}
}
