package poo;

public class Robo {
    //atributos
    int area;
    char frente;
    int x, y;
    String plano;

    public String getPlano() {
        return plano;
    }

    public Robo(int area, int x, int y, char frente) {
        this.area = area-1; // nossos vetores vão de 0 a 'area'
        this.x = x;
        this.y = y;
        this.frente = frente;
    }

    public void carregaPlano(String comandos) {
        // quando um valor inválido for lido ou quando a string plano chegar ao valor máximo de 100 o método para.
        for (int i = 0; i < comandos.length(); i++) {
            if (comandos.charAt(i) != 'E' && comandos.charAt(i) != 'D' && comandos.charAt(i) != 'M') {
                return;
            } else {
                if (i ==0 ) {
                    this.plano = String.valueOf(comandos.charAt(i));
                }
                else {
                    if (this.plano.length() < 100) this.plano = this.plano + comandos.charAt(i);
                    else return;
                }
            }
        }
    }

    public void iniciaExplorar() {
        for (int i = 0; i < plano.length(); i++) {
            char comando = plano.charAt(i);
            if (comando == 'E') {
                virarEsquerda();
            }
            else if (comando == 'D') {
                virarDireita();
            }
            else {
                moverFrente();
            }
        }
        // plano é zerado após executado
        this.plano = "";
    }

    private void virarEsquerda() {
        if (this.frente == 'N') this.frente = 'O';
        else if (this.frente == 'O') this.frente = 'S';
        else if (this.frente == 'S') this.frente = 'L';
        else this.frente = 'N';
        imprimeCoordenadas();
    }

    private void virarDireita() {
        if (this.frente == 'N') this.frente = 'L';
        else if (this.frente == 'L') this.frente = 'S';
        else if (this.frente == 'S') this.frente = 'O';
        else this.frente = 'N';
        imprimeCoordenadas();
    }

    private void moverFrente() {
        // mudanças no eixo y
        if (this.frente == 'N') {
            if (this.y < this.area) this.y++;
        }
        else if (this.frente == 'S') {
            if (this.y > 0) this.y--;
        }

        // mudanças no eixo x
        else if (this.frente == 'O') {
            if (this.x > 0) this.x--;
        }
        else {
            if (this.x < this.area) this.x++;
        }
        imprimeCoordenadas();
    }

    public void imprimeCoordenadas() {
        System.out.println("(" + x + ", " + y + ") " + frente);
    }
}
