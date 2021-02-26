import java.util.Scanner;

public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, C;
        double Perimetro, Area, Calc1, Calc2;
    
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

if (A + B > C && A + C > B && B + C > A){
            Perimetro = A + B + C;
            System.out.println("Perimetro = " +Perimetro);
}
    else{
    Calc1 = A + B;
    Calc2 = Calc1 * C;
    Area = Calc2 / 2;
    System.out.println("Area = " +Area);
        }
    }
}