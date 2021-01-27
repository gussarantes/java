import java.util.Scanner;

public class Uri_1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int h1, min1, h2, min2, num1, num2, difh, difm, aux;

        h1 = teclado.nextInt();
        min1 = teclado.nextInt();
        h2 = teclado.nextInt();
        min2 = teclado.nextInt();

        num1 = 60*h1 + min1;
        num2 = 60*h2 + min2;
/*
        aux = hora2 - hora1;

        if (aux <= 0 ){
            aux = aux + 1440;
        }
        difh = aux / 60;
        difm = aux % 60;



// testes 
h1 = h2 E m1 = m2 
h1 = h2 E m1 > m2
h1 = h2 E m1 < m2
h1 < h2 E m1 = m2
h1 < h2 E m1 < m2
h1 < h2 E m1 > m2
h1 > h2 E m1 = m2
h1 > h2 E m1 < m2
h1 > h2 E m1 > m2

*/


        if (num1 == num2){
            difh = 24;
            difm = 0;
        }
        else if (num2 < num1){
            aux = 1440 - num1 + num2;
            difh = aux / 60;
            difm = aux % 60;
        }
        else if (num2 - num1 < 60){
            difh = 0;
            difm = num2 - num1;
        }
        else if (num1 < num2 && min2 < min1){
            difh = h2 - h1 - 1;
            difm = 60 + min2 - min1;
        }
        else {
            difh = h2 - h1;
            difm = min2 - min1;
        }
        /*
        if (min1 == min2 && h1 == h2){
            difh = 24;
            difm = 0;
        }
        else if (min2 < min1){
            difh = h2 - h1 - 1;
            difm = 60 - min1 + min2;
        }
        else {
            difh = h2 - h1;
            difm = min2 - min1;
        } 
        */

        System.out.println("O JOGO DUROU " + difh + " HORA(S) E " + difm + " MINUTO(S)");
        
    }
}