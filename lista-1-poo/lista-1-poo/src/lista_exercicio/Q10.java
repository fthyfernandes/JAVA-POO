package lista_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner comparar= new Scanner(System.in);
        
        double valor1, valor2, valor3;

        System.out.println("Digite o primeiro valor");
        valor1=comparar.nextDouble();

        System.out.println("Digite o segundo valor");
        valor2=comparar.nextDouble();

        System.out.println("Digite o terceiro valor");
        valor3=comparar.nextDouble();

        System.out.println("O maior valor é:");

        if(valor1>=valor2&&valor1>=valor3){
            System.out.println(valor1);
        }
        else if(valor2>=valor1&&valor2>=valor3){
            System.out.println(valor2);
        }
        else{
            System.out.println(valor3);
        }

        comparar.close();
    }
    
}
