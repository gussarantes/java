import java.util.Scanner;

public class Quadrado{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float a, b;

        System.out.println("Lado quadrado: ");
        a = teclado.nextFloat();
        b = a * a;

        System.out.println("Area do quadrado: " + b);       
        System.out.printf("Area do quadrado: %.2f", b);   

        

        
    }
}