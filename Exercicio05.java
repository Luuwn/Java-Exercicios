
/*
5 – Faça um algoritmo que calcule a soma dos primeiros 50 números pares. Este algoritmo não recebe 
valor do teclado. Os primeiros número pares são: 2, 4, 6, ...
*/

public class Exercicio05 {
	public static void main(String[] args) {
		somaria();
	}
	
	public static void somaria() {
		int soma = 0;
		int par = 2;
		for(int i = 0;i < 50; i++) {
			soma = soma + par;
			par += 2;
		}
		System.out.println(soma);
	}
}
