package poo;

import java.util.HashMap;

public class Telefone {

    // 
    String telefoneER = "(\\(?\\d{2}\\)?\\s)?(\\d{4,5}\\-\\d{4})";

    HashMap<String,String> dados;

    public Telefone() {

        this.dados = new HashMap<String, String>();
    }

    public boolean add(String r, String n) {

        // quando rótulo já existe não adiciona
        if (dados.containsKey(r)) return false;

        if (n.matches(telefoneER)) {
            dados.put(r, n);
            return true;
        }
        return false;


    }

    public boolean remove(String r) {

        // quando o rótulo existe ele é removido
        if (dados.containsKey(r)) {
            dados.remove(r);
            return true;
        }
        return false;
    }

    public boolean update(String r, String n) {
        if (dados.containsKey(r)) {
            if (n.matches(telefoneER)) {
                dados.put(r, n);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "dados=" + dados +
                '}';
    }
}
