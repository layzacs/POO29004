import java.util.ArrayList;

public class Comutador {

    private boolean[] vlans;
    int[][] portas;
    private int velocidade;

    // Construtor padrão
    public Comutador() {
         portas = new int[13][7];
         vlans = new boolean[7];
    }

    // Constrututor que permite criar uma vlan e adicionar todas as portas a ela, bem como setar velocidade inicial às portas.
    public Comutador(int vlan, int velocidade) {
        portas = new int[13][7];
        vlans = new boolean[7];
        vlans[vlan] = true;
        for (int i = 0; i < portas.length; i++) {
            portas[i][0] = velocidade;
            portas[i][1] = vlan;
        }
    }

    // cria vlan, mudando o local n do vetor vlan para true.
    public boolean criaVlan(int n) {
        if (n < 7 && n != 0) {
            if (!vlans[n]) {
                vlans[n] = true;
                return true;
            }
            return false;
        }
        return false;
    }

    // sobrecarga de método
    // cria primeira vlan (menor número possível) disponível.
    public boolean criaVlan() {
        for (int i = 1; i< vlans.length; i++) {
            if (!vlans[i]) {
                vlans[i] = true;
                return true;
            }
        }
        // só chegaremos aqui se for possível criar uma nova vlan (número maximo alcançado)
        return false;
    }

    // exclui vlan e tira todas as portas da mesma
    public boolean excluiVlan(int n) {
        if (n < 7 && n != 0) {
            if (vlans[n]) {
                vlans[n] = false;
                excluiVlansPortas(n);
                return true;
            }
            return false;
        }
        return false;
    }

    // Insere uma porta na vlan.
    public boolean inserePorta(int porta, int vlan) {
            if (vlans[vlan]) {
                // se a porta já estiver na vlan, não faz nada e retorna falso
                for (int i=1; i < vlans.length; i++) {
                    if (portas[porta][i] == vlan) {
                        return false;
                    }
                }
                // se a porta não estiver na vlan, ela é adicionada a vlan
                for (int i=1; i < vlans.length; i++) {
                    if (portas[porta][i] == 0) {
                        portas[porta][i] = vlan;
                        return true;
                    }
                }
                return false;

            }
            return false;
    }

    // retira porta da vlan.
    public boolean retiraPorta(int porta, int vlan) {
        // testa se vlan passada existe
        if (vlans[vlan]) {
            // se a porta estiver na vlan, retira.
            for (int i=1; i < vlans.length; i++) {
                if (portas[porta][i] == vlan) {
                    portas[porta][i] = 0;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    // retorna um vetor de int com os números das vlans existentes.
    public ArrayList<Integer> listaVlans() {
        ArrayList<Integer> lista = new ArrayList<>();
        int j=1;
        for (int i=1; i < vlans.length; i++) {
            if (vlans[i]) {
                lista.add(i);
                j++;
            }
        }
        return lista;

    }

    // retorna matriz de portas.
    public int[][] listaPortas() { return portas; }

    // retorna velocidade da porta passada.
    public int getVelocidade(int porta) {
        if (portas[porta][0] == 0) {
            return 100;
        } else return portas[porta][0];
    }
    // modifica velocidade da porta passada.
    public void setVelocidade(int porta, int velocidade) {
        portas[porta][0] = velocidade;
    }

    // percorre toda a matriz procurando pela vlan a ser excluida.
    private void excluiVlansPortas(int vlan) {
        for (int i=1; i < portas.length; i++) {
            for (int j = 1; j < vlans.length; j++) {
                if (portas[i][j] == vlan) {
                    portas[i][j] = 0;
                }
            }

        }
    }

}
