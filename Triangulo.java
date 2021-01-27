import java.util.Scanner;

public class Triangulo{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float a, b, c;

        System.out.println("base do triangulo");
        a = teclado.nextFloat();

        System.out.println("altura do triangulo");
        c = teclado.nextFloat();

        b = a * c / 2;

        System.out.println("Area do triangulo: " + b);       

        

        
    }
}