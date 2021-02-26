import java.util.Scanner; //area do trapezio

public class Exercicio3{

    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int a,b,c,d;

        System.out.println("Digite o valor da base maior do trapezio");
        a=teclado.nextInt();
        System.out.println("Digite o valor da base menor do trapezio");
        b=teclado.nextInt();
        System.out.println("Digite o valor da altura do trapezio");
        c=teclado.nextInt();

        d=(a+b)*(c/2);

        System.out.println("Area do trapezio = " +d);

    }
    
}