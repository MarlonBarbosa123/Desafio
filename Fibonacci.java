import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // colhendo numero.
        System.out.println("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        // base da sequencia
        int fib1 = 0;
        int fib2 = 1;
        
       // criando sequencia
        StringBuilder sequencia = new StringBuilder(fib1 + ", " + fib2);
        
       // verificando se o usuario digitou 0 ou 1 e informando que faz parte a sequencia
        if (numero == fib1 || numero == fib2) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            // verificando se o numero faz parte da sequencia
            int fibAtual = 0; 
            boolean pertence = false;
            
            while (fibAtual < numero) {
                fibAtual = fib1 + fib2; 
                sequencia.append(", ").append(fibAtual); 
                
                if (fibAtual == numero) {
                    pertence = true;
                    break;
                }
                
               
                fib1 = fib2;
                fib2 = fibAtual;
            }
            
           // mostrando sequencia (Opcional)
           System.out.println("Sequência de Fibonacci gerada: " + sequencia);
            
            
            if (pertence) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
            }
        }
        
        scanner.close();
    }
}
