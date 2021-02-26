import java.util.Scanner; //area do triangulo

public class Exercicio2{

    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int a,b,c;

        System.out.println("Digite o valor da base do triangulo");
        a=teclado.nextInt();
        System.out.println("Digite o valor da altura do triangulo");
        b=teclado.nextInt();

        c=a*b/2;

        System.out.println("Area do triangulo = " +c);

    }
    
}
