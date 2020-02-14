// Implementar um programa que calcula a média final da disciplina. A nota dos projetos práticos é calculada por meio
// de uma média geométrica ponderada, com os seguintes pesos W = {w1, w2, w3} = {3, 4, 2}. A nota das listas de
// exercícios é calculada por meio de uma média geométrica. Por fim, Conceito Final (CF) é calculado por meio de uma
// média ponderada, os projetos com peso 0,9 e as listas de exercícios com peso 0,1.
import java.util.Scanner;
import java.lang.Math;

class CalculaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        // calcula nota projetos
        int aux = 1;
        double pj = 1;
        while (aux < 4) {
            System.out.println("Projeto " + aux + ":");
            double projeto = teclado.nextInt();

            // foi necessário fazer uma condicional para cada uma das provas pois elas tem pesos diferentes
            if (aux == 1) {
                projeto = Math.pow(projeto, 3);
            } else if (aux == 2){
                projeto = Math.pow(projeto, 4);
            } else {
                projeto = Math.pow(projeto, 2);
            }

            pj = pj*projeto;


            aux++;

        }

        // dá erro quando coloca uma fração ????
        pj = Math.pow(pj, 0.111111111);
        System.out.println("Nota dos projetos: " + pj);
        pj = pj*0.9;


        // calcula nota listas
        double ls = 1;
        int b = 1;
        while (b < 8) {
            System.out.println("Lista " + b + ":");
            double lista = teclado.nextInt();
            ls = ls*lista;
            b++;
        }

        ls = Math.pow(ls, 0.142857142);
        System.out.println("Nota das listas: " + ls);
        ls = ls*0.1;

        // System.out.printf("%8,.2f" (pj + ls));
        System.out.println("Nota final: " + (pj + ls));
    }
}