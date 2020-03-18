package poo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Soldado[] army = new Soldado[11];


        while (true) {

            System.out.println("Escolha uma das opções:\n1 - criar soldado\n2 - ver total de soldados\n3 - movimentar um soldado\n" +
                    "4 - movimentar todos os soldados\n5 - atacar com todos os soldados\n6 - sair");

            int i = teclado.nextInt();
            switch(i) {
                // cria soldado
                case 1: {

                    if (Soldado.soldados == 10) {
                        System.out.println("Numero máximo de soldados alcançado. Não é possível instanciar um novo soldado.");
                        System.out.println();
                        break;
                    }
                    Soldado s = new Soldado();
                    army[Soldado.soldados] = s;
                    System.out.println("Soldado criado. Número total de soldados:" + Soldado.soldados);
                    System.out.println();
                    break;

                }
                // ver total de soldados
                case 2: {
                    System.out.println("O número total de soldados é: " + Soldado.soldados);
                    break;
                }
                // movimentar um soldado
                case 3: {
                    if (Soldado.soldados < 1) {
                        System.out.println("Nenhum soldado criado. Não é possivel movimentar.");
                        break;
                    }

                    System.out.println("Insira o número do soldado a ser movimentado: ");
                    int j = teclado.nextInt();
                    if (j > Soldado.soldados) {
                        System.out.println("Soldado não existe.");
                        break;
                    }
                    System.out.println("Quantas casas devem ser andadas pelo soldado? Digite 0 para valor padrão");
                    int l = teclado.nextInt();
                    army[j].movimentar(l);
                    System.out.println("Soldado" + j + " andou " + l + " casas. Distancia final: " + army[j].getDistancia());
                    break;

                }
                // movimenta todos os soldados
                case 4: {
                    if (Soldado.soldados < 1) {
                        System.out.println("Não há soldados criados.");
                        break;
                    }
                    System.out.println("Quantas casas devem ser andadas pelos soldados?");
                    int j = teclado.nextInt();

                    for (int k = 1; k <= Soldado.soldados; k++) {
                        army[k].movimentar(j);
                    }
                    break;
                }

                case 5: {
                    if (Soldado.soldados < 10) {
                        System.out.println("Não há soldados sufucientes para atacar. Crie mais soldados.");
                        break;
                    }
                    else {
                        System.out.println("Qual arma deve ser usada pelos soldados? Digite 'padrão' para usar a arma padrão");
                        String a = teclado.next();
                        for (int k = 1; k <= Soldado.soldados; k++) {
                            if (a.equals("padrão")) army[k].atacar();
                            else army[k].atacar(a);
                        }
                        break;
                    }

                }

                case 6:
                    return;

                default:
                    break;

            }
        }

    }

}
