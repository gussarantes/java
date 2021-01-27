import java.util.Scanner;

public class SwitchCase{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int ddd;

        ddd = teclado.nextInt();

        switch(ddd){
            // so aceita string e inteiro
            case 61:
                System.out.println("Brasilia");
                break;
            case 71:
                System.out.println("Salvador");
                break; //necessário devido a particularidade do switch case
            default:
                System.out.println("DDD nao cadastrado");
        }
        
    }
}