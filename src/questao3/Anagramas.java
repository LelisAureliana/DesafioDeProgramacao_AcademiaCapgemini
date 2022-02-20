package questao3;

/**
*
* @author Aureliana
*/ 

import java.util.Scanner;


public class Anagramas {



    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra/frase: ");
        String palavra = entrada.nextLine().trim().replaceAll("\\s+", "");
        
        TestePalavras anagramas;
        anagramas = new TestePalavras();

        //[a-zA-Z_].* - N�O ACEITA ACENTOS
        if (palavra.matches("[a-zA-Z_].*")) {
            anagramas.imprimeAnagramas("", palavra.toUpperCase());
        } else {
            System.out.println("Palavra cont�m caracteres inv�lidos.");
        }
    }

}
