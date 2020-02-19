package poo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        // Escolhendo cada um dos exercícios mudando a variável abaixo para corresponder com o número.
        // Não foi ensinado ainda a abrir arquivos no meio do programa.
        int s = 4;

        switch (s) {

            case 1:
                Ex01 ex01 = new Ex01();
                System.out.println("Insira os três lados do triângulo: ");
                double a, b, c;

                a = teclado.nextDouble();
                b = teclado.nextDouble();
                c = teclado.nextDouble();

                if (ex01.testaTriangulo(a, b, c)) {
                    System.out.println("É um triângulo válido.");
                    System.out.println(ex01.TestaTipo(a, b, c));
                }
                break;

            case 2:
                System.out.println("Insira o número de elementos a serem somados: ");
                int d = teclado.nextInt();
                Ex02 ex02 = new Ex02();
                System.out.println(ex02.SomaSerie(d));
                break;

            case 3:
                Ex03 ex03 = new Ex03();
                ex03.CalculaMediaArquivo();

                break;

            case 4:
                Ex04 ex04 = new Ex04();
                ex04.CriaNotas();
                break;

        }
    }

}
