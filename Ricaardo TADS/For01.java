public class For01 {
    public static void main(String[] args){
        
        int cont = 0;

        while( cont < 10) {
            
            System.out.println(cont);
            cont++;
        }


        for (int x = 0; x < 10; x++){
            System.out.println("X = " + x);
        }

        System.out.println("\n\n ============\n\n");

        int y = 0;
        for ( ; ; ){
            System.out.println("Y = " + y);
            y++;

            if (y >= 5) break;

            System.out.println("DEPOIS DO IF... " + y);

        }

        System.out.println("\n\n ============\n\n");


        for (int i = 5; i >= 0; i--){
            System.out.println("Contagem regressiva... " + i);
        }
    }
}