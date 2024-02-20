import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Seja bem vindo ao jogo dos Super Heróis!");
        System.out.println("Escolha a luta entre dois Super Heróis: ");
        System.out.println("1) Superman vs Mulher-Maravilha");
        System.out.println("2) Superman vs Thor");
        System.out.println("3) Mulher-Maravilha vs Thor");
        int escolha = scan.nextInt();

        System.out.println("=======================================");
        switch(escolha){
            case 1 ->{
                System.out.println("Escolheu a luta entre o Superman e a Mulher-Maravilha");
                Lutador lutador1 = new Superman();
                Lutador lutador2 = new MulherMaravilha();
                while (lutador1.obterVida() > 0 && lutador2.obterVida() > 0) {
                    System.out.println("Escolha");
                    System.out.println("1) Superman ataca Mulher-Maravilha");
                    System.out.println("2) Mulher-Maravilha ataca Superman");
                    System.out.println("3) Superman defende");
                    System.out.println("4) Mulher-Maravilha defende");
                    System.out.println("=========================================================");
                    System.out.println("Mulher-Maravilha tem "+ lutador2.getVida() + " pontos de vida.");
                    System.out.println("Superman tem " + lutador1.getVida() + " pontos de vida.");
                    System.out.println("Escolha a próxima jogada");
                    int escolha1 = scan.nextInt();

                    switch (escolha1) {
                        case 1 ->
                            lutador1.atacar(lutador2);

                        case 2 ->
                            lutador2.atacar(lutador1);

                        case 3 ->
                            lutador1.defender();

                        case 4 ->
                            lutador2.defender();

                        default ->
                            System.out.println("Opção inválida");

                        
                    }
                }
            }
            case 2 ->{
                System.out.println("Escolheu a luta entre o Superman e Thor");
                Lutador lutador1 = new Superman();
                Lutador lutador2 = new Thor();
                while (lutador1.obterVida() > 0 && lutador2.obterVida() > 0) {
                    System.out.println("Escolha");
                    System.out.println("1) Superman ataca Thor");
                    System.out.println("2) Thor ataca Superman");
                    System.out.println("3) Superman defende");
                    System.out.println("4) Thor defende");
                    System.out.println("=========================================================");
                    System.out.println("Thor tem "+ lutador2.getVida() + " pontos de vida.");
                    System.out.println("Superman tem " + lutador1.getVida() + " pontos de vida.");
                    System.out.println("Escolha a próxima jogada");
                    int escolha1 = scan.nextInt();

                    switch (escolha1) {
                        case 1 -> {
                            lutador1.atacar(lutador2);
                        }
                        case 2 -> {
                            lutador2.atacar(lutador1);
                        }
                        case 3 ->{
                            lutador1.defender();
                        }
                        case 4 ->{
                            lutador2.defender();
                        }
                        default ->{
                            System.out.println("Opção inválida");
                        }
                    }
                }
            }
            case 3 ->{
                System.out.println("Escolheu a luta entre a Mulher-Maravilha e o Thor");
                Lutador lutador1 = new MulherMaravilha();
                Lutador lutador2 = new Thor();
                while (lutador1.obterVida() > 0 && lutador2.obterVida() > 0) {
                    System.out.println("Escolha");
                    System.out.println("1) Mulher-Maravilha ataca Thor");
                    System.out.println("2) Thor ataca Mulher-Maravilha");
                    System.out.println("3) Mulher-Maravilha defende");
                    System.out.println("4) Thor defende");
                    System.out.println("=========================================================");
                    System.out.println("Thor tem " + lutador2.getVida() + " pontos de vida.");
                    System.out.println("Mulher-Maravilha tem " + lutador1.getVida() + " pontos de vida.");
                    System.out.println("Escolha a próxima jogada");
                    int escolha1 = scan.nextInt();

                    switch (escolha1) {
                        case 1 -> {
                            lutador1.atacar(lutador2);
                        }
                        case 2 -> {
                            lutador2.atacar(lutador1);
                        }
                        case 3 ->{
                            lutador1.defender();
                        }
                        case 4 ->{
                            lutador2.defender();
                        }
                        default -> {
                            System.out.println("Opção inválida");
                        }
                    }
                }
            }
            default -> {
                System.out.println("Opção inválida.");
            }
        }



    }
}