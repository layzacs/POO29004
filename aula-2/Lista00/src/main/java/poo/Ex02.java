package poo;

public class Ex02 {

    public double SomaSerie(int n) {
        double soma = 0;
        for (int i = 1; i <= n; i++) {
            // se botar 1/i dá erro. tem que ser 1.0 ¯\_(ツ)_/¯
            soma = (1.0/i) + soma;
        }
        return soma;
    };
}
