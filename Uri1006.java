import java.util.Scanner;

public class Uri1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        Double A, B, C, X;

        A = teclado.nextDouble() * 0.2;
        B = teclado.nextDouble() * 0.3;
        C = teclado.nextDouble() * 0.5;

       X = A+B+C;

        System.out.println("MEDIA = %.3f\n" +X);
    }
    
}