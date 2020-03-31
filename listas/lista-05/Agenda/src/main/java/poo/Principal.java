package poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {

        Agenda agenda = new Agenda();
        int opcao = 0;

        do {
            System.out.println("\n\n====Agenda ====");
            System.out.println("\n                  =======================================");
            System.out.println("                  |     1 - Ver todos os contatos         |");
            System.out.println("                  |     2 - Adicionar contato             |");
            System.out.println("                  |     3 - Remover contato               |");
            System.out.println("                  |     4 - Editar contato                |");
            System.out.println("                  |     5 - Ver um contato                |");
            System.out.println("                  |     0 - Sair                          |");
            System.out.println("                  ========================================\n");

            Scanner teclado = new Scanner(System.in);

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(agenda.toString());
                    break;

                case 2:
                    System.out.println("Nome: ");
                    String n = teclado.next();

                    System.out.println("Sobrenome: ");
                    String s = teclado.next();

                    System.out.println("Data de nascimento: (dd/mm/aaaa");
                    String data = teclado.next();

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate dN;
                    try {
                        dN = LocalDate.parse(data, formatter);
                    } catch (Exception e) {
                        System.out.println("Data inválida.");
                        break;
                    }

                    Pessoa p = new Pessoa(n, s, dN);


                    System.out.println("Adicionar telefone ao novo contato? (s/n)");

                    String opt = teclado.next();

                    if (opt.equals("s")) {

                        System.out.println("Digite o rótulo do telefone: (ex: comercial, pessoal) ");
                        String r = teclado.next();

                        System.out.println("Digite o telefone: (ex: (48) 3320-3432, " +
                                "3324-2502, 99822-5252)");
                        String num = teclado.next();

                        if (p.addTelefone(r, num)) {
                            System.out.println("Telefone adicionado.");
                        } else {
                            System.out.println("Telefone inválido ou rótulo já existe.");
                        }
                    }

                    System.out.println("Adicionar email ao novo contato? (s/n)");

                    String opts = teclado.next();

                    if (opts.equals("s")) {

                        System.out.println("Digite o rótulo do email: (ex: comercial, pessoal) ");
                        String r = teclado.next();

                        System.out.println("Digite o email: (ex: joao@email.com");
                        String e = teclado.next();

                        if (p.addEmail(r, e)) {
                            System.out.println("Email adicionado.");
                        } else {
                            System.out.println("Email inválido ou rótulo já existe. Email não foi adicionado");
                        }
                    }
                    agenda.addPessoa(p);
                    System.out.println("Contato criado com sucesso.");
                    break;

                case 3:
                    System.out.println("Digite o nome do contato que deseja excluir:");
                    String ns = teclado.next();
                    System.out.println("Agora o sobrenome:");
                    String sn = teclado.next();

                    if (agenda.removePessoa(ns, sn)) {
                        System.out.println("Contato removido.");
                    } else {
                        System.out.println("Contato passado não existe.");
                    }

                    break;
                case 4:

                    System.out.println("Digite o nome do contato que deseja editar:");
                    String cn = teclado.next();
                    System.out.println("Agora o sobrenome:");
                    String cs = teclado.next();

                    int index = agenda.procuraContato(cn, cs);
                    if (index == -1) {
                        System.out.println("Contato passado não existe.");
                    } else {
                        System.out.println("Digite telefone para editar, excluir ou adicionar um telefone" +
                                " ou digite email para editar, excluir ou adicionar um email:");

                        String op = teclado.next();

                        if (op.equals("telefone")) {
                            System.out.println("escolha: \n1 - editar um telefone\n" +
                                    "2 - excluir um telefone\n" +
                                    "3 - adicionar um telefone");
                            int b = teclado.nextInt();

                            switch (b) {
                                case 1:
                                    System.out.println("Escreva o rótulo do telefone a ser editado:");
                                    String rn = teclado.next();
                                    System.out.println("Escreva o novo telefone:");
                                    String tn = teclado.next();
                                    if (agenda.updateTelefone(rn, tn, index)) {
                                        System.out.println("Telefone modificado.");
                                    } else {
                                        System.out.println("Número de telefone inválido ou rótulo não existe.");
                                    }
                                    break;

                                case 2:
                                    System.out.println("Escreva o rótulo do telefone a ser excluido:");
                                    String ro = teclado.next();
                                    if (agenda.removeTelefone(ro, index)) {
                                        System.out.println("Telefone excluido.");
                                    } else {
                                        System.out.println("Rótulo não existe.");
                                    }
                                    break;


                                case 3:
                                    System.out.println("Escreva o rótulo do telefone a ser adicionado:");
                                    String rp = teclado.next();
                                    System.out.println("Escreva o novo telefone:");
                                    String rq = teclado.next();
                                    if (agenda.addTelefone(rp, rq, index)) {
                                        System.out.println("Telefone adicionado.");
                                    } else {
                                        System.out.println("Telefone inválido ou rótulo já existe.");
                                    }
                                    break;

                                default:
                                    System.out.println("Opção inválida");
                                    break;
                            }


                        }
                        else if (op.equals("email")) {

                            System.out.println("escolha:\n 1 - editar um email\n" +
                                    "2 - excluir um email\n" +
                                    "3 - adicionar um email");
                            int c = teclado.nextInt();

                            switch (c) {
                                case 1:
                                    System.out.println("Escreva o rótulo do email a ser editado:");
                                    String rn = teclado.next();
                                    System.out.println("Escreva o novo email:");
                                    String tn = teclado.next();
                                    if (agenda.updateEmail(rn, tn, index)) {
                                        System.out.println("email modificado.");
                                    } else {
                                        System.out.println("Email inválido ou rótulo não existe.");
                                    }
                                    break;

                                case 2:
                                    System.out.println("Escreva o rótulo do email a ser excluido:");
                                    String ro = teclado.next();
                                    if (agenda.removeEmail(ro, index)) {
                                        System.out.println("Email excluido.");
                                    } else {
                                        System.out.println("Rótulo não existe.");
                                    }
                                    break;


                                case 3:
                                    System.out.println("Escreva o rótulo do Email a ser adicionado:");
                                    String rp = teclado.next();
                                    System.out.println("Escreva o novo Email:");
                                    String rq = teclado.next();
                                    if (agenda.addEmail(rp, rq, index)) {
                                        System.out.println("Email adicionado.");
                                    } else {
                                        System.out.println("Email inválido ou rótulo já existe.");
                                    }
                                    break;

                                default:
                                    System.out.println("Opção inválida");
                                    break;
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Digite o nome do contato que deseja listar:");
                    String g = teclado.next();
                    System.out.println("Agora o sobrenome:");
                    String h = teclado.next();

                    int index_a = agenda.procuraContato(g, h);

                    if (index_a == -1) {
                        System.out.println("Contato não existe.");
                    }
                    Pessoa pe = agenda.getContato(index_a);
                    System.out.println(pe.toString());
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}
