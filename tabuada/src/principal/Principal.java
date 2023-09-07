package principal;
import java.util.InputMismatchException;
import java.util.Scanner;
import geraTabuada.GeradorTabuada;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GeradorTabuada tabuada = new GeradorTabuada();
		boolean verifica = false;

		do {
			try{
				
				System.out.print("Digite um numero da tabuada -> ");
				int numero = sc.nextInt();

				System.out.print("\nDigite quantos numeros deseja que a tabuada imprima -> ");
				int imprimir = sc.nextInt();

				System.out.print("\nDigite qual o ultimo digito dos resultados você quer saber o total de vezes que aparecem -> ");
				int ultimoDigito = sc.nextInt();

				tabuada.tabuada(numero, imprimir, ultimoDigito);
				verifica = false;
				System.out.println("*************************************************************************************************");
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("Digite um numero valido");
				System.out.println("*************************************");
				verifica = true;
			}
		}while(verifica);
		System.out.println(".............................Programa finalizado com sucesso................................ :)");
	}
}