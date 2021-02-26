import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod, qnt;
        double total;

        cod= teclado.nextInt();
        qnt = teclado.nextInt();
                
        if ( cod == 1){
        total = qnt * 4.0;
        }
        else if ( cod == 2){
            total = qnt * 4.50;
        }
        else if (cod == 3){
            total = qnt * 5.00;
        }
        else if (cod == 4){
            total = qnt * 2.00;
        }
             else{
                            total = qnt * 1.50;
                }
                System.out.printf("Total " + total);
    }
}