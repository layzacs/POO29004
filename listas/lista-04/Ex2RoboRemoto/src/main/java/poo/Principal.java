package poo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner file = new Scanner(System.in);
        String param = file.nextLine();

        int area = Integer.parseInt(param.substring(0,1));
        int x = Integer.parseInt(param.substring(3, 4));
        int y = Integer.parseInt(param.substring(6, 7));
        char frente = param.charAt(9);

        String plano = file.next();

        while(file.hasNext()) {
            plano = plano + file.next();
        }

        if (x > area || y > area) {
            System.out.println("Valores de x e y inválidos. Cheque no arquivo para valores menores que a área.");
            System.out.println("Valores passados: area = " + area + " x = " + x + " y = " + y + " frente = " + frente);
            return;
        }
        if (area < 2) {
            System.out.println("Valores de área inválido. Área deve ser maior que 1.");
            System.out.println("Valores passados: area = " + area + " x = " + x + " y = " + y + " frente = " + frente);
            return;
        }
        if (frente != 'E' && frente != 'D' && frente != 'M') {
            System.out.println("Valor de direção (frente) inválido. Deve ser 'E', 'D' ou 'M'.");
            System.out.println("Valores passados: area = " + area + " x = " + x + " y = " + y + " frente = " + frente);
            return;
        }

        Robo r = new Robo(area, x, y, frente);

        r.carregaPlano(plano);
        r.iniciaExplorar();
    }
}
