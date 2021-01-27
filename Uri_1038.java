import java.util.Scanner;

public class Uri_1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float cod, conta, qtde;

        cod = teclado.nextInt();
        qtde = teclado.nextInt();
        //conta = 0;
        if (cod == 1){
            conta = qtde *  4.00f;
            //System.out.printf("Total: R$ %.2f", conta);
        }
        else if (cod == 2){
            conta = qtde *  4.50f;
            //System.out.printf("Total: R$ %.2f", conta);
        }
        else if (cod == 3){
            conta = qtde *  5.00f;
            //System.out.printf("Total: R$ %.2f", conta);
        }
        else if (cod == 4){
            conta = qtde *  2.00f;
            //System.out.printf("Total: R$ %.2f", conta);
        }
        else {
            conta = qtde *  1.50f;
            //System.out.printf("Total: R$ %.2f", conta);
        }

        System.out.printf("Total: R$ %.2f\n", conta);
    }
}