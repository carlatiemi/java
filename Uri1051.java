import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double Renda;
        double Imposto, Calc;
        Renda = teclado.nextDouble();
        
if (Renda <= 2000.00){
        System.out.println("Isento");
}
else if (Renda <= 3000.00){
    Calc = Renda - 2000.00;
    Imposto = Calc * 0.08;
    System.out.printf("R$ %.2f\n" , Imposto);
}
else if (Renda <= 4500.00){
    Imposto = (Renda - 3000.00) * 0.18 + 80.00;
    System.out.printf("R$ %.2f\n" , Imposto);
}
else {
    Imposto = (Renda - 4500.00) * 0.28 + 270.00 + 80.00;
    System.out.printf("R$ %.2f\n" , Imposto);
}
    }
}