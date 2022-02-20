package questao2;

/**
*
* @author Aureliana
*/

import java.util.Scanner;

public class Senha {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);
	    VerificaSenhaForte verificaS;
		String senha;
		System.out.println("Digite a senha: ");
		senha = entrada.nextLine();

		 verificaS = new VerificaSenhaForte(senha);
		
		 if(verificaS.verificarSenhaForte())
	        {
			 System.out.println("A senha é boa!");
	        }
		
	}
	
	



	

}
