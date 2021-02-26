import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        Double A, B, X;

        A = teclado.nextDouble();
        B = teclado.nextDouble();

        X = (A * 3.5 + B * 7.5) / 11.0;

        System.out.printf("MEDIA = %.5f\n" X);
    }
    
}
