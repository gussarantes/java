import java.util.Scanner;

public class Losango{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float a, b, c;

        System.out.println("diagonal 1 do losango");
        a = teclado.nextFloat();

        System.out.println("diagonal 2 do losango");
        c = teclado.nextFloat();

        b = a * c;

        System.out.println("Area do diagonal: " + b);       

        

        
    }
}