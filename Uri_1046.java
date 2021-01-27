import java.util.Scanner;

public class Uri_1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int h1, h2, aux;

        h1 = teclado.nextInt();
        h2 = teclado.nextInt();


        if (h1 >= h2){
            aux = 24 + h2 - h1;
        }
        else {
            aux = h2 - h1;
        }

        System.out.println("O JOGO DUROU " + aux + " HORA(S)");
        
    }
}