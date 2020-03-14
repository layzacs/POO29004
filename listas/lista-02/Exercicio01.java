import java.util.Scanner;
public class Exercicio01 {
    // int a = tipo de figura (quadrado ou losango)
    // int b = tamanho da figura
    // desenha a figura de acordo com os parâmetros acima
    public static void desenhaFigura(int a, int size) {
        if (a == 1) {
            // quadrado
            for (int x = 0; x < size; x++) {
                // primeira e ultima linhas
                if (x == 0 || x == size - 1) {
                    for (int space = 0; space < size; space ++) System.out.print("*");
                    System.out.print("\n");
                } else {
                    // linhas do interior
                    for (int space = 0; space < size; space ++) {
                        if (space == 0 || space == size - 1) System.out.print("*");
                        else System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        } else {
            // losango cresce
            int lado = (size/2), miolo = 0;
            for (int x = 0; x < (size/2)+1; x++, lado--) {
                // lado esquerdo
                for (int space = 0; space < lado; space++) System.out.print(" ");
                System.out.print("*");
                // miolo
                for (int space = 0; space < miolo; space++) System.out.print(" ");
                if (miolo != 0) {
                    System.out.print("*");
                    miolo = miolo+2;
                } else miolo++;
                System.out.println();
            }
            // losango diminui
            // variáveis lado e miolo sempre deverão ter estes valores, pois a > 5
            lado = 1;
            miolo = miolo - 4;
            for (int x = 0; x < size/2; x++, lado++) {
                // lado esquerdo
                for (int space = 0; space < lado; space++) System.out.print(" ");
                System.out.print("*");
                // miolo
                if (miolo > 1) {
                    for (int space = 0; space < miolo; space++) System.out.print(" ");
                    System.out.print("*");
                    miolo = miolo - 2;
                } else if (miolo == 1) {
                    System.out.print(" ");
                    System.out.print("*");
                    miolo--;
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Não foram passados os argumentos necessários. \nArgumento 1 - quadrado ou losango\nArgumento 2 - número");
            return;
        }
        // transforma o segundo argumento (string) em integer
        int i = Integer.parseInt(args[1]);
        // Pega o primeiro argumento passado para o programa e printa na tela
        if (args[0].equals("quadrado")) {
            if ((i%2 == 0) && i > 4) desenhaFigura(1, i);
            else {
                System.out.println("Número inválido. Passe um número par maior que 4.");
                return;
            }
        } else if (args[0].equals("losango")) {
            if ((i%2 != 0) && i > 5) desenhaFigura(2, i);
            else {
                System.out.println("Número inválido. Passe um número ímpar maior que 5.");
            }
        }
    }
}
