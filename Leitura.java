import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a;
        float b;
        double c;

        System.out.println("Valor inteiro");
        a = teclado.nextInt();

        System.out.println("Valor float");
        b = teclado.nextFloat();

        System.out.println("Valor double");
        c = teclado.nextDouble();

        System.out.println("Digitou: " + a + "  " + b + "  " + c);
        //System.out.println("Digitou: " + a);
    }
}