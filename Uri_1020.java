import java.util.Scanner;

public class Uri_1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a, b, c, d;

        a = teclado.nextInt();

        b = a / 365;
        c = a % 365 / 30;
        d = a % 365 % 30;

        System.out.println(b + " ano (s)");       
        System.out.println(c + " mes (es)");
        System.out.println(d + " dia (s)");

        

        
    }
}