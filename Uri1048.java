import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salario, reajuste, aumento;
        int percentual;
    
        salario = teclado.nextFloat();
                
        if  (salario <= 400.00){
            percentual = 15;
            reajuste = salario * percentual / 100;
            aumento = salario + reajuste;
            System.out.println("Novo salario: " + aumento);
            System.out.println("Reajuste ganho: " + reajuste);
            System.out.println("Em percentual: 15 %");
        }
        else if ( salario >=400.01 && salario <= 800.00){
            percentual = 12;
            reajuste = salario * percentual / 100;
            aumento = salario + reajuste;
            System.out.println("Novo salario: " +aumento);
            System.out.println("Reajuste ganho: " +reajuste);
            System.out.println("Em percentual: 12 %");
        }
        else if ( salario >= 800.01 && salario <= 1200.00){
            percentual = 10;
            reajuste = salario * percentual / 100;
            aumento = salario + reajuste;
            System.out.println("Novo salario: " +aumento);
            System.out.println("Reajuste ganho: " +reajuste);
            System.out.println("Em percentual: 10 %");
        }
        else if ( salario >= 1200.01 && salario <= 2000.00){
            percentual = 7;
            reajuste = salario * percentual / 100;
            aumento = salario + reajuste;
            System.out.println("Novo salario: " +aumento);
            System.out.println("Reajuste ganho: " +reajuste);
            System.out.println("Em percentual: 7 %");
        }
        else if (salario >= 2000.00){
            percentual = 4;
            reajuste = salario * percentual / 100;
            aumento = salario + reajuste;
            System.out.println("Novo salario: " +aumento);
            System.out.println("Reajuste ganho: " +reajuste);
            System.out.println("Em percentual: 4 %");
        }
    }
}