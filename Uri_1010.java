import java.util.Scanner;

public class Uri_1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float cod1, cod2, pre1, pre2, uni1, uni2, total;

        cod1 = teclado.nextFloat();
        uni1 = teclado.nextFloat();
        pre1 = teclado.nextFloat();
        cod2 = teclado.nextFloat();
        uni2 = teclado.nextFloat();
        pre2 = teclado.nextFloat();

        total = uni1 * pre1 + uni2 * pre2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        

        
    }
}