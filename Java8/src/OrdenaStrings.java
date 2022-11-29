package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

    public static void main(String[]args){

        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("editora cada do código");
        palavras.add("caelum");

        //sai na ordem alfabética - LEXCOGRÁFICA DO A até Z
        Collections.sort(palavras);
        System.out.println(palavras);

        //Ao rodar o resultado sai: [alura online, caelum, editora cada do código],
        //sai na ordem alfabética - LEXCOGRÁFICA DO A até Z


    }

}

class ComparadorPorTamanho implements Comparator<String>{


    @Override
    public int compare(String s1, String s2) {
        return 0;
    }

    //Testando para fazer o merge
}
