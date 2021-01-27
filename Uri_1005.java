import java.util.Scanner;

public class Uri_1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double num1, num2, total;

        num1 = teclado.nextDouble();
        num2 = teclado.nextDouble();
        
        total = (3.5*num1 + 7.5*num2) / 11;

        System.out.printf("MEDIA = %.5f\n", total);

        

        
    }
}