import java.util.Scanner

public class Uri1060 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float N, media = 0;
        int qnte = 0;

        for (int cont = 1; cont <=6; cont++){

            N =  teclado.nextFloat();
            if (N > 0){
                qtde++;
                media = media + N;
                System.out.println("     " + qtde + "Valores positivos");
                System.out.println("     Somatoria dos valores = " + media);
            }
        }
    }
    
}
