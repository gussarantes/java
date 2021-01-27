import java.util.Scanner;

public class Uri_1050{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int p1;

        p1 = teclado.nextInt();

        if (p1 == 61)){
            System.out.println("Brasilia");
        }
        else if (p1 == 71){
            System.out.println("Salvador");
        }
        else if (p1 == 11){
            System.out.println("Sao Paulo");
        }
        else if (p1 == 21){
            System.out.println("Rio de Janeiro");
        }
        else if (p1 == 32){
            System.out.println("Juiz de Fora");
        }
        else if (p1 == 19){
            System.out.println("Campinas");
        }
        else if (p1 == 27){
            System.out.println("Vitoria");
        }
        else if (p1 == 31){
            System.out.println("Belo Horizonte");
        }
        else {
            System.out.println("DDD nao cadastrado");
        }
        
    }
}