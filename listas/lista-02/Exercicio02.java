import java.util.Scanner;
import java.util.Random;
public class Exercicio02 {

    public static void bubbleSort(int[] vetor, int n) {
        if (n < 1) return;

        for (int i =0; i < n; i++) {
            if (vetor[i] > vetor[i+1]) {
                int swap = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = swap;
            }
        }
        bubbleSort(vetor, n-1);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] vetor = new int[10];
        // cria vetor com valores randomicos
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(11);
        }
        // ordena vetor
        bubbleSort(vetor, vetor.length-1);
        // imprime vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
