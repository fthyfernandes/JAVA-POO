package lista_exercicio;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner ale = new Scanner(System.in);
        
        int numeroSecreto = (int) (Math.random() * 100) + 1; 
        int tentativas = 0;
        int palpite;
        
        System.out.println("Adivinhe o número secreto entre 1 e 100.");
        
        while (true) {
            System.out.print("Digite seu palpite: ");
            palpite = ale.nextInt();
            tentativas++;
            
            if (palpite < 1 || palpite > 100) {
                System.out.println("Por favor, digite um número entre 1 e 100.");
            } else if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto " + numeroSecreto + " em " + tentativas + " tentativas.");
                break;
            }
        }
        
        ale.close();
    }
}

    

