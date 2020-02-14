// linha necessária para todos arquivos dentro de um package
package poo;

import java.util.Scanner;

public class Principal {

    // esse método de escrever static não é saudável.
    public static void boasVindas(String nome) {
        System.out.println("Olá " + nome);
    }

    public void saudacao(boolean genero, String nome) {
        String pronome = (genero) ? "Senhora" : "Senhor";

        System.out.println("Olá " + pronome + " " + nome);
    }

    // main é obrigatoriamente static, e ele só pode invocar outros static
    public static void main(String[] args) {

//
//        System.out.println("Hello world");
//
//        boasVindas("Emerson");
//
//        // maneira certa de invocar uma classe que precisa ser static
//        Principal p = new Principal();
//        p.saudacao(false, "Emerson");
//
//        Calculadora c = new Calculadora();
//
//        System.out.println(c.somar(1,2));
//        System.out.println(c.divide(1,2));


        // o System.in nesse caso é o proprio arquivo que for redirecionado para o programa com o < "arquivo.txt"
        Scanner teclado = new Scanner(System.in);

        // Enquanto tiver linhas no arquivo, pega a próxima linha (string) do teclado.
        while (teclado.hasNext()) {
            String s = teclado.nextLine();
            System.out.println(s);
        }

    }

}
