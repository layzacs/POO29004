package poo;

import java.util.HashMap;

public class Email {

    String emailER = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    HashMap<String,String> dados;

    public Email() {
        this.dados = new HashMap<String, String>();
    }

    public boolean add(String r, String n) {
        if (dados.containsKey(r)) {
            return false;
        }
        if (n.matches(emailER)) {
            dados.put(r, n);
            return true;
        }
        return false;
    }

    public boolean remove(String r) {
        if (dados.containsKey(r)) {
            dados.remove(r);
            return true;
        }
        return false;

    }

    public boolean update(String r, String n) {
        if (dados.containsKey(r)) {
            if (n.matches(emailER)) {
                dados.put(r, n);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Email{" +
                "dados=" + dados +
                '}';
    }
}