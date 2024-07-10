import java.util.Scanner;

public class Lanche{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int alternativa;

        
        System.out.println("Boa noite, digite o numero referente a opção que deseja \n1) BATATA FRITA Pequena 110gm - R$15,00 \n2) BATATA FRITA Media 330gm - R$25,00 \n3) BATATA FRITA Grande 550gm - R$35,00");
        alternativa = in.nextInt();
        

        System.out.println("alternativa " + alternativa);
        
        in.close();
    }
}


/* CARDAPIO 

LANCHE A) BATATA FRITA P 110GM - R$15,00
LANCHE B) BATATA FRITA M 330GM - R$25,00
LANCHE C) BATATA FRITA G 550GM - R$35,00

(OPCIONAL) ACOMPANHAMENTO DE CARNE (REFERENTE AO TAMANHO DAS BATATAS)

ADICIONAL A) FILE   - R$10,00
ADICIONAL B) FRANGO - R$15,00
ADICIONAL C) BACON  - R$20,00

(OPCIONAL) BEBIDAS 

BEBIDA A) COCA-COLA 2L  - R$12,00
BEBIDA B) PEPSI-COLA 2L - R$12,00
BEBIDA C) DOLLYNHO 2L   - R$08,00



*/ 