package lista_exercicio;
import java.util.Scanner;

public class Q6 {
    

    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double numero1 = calc.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = calc.nextDouble();

        double resultado;
       
        System.out.printf("Digite:\n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão\n");
        int operacao = calc.nextInt();
        
        
        
        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado da adição: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
        
        calc.close();
    }
}
    

