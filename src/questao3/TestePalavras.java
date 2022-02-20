package questao3;

/**
*
* @author Aureliana
*/

import java.util.ArrayList;

public class TestePalavras {
	
	
	private static String palavra;

	/*
	 * Fun��o para encontrar o n�mero de pares de substrings que s�o anagramas.
	 */
	
    public static void imprimeAnagramas(String prefixo, String word) {
        if (word.length() <= 1) {
            System.out.println(prefixo + word);
        } else {
            ArrayList letra = new ArrayList();
            for(int i = 0; i < word.length(); i++){
                int j = 0;
                boolean teste = true;
                String l = word.substring(i, i+1);
                while(letra.size() > j){
                    
                    if(l.equals(letra.get(j))){
                        teste = false;
                    }
                    j++;
                    
                }
                    
                if (teste) {
                    letra.add(word.substring(i, i+1));
                }
            }
            String s = "";
            for (int i = 0; i < letra.size(); i++) {
                s = s + letra.get(i);
            }
            word = s;
            for (int i = 0; i < word.length(); i++) {
                String atual = word.substring(i, i + 1);
                String antes = word.substring(0, i);
                String depois = word.substring(i + 1);
                imprimeAnagramas(prefixo + atual, antes + depois);
            }
            
        }
    }
}
