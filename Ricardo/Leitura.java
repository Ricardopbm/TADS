//imports ficam acima da declaração da calsse

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        // DECLARAÇÃO
        Scanner in;

        //INICIALIZAÇÃO
        in = new Scanner(System.in); //TERMINAL / ENTRADA DO USUÁRIO

        //TIPO /NOME
        String apelido; //string => tipo de texto

        System.out.println("Digite seu apelido:");
        apelido = in.next();      //a variavel apelido recebe a palavra que foi digitada

        System.out.println("duas vezes: ");  
        System.out.println("\t" + apelido); // o+ esta concatenando (juntar) as strings
        System.out.println("\t\t" + apelido);
    }
}