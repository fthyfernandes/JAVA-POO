package lista_exercicio;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner id= new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int idade= id.nextInt();

        if(idade>=18){
        System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }
        id.close();
    }
    
}
