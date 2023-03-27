
import java.util.Scanner;

/*
 1 – Faça um algoritmo que receba a idade e o peso de 7 pessoas, calcule e mostre:
• A quantidade de pessoas com mais de 90 quilos;
• A média das idades das 7 pessoas.
 
 */

public class Exercicio01 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int q = 7;
		int vetId[] = new int[q];
		int vetKg[] = new int[q];

		for(int c = 0; c < q; c ++){
			System.out.println("Digite a IDADE da "+(c+1)+"ª pessoa: ");
			vetId[c] = scan.nextInt();
			System.out.println("Digite o PESO da "+(c+1)+"ª pessoa: ");
			vetKg[c] = scan.nextInt();
		}
		calcula(vetKg);
		media(vetId);
		
	}
	
	public static void calcula(int vetKg[]){
		int qt = 0;
		for(int i = 0; i < vetKg.length; i++) {
			if(vetKg[i] > 90) {
				qt = qt +1;
			}
		}
		System.out.println("Quantidade de pessoas gordas: "+qt);
	}
	public static void media(int vetId[]) {
		int soma = 0;
		for(int i = 0; i < vetId.length; i++) {
			soma += vetId[i];
		}
		System.out.println("Soma das idades: "+soma);
	}
	
}	

