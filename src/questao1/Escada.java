package questao1;

/**
*
* @author Aureliana
*/

import java.util.Scanner;

public class Escada {
	
	/*
	 * Algoritmo para mostrar na tela uma escada de tamanho n utilizando o caractere *.
	 */
	
	public static void main(String args[]) {
		
		System.out.print("Digite o valor de n: ");
		Scanner entrada = new Scanner(System.in);
		
		int valorN = entrada.nextInt();
		
		int i = 0;
		
		while (i < valorN) {
			
			i++;
			System.out.println(" ".repeat(valorN - i) + "*".repeat(i));
			
		}
		
	}

}
