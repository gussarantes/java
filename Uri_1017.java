import java.util.Scanner;

public class Uri_1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float consumo, tempo, vel, dist, litros;

        consumo = 12;
        tempo = teclado.nextFloat();
        vel = teclado.nextFloat();

        dist = vel * tempo;

        litros = dist / consumo;

        System.out.printf("%.3f", litros);

        

        
    }
}