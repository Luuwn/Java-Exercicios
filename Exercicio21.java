
/*
21 – Fazer um algoritmo que leia três notas e mostre: a média das notas, a situação final do aluno 
onde aprovado media = 7.
*/
import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float []notas = new float[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite a "+(i+1)+"ª nota: ");
			notas[i] = scan.nextFloat();
		}
		situacao(notas);
	}
	public static void situacao(float[] notas) {
		float soma = 0;
		for(int i = 0; i < 3; i++) {
			soma = soma + notas[i];
		}
		soma = soma/3;
		System.out.println(soma);
		if(soma >= 7 ) {
			System.out.println("O Aluno está aprovado");
		}
		else {
			System.out.println("O Aluno não está aprovado");
		}
	}
}
