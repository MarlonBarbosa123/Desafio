import java.util.Scanner;

public class treino3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("digite um nome:");
        String nome;
        nome = sc.nextLine();
        int contador = 0;
        nome = nome.toUpperCase();

        for (int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) == 'A') {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("Tem" + contador + "A");
        }

    }
}
