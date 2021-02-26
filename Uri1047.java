import java.util.Scanner;

public class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double N;
    
        N = teclado.nextDouble();
                
        if  (N <= 25.0){
            System.out.println("Intervalo [0,25]");
        }
        else if (N >= 25.0 && N <= 50.0){
            System.out.println("Intervalo (25,50]");
        }
        else if (N >= 50.0 && N <= 75.0){
            System.out.println("Intervalo (50,75]");
        }
        else if (N >= 75.0 && N <= 100.0){
            System.out.println("Intervalo (75,100]");
        }
        else{
            System.out.println("Fora de intervalo");
        }
    }
}