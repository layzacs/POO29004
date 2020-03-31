package poo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Pessoa> contatos;

    public Agenda() {
        this.contatos = new ArrayList<Pessoa>();
    }

    public void addPessoa(Pessoa p) {
        contatos.add(p);
    }

    public boolean removePessoa(String n, String s) {
        for(Pessoa p : contatos){ // percorrendo o ArrayList
            if (p.getNome().equals(n) && p.getSobrenome().equals(s)) {
                contatos.remove(p);
                return true;
            }
        }
        return false;
    }

    public boolean addTelefone(String r, String n, int pIndex) {
        return contatos.get(pIndex).addTelefone(r, n);

    }

    public boolean addEmail(String r, String e, int pIndex) {
        return contatos.get(pIndex).addEmail(r, e);

    }

    public boolean updateTelefone(String r, String n, int pIndex) {
        return contatos.get(pIndex).updateTelefone(r, n);
    }

    public boolean updateEmail(String r, String e, int pIndex) {
        return contatos.get(pIndex).updateEmail(r, e);
    }

    public boolean removeTelefone(String r, int pIndex) {
        return contatos.get(pIndex).removeTelefone(r);
    }

    public boolean removeEmail(String r, int pIndex) {
        return contatos.get(pIndex).removeEmail(r);
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + contatos +
                '}';
    }

    public int procuraContato(String n, String s) {
        int i = 0;
        for(Pessoa p : contatos){ // percorrendo o ArrayList
            if (p.getNome().equals(n) && p.getSobrenome().equals(s)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Pessoa getContato(int index) {
        return contatos.get(index);
    }
}
