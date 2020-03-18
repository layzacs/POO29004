package poo;

public class Soldado {
    private final int distanciaPadrao = 4;
    private final String armaPadrao = "fuzil";
    public static int soldados;
    private int distancia = 0;

    public int getDistancia() {
        return distancia;
    }

    public static int getSoldados() {
        return soldados;
    }

    public Soldado() {
        soldados++;
        distancia = 0;

    }

    public void movimentar(int dist) {
        if (dist==0) {
            this.distancia = this.distancia + distanciaPadrao;
        }
        this.distancia = this.distancia + dist;

    }

    public void movimentar() {
        movimentar(4);
    }

    public void atacar(String arma) {
        if (soldados < 3) {
            System.out.println("ainda não, esperando o exército ficar maior.");
        }
        else if (soldados == 10) {
            System.out.println("Ataque do soldado efetuado com a arma " + arma);
        }
    }

    public void atacar() {
        atacar("fuzil");
    }

}
