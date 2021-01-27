import java.util.Scanner;

public class Uri_1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float p1, p2;

        p1 = teclado.nextFloat();
        p2 = teclado.nextFloat();

        if (p1 > 0.00f && p2 > 0.00f){
            System.out.println("Q1");
        }
        else if (p1 < 0.00f && p2 > 0.00f){
            System.out.println("Q2");
        }
        else if (p1 < 0.00f && p2 < 0.00f){
            System.out.println("Q3");
        }
        else if (p1 > 0.00f && p2 < 0.00f){
            System.out.println("Q4");
        }
        else if (p1 != 0 && p2 ==0){
            System.out.println("Eixo X");
        }
        else if (p1 == 0 && p2 !=0){
            System.out.println("Eixo Y");
        }
        else {
            System.out.println("Origem");
        }
        
    }
}