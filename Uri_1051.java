import java.util.Scanner;

public class Uri_1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float sal, ir;

        sal = teclado.nextFloat();

        if (sal <= 2000.00f){
            ir = 0.00f;
        }
        else if (sal >= 2000.01f && sal <=3000.00f){
            ir = (sal - 2000.00f)*0.08f;
        }
        else if (sal >= 3000.01f && sal <=4500.00f){
            ir = (sal - 3000.00f)*0.18f + 1000.00f*0.08f;
        }
        else {
            ir = (sal - 4500.00f)*0.28f + 1500.00f*0.18f + 1000.00f*0.08f;
        }
        
        if (ir == 0.00f){
            System.out.printf("Isento\n");
        }
        else{
            System.out.printf("R$ %.2f\n", ir);   
        }
        
    }
}