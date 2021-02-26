import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float N;
        int qpar = 0;
        int qimp = 0;
        int qpos = 0;
        int qneg = 0;

        for (int cont = 1; cont <=5; cont++){

            N =  teclado.nextFloat();
            if (N %2 == 0){
                qpar++;            
            }
            else{
                qimp++; 
            }
            if (N > 0){
            qpos++;            
            }
            else{
            qneg++; 
    }
    System.out.println(qpar + " valor(es pares");
    System.out.println(qimp + " valores impares");
    System.out.println(qpar + " valores pares");
    System.out.println(qpar + " valores pares");
    }
    
}
