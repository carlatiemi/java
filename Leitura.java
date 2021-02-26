import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int a;
        double b;

        System.out.println("Digite o valor inteiro");
        a = teclado.nextInt();
        System.out.println("Voce digitou = " +a);

        System.out.println("Digite o valor real");
        b = teclado.nextDouble();
        System.out.println("Voce digitou =" + b);
    }
}