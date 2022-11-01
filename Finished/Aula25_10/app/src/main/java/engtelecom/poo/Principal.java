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
        while (x != 0) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Ola, bem vindo a sua agenda!");
            System.out.println("Para abrir sua agenda, tecle (1)");
            System.out.println("Para sair, tecle (0)");
            System.out.print(">");
            x = keyboard.nextInt();
            switch (x) {
                case 1:
                
                    int m = 10;
                    while (m != 0) {
                        System.out.println("Para adicionar um novo contato, digite (1)");
                        System.out.println("Para remover um contato, digite (2)");
                        System.out.println("Para editar um contato, digite (3)");
                        System.out.println("Para visualizar um contato, digite (4)");
                        System.out.println("Para voltar, digite (0)");
                        System.out.print(">");
                        m = keyboard.nextInt();
                        switch (m) {
                            case 1:
                                String n, s;
                                System.out.print("Qual o primeiro nome do contato? ");
                                n = keyboard.next();
                                System.out.print("Qual o sobrenome? ");
                                s = keyboard.next();

                                Pessoa novoContato = new Pessoa(n, s, LocalDate.now());
                                if (this.agenda.addPessoa(novoContato)) {
                                    this.agenda.addPessoa(novoContato);
                                    System.out.println("");
                                    System.out.println("Adicionado com sucesso!");
                                } else {
                                    System.out.println("");
                                    System.out.println("Contato ja existe!");
                                }

                                break;
                            case 2:
                                int i;
                                System.out.print("Da sua lista de contatos, qual a posição do contato: ");
                                i = keyboard.nextInt();
                                System.out.println();
                                break;
                            case 3:

                                break;
                            case 4:

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
