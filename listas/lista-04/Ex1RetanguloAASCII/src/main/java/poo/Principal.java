package poo;

public class Principal {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Erro nos parâmetros passados. \n1 - modo (ascii ou utf8)\n2 - altura (>1)\n3 - largura (>1)");
            return;
        }


        int altura = Integer.parseInt(args[1]);
        int largura = Integer.parseInt(args[2]);

        if (args[0].equals("ascii") || args[0].equals("utf8")) {
            if (altura > 1 && largura > 1) {
                Retangulo r = new Retangulo(altura, largura);
                if (args[0].equals("ascii")) {
                    r.desenharASCII();
                } else {
                    r.desenharUTF8();
                }
            } else {
                if (altura < 2 && largura < 2) {
                    System.out.println("Parâmetros altura e largura errados. Apenas números maiores que 1");
                } else if (largura < 2) {
                    System.out.println("Parâmentro largura errado. Insira número maior que 1");
                } else {
                    System.out.println("Parâmentro altura errado. Insira número maior que 1");
                }
            }
        } else {
            System.out.println("Parâmetro inválido. O primeiro parâmetro (modo) deve ser ascii ou utf8.");
        }
    }
}
