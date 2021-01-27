import java.util.Scanner;

public class TestandoIf{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double n1, n2, me;

        System.out.println("Digite a N1:");
        n1 = teclado.nextInt();
        System.out.println("Digite a N2:");
        n2 = teclado.nextInt();

        me = (n1 + n2)/2;

        System.out.println("Sua media = " + me);

        if (me >= 6.0){
            System.out.println("Parabens! Aprovado!");
        }
        else{
            System.out.println("Ate ano que vem");
        }
    }
}