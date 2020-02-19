package poo;

import java.util.Scanner;

public class Ex03 {
    public void CalculaMediaArquivo() {
        Scanner file = new Scanner(System.in);
        while (file.hasNext()) {
            String nome = file.next();
            int vet[] = new int[10];
            for (int i = 0; i<10; i++) {
                vet[i] = file.nextInt();

            }
            System.out.println(nome + ": " + CalculaMedia(vet));

        }
    }

    private double CalculaMedia(int[] vet) {

        int a = 0;
        double pj = 1;
        while (a < 3) {
            double projeto = vet[a];

            // foi necessário fazer uma condicional para cada uma das provas pois elas tem pesos diferentes
            if (a == 0) {
                projeto = Math.pow(projeto, 3);
            } else if (a == 1){
                projeto = Math.pow(projeto, 4);
            } else {
                projeto = Math.pow(projeto, 2);
            }
            pj = pj*projeto;
            a++;

        }

        // dá erro quando coloca uma fração ????
        pj = Math.pow(pj, 0.111111111);
        pj = pj*0.9;

        // calcula nota listas
        double ls = 1;
        int b = 3;
        while (b < 10) {
            double lista = vet[b];
            ls = ls*lista;
            b++;
        }

        ls = Math.pow(ls, 0.142857142);
        ls = ls*0.1;

        return (Math.round(pj + ls));
    }
};
