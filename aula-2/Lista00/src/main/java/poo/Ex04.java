package poo;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
    public void CriaNotas() {
        Scanner file = new Scanner(System.in);
        Random rand = new Random();
        // enquanto houver uma proxima linha com um nome:
        while (file.hasNextLine()) {
            String nome = file.next();
            // printa o nome na tela e cria 10 números aleatórios entre 0 e 10.
            System.out.print(nome);

            for (int a = 0; a < 10; a++) {
                System.out.print(" " + rand.nextInt(11));
            }
            // se for a última nota imprime uma quebra de linha
            System.out.println();

        }
    }
};
