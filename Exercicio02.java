import java.util.Scanner;

/*
2 – Faça um algoritmo que receba 10 números, calcule e mostre a quantidade de números entre 30 e 
90 
 */

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[] = new int[10];
		for(int i = 0; i < 10; i++ ) {
			System.out.println("Digite o "+(i+1)+"º número: ");
			num[i] = scan.nextInt();
		}
		System.out.println("Quantidade "+quantidade(num));
	}
	public static int quantidade(int []num) {
		int qtNum = 0;
		for(int i = 0; i < 10; i++ ) {
			if(num[i] <= 90 && num[i] >= 30) {
				qtNum += 1;
			}
		}
		return qtNum;
	}
}
