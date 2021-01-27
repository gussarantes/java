import java.util.Scanner;

public class Uri_1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float num, novo, ajus, perc;

        num = teclado.nextFloat();

        if (num >= 0.00f && num <=400.00f){
            perc = 15;
            novo = num * (1 + perc/100);
            ajus = novo - num;
        }
        else if (num > 400.00f && num <=800.00f){
            perc = 12;
            novo = num * (1 + perc/100);
            ajus = novo - num;
        }
        else if (num > 800.00f && num <=1200.00f){
            perc = 10;
            novo = num * (1 + perc/100);
            ajus = novo - num;
        }
        else if (num > 1200.00f && num <=2000.00f){
            perc = 7;
            novo = num * (1 + perc/100);
            ajus = novo - num;
        }
        else {
            perc = 4;
            novo = num * (1 + perc/100);
            ajus = novo - num;
        }
        
        System.out.printf("Novo salario: %.2f\n", novo);
        System.out.printf("Reajuste ganho: %.2f\n", ajus);
        System.out.printf("Em percentual: %.0f %%\n", perc);
        
    }
}