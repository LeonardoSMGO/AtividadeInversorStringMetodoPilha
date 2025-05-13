import java.util.Scanner;

public class InversorPilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase em caixa alta e sem acentos: ");
        String frase = sc.nextLine();

        String[] palavras = frase.split(" ");
        for (int i = 0; i < palavras.length; i++) {
            palavras[i] = new StringBuilder(palavras[i]).reverse().toString();
        }

        System.out.println("Frase com as letras de cada palavra em ordem invertida:");
        System.out.println(String.join(" ", palavras));

        sc.close();
    }
}