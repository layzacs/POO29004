public class OlaGenerico {
    public static void main(String args[]) {
        // Se não for passado argumento nenhum, nada é inserido no vetor args, checamos o tamanho do vetor args
        if (args.length < 1) {
            System.out.println("Hello World");
        } else {
            System.out.println("Hello " + args[0]);
        }
    }
}
