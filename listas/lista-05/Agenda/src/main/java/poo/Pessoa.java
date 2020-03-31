package poo;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private Telefone telefones;
    private Email emails;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Pessoa(String n, String s, LocalDate dN) {
        this.nome = n;
        this.sobrenome = s;
        this.dataNasc = dN;
        this.telefones = new Telefone();
        this.emails = new Email();
    }

    public boolean addTelefone(String r, String n) {
        return this.telefones.add(r, n);
    }

    public boolean addEmail (String r, String n) {
        return this.emails.add(r, n);
    }

    public boolean removeTelefone(String r) {
        return telefones.remove(r);
    }

    public boolean removeEmail(String r) {
        return emails.remove(r);
    }

    public boolean updateTelefone (String r, String n) {
        return telefones.update(r, n);
    }


    public boolean updateEmail (String r, String n) {
        return emails.update(r, n);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNasc=" + dataNasc +
                ", telefones=" + telefones +
                ", emails=" + emails +
                '}';
    }
}
