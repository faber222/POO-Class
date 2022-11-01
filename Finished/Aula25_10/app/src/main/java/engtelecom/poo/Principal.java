package engtelecom.poo;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    private Agenda agenda;

    public static void main(String[] args) {
        Principal agendaTelefonica = new Principal();
        agendaTelefonica.menu();
    }

    public void menu() {
        int x = 2;
        this.agenda = new Agenda();
        Scanner keyboard = new Scanner(System.in);

        while (x != 0) {
            System.out.println("\nOla, bem vindo a sua agenda!");
            System.out.println("Para abrir sua agenda, tecle (1)");
            System.out.println("Para sair, tecle (0)");
            System.out.print(">");
            x = keyboard.nextInt();
            switch (x) {
                case 1:

                    int m = 10;
                    while (m != 0) {
                        System.out.println("\nPara adicionar um novo contato, digite (1)");
                        System.out.println("Para remover um contato, digite (2)");
                        System.out.println("Para editar um contato, digite (3)");
                        System.out.println("Para visualizar um contato, digite (4)");
                        System.out.println("Para voltar, digite (0)");
                        System.out.print(">");
                        m = keyboard.nextInt();
                        switch (m) {
                            case 1:
                                String n, s;
                                int year, month, day;
                                System.out.println("Qual o primeiro nome do contato?");
                                System.out.print(">");
                                n = keyboard.next();
                                System.out.println("Qual o sobrenome? ");
                                System.out.print(">");
                                s = keyboard.next();
                                System.out.println("Qual ano de nascimento? ");
                                System.out.print(">");
                                year = keyboard.nextInt();
                                System.out.println("Qual mês de nascimento? ");
                                System.out.print(">");
                                month = keyboard.nextInt();
                                System.out.println("Qual dia de nascimento? ");
                                System.out.print(">");
                                day = keyboard.nextInt();

                                Pessoa novoContato = new Pessoa(n, s, LocalDate.of(year, month, day));
                                if (this.agenda.addPessoa(novoContato)) {
                                    System.out.println("\nAdicionado com sucesso!");
                                } else {
                                    System.out.println("\nContato ja existe!");
                                }
                                break;
                            case 2:
                                String nome, sobrenome;
                                System.out.println("Qual o primeiro nome do contato?");
                                System.out.print(">");
                                nome = keyboard.next();
                                System.out.println("Qual o sobrenome do contato?");
                                System.out.print(">");
                                sobrenome = keyboard.next();

                                if (this.agenda.removePessoa(nome, sobrenome)) {
                                    System.out.println("\nRemovido com sucesso!");
                                } else {
                                    System.out.println("\nNão foi possível remover, contato inexistente!");
                                }
                                break;
                            case 3:
                                int z = 7;
                                while (z != 0) {
                                    System.out.println("\nAdicionar email (1)");
                                    System.out.println("Remover email (2)");
                                    System.out.println("Adicionar telefone (3)");
                                    System.out.println("Remover telefone (4)");
                                    System.out.println("Editar email (5)");
                                    System.out.println("Editar telefone (6)");
                                    System.out.println("Voltar (0)");
                                    System.out.print(">");
                                    z = keyboard.nextInt();
                                    switch (z) {
                                        case 1:
                                            int j = 0;
                                            for (Pessoa contatos : this.agenda.getContatos()) {
                                                System.out.println(contatos.getNome() + " " + contatos.getSobrenome()
                                                        + " (" + j + ")");
                                                j++;
                                            }
                                            System.out.println("\nQual contato editar?");
                                            System.out.print(">");
                                            int valorContato = keyboard.nextInt();
                                            String rotulo, email;
                                            System.out.println("Qual o rótulo?");
                                            System.out.print(">");
                                            rotulo = keyboard.next();
                                            System.out.println("Qual o email? (email@empresa.com)");
                                            System.out.print(">");
                                            email = keyboard.next();

                                            if (this.agenda.addEmail(rotulo, email, valorContato)) {
                                                System.out.println("\nAdicionado com sucesso!");
                                            } else {
                                                System.out.println("\nEmail inválido!");
                                            }
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                        case 5:
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 4:
                                System.out.println(this.agenda.toString());
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
