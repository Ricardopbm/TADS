import java.util.Scanner;

public class For02 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        for (int cont = 0, inicio = x; cont <= 10; inicio = inicio + y, cont++) {
            System.out.println(inicio);


        }

    }
    
}
