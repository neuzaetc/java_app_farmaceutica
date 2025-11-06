package farmacia.view;

import java.util.Scanner;

public class ViewFarmacia {
    Scanner scan;

    public ViewFarmacia() {
        this.scan = new Scanner(System.in);
    }

    public void mostrarMenuPrincipal() {
        int opcao;
        do {
            System.out.println("\n=== MENU GESTAO FARMACIA X ===");
            System.out.println("1. Registar Encomendas");
            System.out.println("2. Gestão de Produtos");
            System.out.println("3. Gestão de Clientes");
            System.out.println("4. Estatísticas");
            System.out.println("5. Ajuda");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = this.scan.nextInt();
            this.scan.nextLine();
            switch (opcao) {
                case 0:
                    if (this.confirmarSair()) {
                        this.encerrarAplicacao();
                    }
                default:
                    System.out.println("Indique uma opção válida!");
                    break;
                case 1:
                    this.limparEcra();
                    this.mostrarMenuEncomendas();
                case 2:
                case 3:
                case 4:
                case 5:
            }
        } while(opcao != 0);

    }

    public void mostrarMenuEncomendas() {
        while(true) {
            System.out.println("\n=== MENU GESTAO ENCOMENDAS X ===");
            System.out.println("1. Registar Encomendas");
            System.out.println("5. Voltar menu principal");
            System.out.println("6. Ajuda");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            int opcao = this.scan.nextInt();
            this.scan.nextLine();
            switch (opcao) {
                case 5:
                    this.limparEcra();
                    this.mostrarMenuPrincipal();
                case 0:
                    if (this.confirmarSair()) {
                        this.encerrarAplicacao();
                    }
                default:
                    System.out.println("Indique uma opção válida!");
                case 1:
                case 2:
                case 3:
                case 4:
                    if (opcao == 0) {
                        return;
                    }
            }
        }
    }

    private void limparEcra() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                (new ProcessBuilder(new String[]{"cmd", "/c", "cls"})).inheritIO().start().waitFor();
            } else {
                System.out.print("\u001b[H\u001b[2J");
                System.out.flush();
            }
        } catch (Exception var3) {
            for(int i = 0; i < 50; ++i) {
                System.out.println();
            }
        }

    }

    private boolean confirmarSair() {
        while(true) {
            System.out.println("Pretende mesmo sair? s/n ");
            String resposta = this.scan.nextLine().trim().toLowerCase();
            if ("s".equals(resposta)) {
                return true;
            }

            if ("n".equals(resposta)) {
                return false;
            }
            System.out.println("Indique uma opção válida!\nIndique n ou s.");
        }
    }

    private void encerrarAplicacao() {
        System.out.println("Encerrando!");
        this.scan.close();
        System.out.flush();
        System.exit(0);
    }
}

