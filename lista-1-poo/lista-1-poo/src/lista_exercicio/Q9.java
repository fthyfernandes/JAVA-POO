package lista_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner comp= new Scanner(System.in);
         int produto;
         double preco, desconto, resultado;

        System.out.println("Digite a quantidade comprada do produto:");
        produto=comp.nextInt();

        System.out.println("Digite o preço unitário do produto:");
        preco= comp.nextDouble();

        if(produto>10){
            desconto= produto*preco*0.1;
            resultado= produto*preco - desconto;
            System.out.printf("Valor total: %.2fR$", resultado);
        }
        else{
            resultado= produto*preco;
            System.out.printf("Valor total: %.2fR$", resultado);
        }
        comp.close();
    }
    
}
