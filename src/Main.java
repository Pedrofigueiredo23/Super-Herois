import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        Lutador superman = new Superman();
        Lutador mulherMaravilha = new MulherMaravilha();
        Lutador thor = new Thor();

        System.out.println("Seja bem vindo ao jogo dos Super Heróis!");

        while (superman.obterVida() > 0 && mulherMaravilha.obterVida() > 0 && thor.obterVida() > 0){
            System.out.println("Escolha um dos combates:");
            System.out.println("a -> Superman");
            System.out.println("b -> Mulher Maravilha");
            System.out.println("c -> Thor");
            String lutador1;
            lutador1 = scan.nextLine();


            switch (lutador1){
                case 1 ->{

                }
            }
            /*if(lutador1.toLowerCase().equals("a")){

            }
            String lutador2;
            lutador2 = scan.nextLine();

            if(lutador2.toLowerCase().equals("a")){

            }*/
        }

    }
}