
/*
 3 – Faça um algoritmo que receba 10 idades, pesos e alturas, calcule e mostre:
• A média das idades das 10 pessoas;
• A quantidade de pessoas com peso superior a 90 quilos e altura inferior a 1.50;
• A porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 
1.90.
 */
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Tamanho do vetor: ");
		int n = scan.nextInt();
		int [] idade = new int[n];
		int [] pesos = new int[n];
		float [] altura = new float[n];
		for(int i = 0; i < n; i ++) {
			System.out.println("Digite a "+(i+1)+"ª idade: ");
			idade[i] = scan.nextInt();
			System.out.println("Digite o "+(i+1)+"º peso: ");
			pesos[i] = scan.nextInt();
			System.out.println("Digite a "+(i+1)+"ª altura: ");
			altura[i] = scan.nextFloat();
		}
		System.out.println("A média das idades é "+medIdade(idade, n));
		System.out.println("A quantidade de pessoas é "+qtPeAl(pesos, altura, n));
		System.out.println("A porcendagem de pessoas é "+pcIdAl(idade,altura, n));
	}
	
	public static float medIdade(int [] idade, int n) {
		float media = 0;
		for(int i = 0; i < n; i ++) {
			media += idade[i];
		}
		media /= 10;
		return media;
	}
	
	public static int qtPeAl(int []pesos, float []altura, int n) {
		int qt = 0;
		for(int i = 0; i < n; i ++) {
			if(pesos[i] > 90 && altura[i] < 1.50) {
				qt += 1;
			}
		}
		return qt;
	}
	
	public static float pcIdAl(int []idade, float []altura, int n) {
		int Id = 0;
		int Al = 0;
		for(int i = 0; i < n; i ++) {
			if( 30 > idade[i] && idade[i] > 10) {
				Id += 1;
				if(altura[i] > 1.90 ) {
					Al += 1;
				}
			}	
		}
		System.out.println("Id: "+Id);
		System.out.println("Al: "+Al);
		float pc = (float) Al/Id * 100;
		System.out.println("A porcendagem de pessoas é "+ pc + "%");
		return pc;
	}
}
