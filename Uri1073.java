import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, quadrado;
        int X = 1;
        int cont = 1;
        N =  teclado.nextInt();

        do {
           if (X %2 == 0){
            quadrado = X * X;
            System.out.println(X +"^2 = " + quadrado); 
           }       
           X++;
                    }
        while (X <= N);
        }
}