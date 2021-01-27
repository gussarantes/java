import java.util.Scanner;

public class Uni_1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod1;
        float horas, salario, total;

        cod1 = teclado.nextInt();
        horas = teclado.nextFloat();
        salario = teclado.nextFloat();

        total = horas * salario;

        System.out.println("NUMBER = " + cod1);
        System.out.printf("SALARY = U$ %.2f\n", total);

        

        
    }
}