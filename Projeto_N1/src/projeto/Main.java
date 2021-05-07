package projeto;

import java.util.Scanner;

public class Main {
    
    public static final int OPCAO_SAIR = 0;
    public static final int INICIAR_JOGO = 1;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Golpes golpe_1 = new Golpes("Super Soco", 30, "Ar");
        Golpes golpe_2 = new Golpes("Soco Duplo", 60, "Fogo");
        Golpes golpe_3 = new Golpes("Super Soco", 30, "Ar");
        Golpes golpe_4 = new Golpes("Super Soco", 30, "Ar");
        Golpes golpe_5 = new Golpes("Super Soco", 30, "Ar");
        Golpes golpe_6 = new Golpes("Super Soco", 30, "Ar");
        Golpes golpe_7 = new Golpes("Super Soco", 30, "Ar");
        Golpes golpe_8 = new Golpes("Super Soco", 30, "Ar");
        Golpes golpe_9 = new Golpes("Super Soco", 30, "Ar");
        Golpes golpe_10 = new Golpes("Super Soco", 30, "Ar");
        Golpes golpe_11 = new Golpes("Super Soco", 30, "Ar");
        Golpes golpe_12 = new Golpes("Super Soco", 30, "Ar");

        Golpes[] golpes = {golpe_1, golpe_2, golpe_3, golpe_4, golpe_5, golpe_6, golpe_7, golpe_8, golpe_9, golpe_10, golpe_11, golpe_12};

        Monstros monstro_1 = new Monstros("Alfredo", "Água", 45, 45, 45, 45, golpe_1, golpe_2);
        Monstros monstro_2 = new Monstros("Jorge", "Fogo", 45, 45, 45, 45, golpe_3, golpe_4);
        Monstros monstro_3 = new Monstros("Armando", "Terra", 45, 45, 45, 45, golpe_5, golpe_6);
        Monstros monstro_4 = new Monstros("Inacio", "Ar", 45, 45, 45, 45, golpe_7, golpe_8);
        Monstros monstro_5 = new Monstros("Carlos", "Ar", 45, 45, 45, 45, golpe_9, golpe_10);
        Monstros monstro_6 = new Monstros("Miguel", "Fogo", 45, 45, 45, 45, golpe_11, golpe_12);

        Monstros[] monstros = {monstro_1, monstro_2, monstro_3, monstro_4, monstro_5, monstro_6};
        Monstros[] user_1 = new Monstros[3];
        Monstros[] user_2 = new Monstros[3];

        int escolha = 0;
        while(escolha < 3){
            System.out.println("User 1: Escolha seus personagens: ");
            int opcao_1 = input.nextInt();
            user_1[escolha] = monstros[opcao_1];
            escolha++;
        }

        escolha = 0;
        while(escolha < 3){
            System.out.println("User 2: Escolha seus personagens: ");
            int opcao_2 = input.nextInt();
            user_2[escolha] = monstros[opcao_2];
            escolha++;
        }

        System.out.println("User 1 escolheu " + user_1[0].toString());
        System.out.println("User 1 escolheu " + user_1[1].toString());
        System.out.println("User 1 escolheu " + user_1[2].toString());
        System.out.println();
        System.out.println("User 2 escolheu " + user_2[0].toString());
        System.out.println("User 2 escolheu " + user_2[1].toString());
        System.out.println("User 2 escolheu " + user_2[2].toString());

        int decisao;
        do{
            System.out.println("Digite 1 para começar o jogo ou 0 para sair ");
            decisao = input.nextInt();

            switch(decisao){
                case Main.OPCAO_SAIR:
                    break;
                
                case Main.INICIAR_JOGO:
                    iniciarJogo(user_1, user_2);
                    break;
                
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        }while(decisao != Main.OPCAO_SAIR);
        input.close();
    }

    public static void iniciarJogo(Monstros[] user_1, Monstros[] user_2){
    
        Scanner scanner = new Scanner(System.in);
        
            System.out.println("User 1: Menu de Escolha!!:");
            System.out.println("1- Ataque: ");
            System.out.println("2 - Trocar");
            int escolhaRodada_1 = scanner.nextInt();
            System.out.println("User 1 - Escolheu: " + escolhaRodada_1);

            System.out.println("User 2: Menu de Escolha!!:");
            System.out.println("1- Ataque: ");
            System.out.println("2 - Trocar");
            int escolhaRodada_2 = scanner.nextInt();
            System.out.println("User 2 - Escolheu: " + escolhaRodada_2);
            scanner.close();

        if(escolhaRodada_1 == 1 && escolhaRodada_2 == 1){
            System.out.println("A batalha começou:");
            int escolha = 0;
            user_1[escolha].getDefesa();  
        }
    }
}