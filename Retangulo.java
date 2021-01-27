import java.util.Scanner;

public class Retangulo{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float a, b, c;

        System.out.println("base do retangulo");
        a = teclado.nextFloat();

        System.out.println("altura do retangulo");
        c = teclado.nextFloat();

        b = a * c;

        System.out.println("Area do retangulo: " + b);       

        

        
    }
}