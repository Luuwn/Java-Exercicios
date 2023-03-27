

/*
16 – Maria quer saber quantos litros de gasolina precisa colocar em seu carro e quanto vai gastar para 
fazer uma viagem até a casa de sua irmã. Dados extras: Distância da casa de Maria até sua irmã :520 
km Seu carro consome um litro a cada 12 Km rodado. Ela abastece sempre no mesmo posto, onde o 
preço da gasolina é R$ 1,50 o litro.
*/
import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float preco = 1.50f;
		System.out.println("Quantos KMs são?");
		int km = scan.nextInt();
		System.out.println("Quantos KMs por LITRO?");
		int roda = scan.nextInt();
		
		resul(km,roda,preco);
	}
	
	public static void resul(int km, int roda, float preco) {
		float gasolina = (km/roda)*preco;
		
		System.out.println(gasolina);
	}
}
