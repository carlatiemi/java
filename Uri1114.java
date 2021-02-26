import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N = 0;
        
        while (N != 2002) {
            N = teclado.nextInt();
            if (N != 2002){
                System.out.println("Senha Invalida"); 
            }
            else {
                System.out.println("Acesso Permitido"); 
            }
        }
    }
}