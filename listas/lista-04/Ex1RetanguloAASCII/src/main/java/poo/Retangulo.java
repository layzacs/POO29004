package poo;

public class Retangulo {

    // atributos
    private int altura, largura;

    // métodos

    // construtor padrão
    public Retangulo() {
        this.altura = 4;
        this.largura = 4;
    }

    public Retangulo(int alt, int lar) {
        // vamos deixar o principal decidir se as variáveis alt e lar são válidas para a criação de um triangulo.
        // caso colocássemos um "if (alt > 1 && lar > 1)" teríamos que ignorar os valores passados caso eles não fossem
        // válidos e setar, do mesmo jeito, um valor padrão para altura e largura. O valor padrão de controle será (4,4).
        if ( alt > 1 && lar > 1) {
            this.altura = alt;
            this.largura = lar;
        }
        else {
            this.altura = 4;
            this.largura = 4;
        }
    }

    public int getAltura() {
        return this.altura;
    }

    public int getLargura() {
        return this.largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }



    public void desenharASCII() {

        for (int l = 0; l < this.altura; l++) {
            if (l == 0 || l == this.altura - 1) {
                for (int i = 0; i < (this.largura); i++) {
                    if (i == 0 || i == this.largura - 1) {
                        System.out.print("+");
                    } else {
                        System.out.print("-");
                    }
                }
                System.out.println();
            } else {
                for (int j = 0; j < (this.largura); j++) {
                    if (j == 0) {
                        System.out.print("|");
                    } else if (j == this.largura - 1) {
                        System.out.println("|");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
        }
    }

    public void desenharUTF8() {
        for (int l = 0; l < this.altura; l++) {
            if (l == 0) {
                for (int i = 0; i < (this.largura); i++) {
                    if (i == 0) {
                        System.out.print("┌");
                    } else if (i == this.largura - 1) {
                        System.out.print("┐");
                    }
                    else {
                        System.out.print("─");
                    }
                }
                System.out.println();
            } else if (l == this.altura - 1) {
                for (int i = 0; i < (this.largura); i++) {
                    if (i == 0) {
                        System.out.print("└");
                    } else if (i == this.largura - 1) {
                        System.out.print("┘");
                    }
                    else {
                        System.out.print("─");
                    }
                }
            }
            else {
                for (int j = 0; j < (this.largura); j++) {
                    if (j == 0) {
                        System.out.print("│");
                    } else if (j == this.largura - 1) {
                        System.out.println("│");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
        }

    }

}
