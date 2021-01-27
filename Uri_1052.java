import java.util.Scanner;

public class Uri_1052{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int p1;

        p1 = teclado.nextInt();

        if (p1 == 1){
            System.out.println("January");
        }
        else if (p1 == 2){
            System.out.println("February");
        }
        else if (p1 == 3){
            System.out.println("March");
        }
        else if (p1 == 4){
            System.out.println("April");
        }
        else if (p1 == 5){
            System.out.println("May");
        }
        else if (p1 == 6){
            System.out.println("June");
        }
        else if (p1 == 7){
            System.out.println("July");
        }
        else if (p1 == 8){
            System.out.println("August");
        }
        else if (p1 == 9){
            System.out.println("September");
        }
        else if (p1 == 10){
            System.out.println("October");
        }
        else if (p1 == 11){
            System.out.println("November");
        }
        else {
            System.out.println("December");
        }
        
    }
}