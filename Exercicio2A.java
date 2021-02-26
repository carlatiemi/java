import java.util.Scanner; //area do quadrado

public class Exercicio2a{
    public static void main(String args[]){
        Scanner teclado;
        teclado=new Scanner(System.in);

        int a,b,c;

        System.out.println("Digite o valor do lado");
        a=teclado.nextInt();
        b=a*a;
        c=a*4;
        System.out.println("Area do quadrado = " +b);
        System.out.println("Perimetro do quadrado = " +c);

    }
}