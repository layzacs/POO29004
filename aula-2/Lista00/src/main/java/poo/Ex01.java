package poo;

public class Ex01 {

    // Testa se é um triângulo e retorna true/false
    public boolean testaTriangulo(double a, double b, double c) {
        // pra ser um triangulo, a soma de dois lados precisa ser maior que o terceiro lado
        if ((a+b) > c) {
            return true;
        } else {
            return false;
        }
    }

    // retorna o tipo de triângulo
    public String TestaTipo(double a, double b, double c) {
        // se todos os 3 lados for igual, é um equilatero
        if (a == b && b == c) {
            return "Equilátero";
        }
        // se dois dos lados forem iguais é isósceles
        else if (a == b || b == c || a == c) {
            return "Isósceles";
        }
        // se todos os lados forem diferentes, escaleno
        else {
            return "Escaleno";
        }
    }
}
