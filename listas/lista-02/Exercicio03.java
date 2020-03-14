import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio03 {

    // testa se o número passado é primo
    public static boolean testaPrimo(int num) {
        int divisores=0;
        for (int i = 1; i<num; i++) {
            if (num%i == 0) divisores++;
        }
        if (divisores > 1) return false;
        else return true;
    }

    // usamos a função bubblesort do exercício anterior para facilitar no processo
    public static void bubbleSort(ArrayList<Integer> numeros, int n) {
        if (n < 1) return;

        for (int i =0; i < n; i++) {
            if (numeros.get(i) > numeros.get(i+1)) {
                int swap = numeros.get(i);
                numeros.set(i, numeros.get(i+1));
                numeros.set(i+1, swap);
            }
        }
        bubbleSort(numeros, n-1);
    }

    public static void main(String[] args) {
        Scanner file = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();
        // adiciona todos os numeros do arquivo na lista numeros
        for (int i = 0; file.hasNext(); i++) {
            numeros.add(file.nextInt());
        }
        // ordena em ordem crescente
        bubbleSort(numeros, numeros.size()-1);

        int num_diferentes=0, repetiu=0, pares=0, impares=0, primos=0, maior_repeticao=0, num_repetido=0;

        int num_atual = numeros.get(0);
        num_diferentes++;
        for (int i = 1; i < numeros.size(); i++) {
            System.out.println("atual: " + num_atual + " proximo: " + numeros.get(i));

            // testes simples de par, ímpar ou primo
            if  (num_atual%2 == 0) pares++;
            else impares++;
            if (testaPrimo(num_atual)) primos++;
            // testes pra repetição
            if (num_atual == numeros.get(i)) {
                repetiu++;
            }
            else {
                // pegamos apenas o último número, caso mais de um número tenha se repetido a memsa quantidade de vezes.
                if (maior_repeticao <= repetiu) {
                    maior_repeticao = repetiu;
                    num_repetido = num_atual;
                }
                num_atual = numeros.get(i);
                num_diferentes++;
                repetiu = 0;
            }
        }
        // rodamos o teste de repetição uma última vez para contemplar o último item da lista numeros
        if (maior_repeticao < repetiu) {
            maior_repeticao = repetiu;
            num_repetido = num_atual;
        }
        System.out.println("Total de nuumeros ́unicos: " + num_diferentes);
        System.out.println("Numero(s) com o maior numero de repeticoes: " + num_repetido);
        System.out.println("Total de numeros pares: " + pares);
        System.out.println("Total de numeros ımpares: " + impares);
        System.out.println("Total de numeros primos: " + primos);
    }


}
