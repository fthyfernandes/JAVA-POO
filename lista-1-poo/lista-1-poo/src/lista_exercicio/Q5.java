package lista_exercicio;
import java.util.Scanner;

public class Q5 {
    
    public static void main(String[] args) {
        Scanner fib = new Scanner(System.in);

        System.out.print("Digite um número para calcular a sequência de Fibonacci até esse valor: ");
        int limite = fib.nextInt();

        int primeiroTermo = 0;
        int segundoTermo = 1;
        int proximoTermo = 0;

        System.out.println("Sequência de Fibonacci até " + limite + ": ");

        while (primeiroTermo <= limite) {
            System.out.print(primeiroTermo + " ");
            proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        fib.close();
    }
}

    

