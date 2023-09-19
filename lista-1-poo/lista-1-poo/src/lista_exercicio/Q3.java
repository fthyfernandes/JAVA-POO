package lista_exercicio;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner tab= new Scanner(System.in);
         int resultado=0;
         
        System.out.println("Insira um número inteiro para calcular a tabuada:");
        int a = tab.nextInt();
       

        for(int i=1;i<=10;i++){
           resultado= a*i;
           System.out.printf("%d x %d = %d\n",a, i, resultado);

        }

        tab.close();    

    }
    
}
