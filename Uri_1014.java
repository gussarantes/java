import java.util.Scanner;

public class Uri_1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float consumo, dist, litros;

        dist = teclado.nextFloat();
        litros = teclado.nextFloat();

        consumo = dist / litros;

        //System.out.printf("%.3f", consumo, " km/l\n");
        System.out.printf("%.3f km/l\n", consumo);

        

        
    }
}