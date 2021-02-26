import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int inicial,final;
    
        inicial = teclado.nextInt();
        final = teclado.nextInt();

        if  (x == 0 && y==0){
            System.out.println("Origem");
        }
        else if (x == 0 && y!=0){
            System.out.println("Eixo Y");
        }
        else if (x != 0 && y==0){
            System.out.println("Eixo X");
        }
        else if (x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0){
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0){
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0){
            System.out.println("Q4");
        }
    }
}