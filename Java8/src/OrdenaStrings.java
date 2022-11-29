package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

    public static void main(String[]args){

        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        Comparator<String> comparador = new ComparadorPorTamanho();
        //sai na ordem alfabética - LEXCOGRÁFICA DO A até Z
        Collections.sort(palavras, comparador);
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

<<<<<<< HEAD
    //Testando para fazer o merge
=======
    //Agora sai na ordem [alura online, editora cada do código, caelum]


>>>>>>> Ariane01-método-sort
}
