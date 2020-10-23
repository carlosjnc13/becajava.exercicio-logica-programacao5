package exercioLogicaProgramacao5;
import java.util.Scanner;

public class exercicioLogicaProgramacao5 {

	public static void main(String[] args) {
		
		int numero;
		Scanner leitura = new Scanner(System.in);
		System.out.println("digite um numero:");
		
		numero = leitura.nextInt();
		int soma = 0;
		
		while(numero > 10) {
			
			soma = soma + (numero%10);
			numero = numero / 10;
			
		}
		soma += numero;
		
		System.out.println("Resultado da soma dos digitos: "+soma);
			
	}

}
