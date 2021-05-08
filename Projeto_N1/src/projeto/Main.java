package projeto;

import java.util.Scanner;

public class Main {
    
    public static final int OPCAO_SAIR = 0;
    public static final int INICIAR_JOGO = 1;
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Golpes golpe_1 = new Golpes("Super soco", 46, "Água");
        Golpes golpe_2 = new Golpes("Tsunami", 60, "Água");
        Golpes golpe_3 = new Golpes("Labareda", 90, "Fogo");
        Golpes golpe_4 = new Golpes("Chute triplo", 30, "Fogo");
        Golpes golpe_5 = new Golpes("Soco alto", 37, "Terra");
        Golpes golpe_6 = new Golpes("Terremoto", 88, "Terra");
        Golpes golpe_7 = new Golpes("Rasteira", 40, "Ar");
        Golpes golpe_8 = new Golpes("Furacão", 60, "Ar");
        Golpes golpe_9 = new Golpes("Soco duplo", 70, "Grama");
        Golpes golpe_10 = new Golpes("Plantas carnívoras", 75, "Grama");
        Golpes golpe_11 = new Golpes("Chute duplo", 65, "Eletricidade");
        Golpes golpe_12 = new Golpes("Super choque", 99, "Eletricidade");

        Golpes[] golpes = {golpe_1, golpe_2, golpe_3, golpe_4, golpe_5, golpe_6, golpe_7, golpe_8, golpe_9, golpe_10, golpe_11, golpe_12};

        Monstros monstro_1 = new Monstros("Alfredo", "Água", 1000, 105, 45, 90, golpe_1, golpe_2);
        Monstros monstro_2 = new Monstros("Jorge", "Fogo", 1000, 120, 45, 40, golpe_3, golpe_4);
        Monstros monstro_3 = new Monstros("Armando", "Terra", 1000, 95, 45, 45, golpe_5, golpe_6);
        Monstros monstro_4 = new Monstros("Inacio", "Ar", 1000, 100, 75, 60, golpe_7, golpe_8);
        Monstros monstro_5 = new Monstros("Carlos", "Grama", 1000, 170, 55, 32, golpe_9, golpe_10);
        Monstros monstro_6 = new Monstros("Miguel", "Eletricidade", 1000, 99, 65, 87, golpe_11, golpe_12);

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

        System.out.println("User 1 escolheu: 1 - " + user_1[0].toString());
        System.out.println("2 - " + user_1[1].toString());
        System.out.println("3 - " + user_1[2].toString());
        System.out.println();
        System.out.println("User 2 escolheu: 1 - " + user_2[0].toString());
        System.out.println("2 - " + user_2[1].toString());
        System.out.println("3 - " + user_2[2].toString());

        int decisao;
        do{
            System.out.println("Digite 1 para começar o jogo ou 0 para sair ");
            decisao = input.nextInt();

            switch(decisao){
                case Main.OPCAO_SAIR:
                    break;
                
                case Main.INICIAR_JOGO:
                    iniciarJogo(user_1, user_2, golpes);
                    break;
                
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        }while(decisao != Main.OPCAO_SAIR);
    }
    
        
    public static void iniciarJogo(Monstros[] user_1, Monstros[] user_2, Golpes[] golpes){
        
        int i=0;
        int j=0;
        do{ //fiz um do while pra ele nao pegar novamente o valor de i=0 e substituir i quando o monstro for trocado, mas o criterio de para do while esta errado
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
        
        System.out.println("Escolha de Golpe: ");
        System.out.println("User 1: Menu de Escolha de Golpes.");
        System.out.println("1- Golpe: " + user_1[i].getGolpe_1());
        System.out.println("2- Golpe: " + user_1[i].getGolpe_2());
        int escolheGolpe = scanner.nextInt();
        System.out.println("Escolheu o Golpe: " + escolheGolpe);
        
        System.out.println("Escolha de Golpe: ");
        System.out.println("User 2: Menu de Escolha de Golpes.");
        System.out.println("1- Golpe: " + user_2[j].getGolpe_1());
        System.out.println("2- Golpe: " + user_2[j].getGolpe_2());
        int escolheGolpe_2 = scanner.nextInt();
        System.out.println("Escolheu o Golpe: " + escolheGolpe_2);
        
        int rodada_1;
        if(escolhaRodada_1 == 1 && escolhaRodada_2 == 1){
            if(user_1[i].getVelocidade() > user_2[j].getVelocidade()){
                System.out.println("User 1 ataca primeiro!!!");
                System.out.println("A batalha começou:");
                System.out.println("User 1: " + user_1[i].getNomeMonstro());
                System.out.println("User 2: " + user_2[j].getNomeMonstro());
                //teriamos que colocar com o set a vida se nao o valor não é salvo e continua como o inicial mas nao sei como fazer
                rodada_1 = user_2[j].getVida() + user_2[j].getDefesa() - user_1[i].getForca() - user_1[i].getGolpe(escolheGolpe);
                System.out.println(rodada_1);
                //rodada_1 = user_2[j].setVida();
                System.out.println("Rodada finalizada");
            }
            else if(user_1[i].getVelocidade() < user_2[j].getVelocidade()){
                System.out.println("User 2 ataca primeiro!!!");
                System.out.println("A batalha começou:");
                System.out.println("User 1: " + user_1[i].getNomeMonstro());
                System.out.println("User 2: " + user_2[j].getNomeMonstro());
                rodada_1 = user_1[i].getVida() + user_1[i].getDefesa() - user_2[j].getForca()- user_2[j].getGolpe(escolheGolpe_2);
                System.out.println(rodada_1);
                System.out.println(user_1[i].getVida());
                System.out.println("Rodada finalizada");
            }
            else if(user_1[i].getVelocidade() == user_2[j].getVelocidade()){
                if(user_1[i].getDefesa() > user_2[j].getDefesa()){
                    System.out.println("User 1 ataca primeiro!!!");
                    System.out.println("A batalha começou:");
                    System.out.println("User 1: " + user_1[i].getNomeMonstro());
                    System.out.println("User 2: " + user_2[j].getNomeMonstro());
                    rodada_1 = user_2[j].getVida() + user_2[j].getDefesa() - user_1[i].getForca() - user_1[i].getGolpe(escolheGolpe);
                    System.out.println(rodada_1);
                    System.out.println(user_2[j].getVida());
                    System.out.println("Rodada finalizada");
                }
                else{
                    System.out.println("User 2 ataca primeiro!!!");
                    System.out.println("A batalha começou:");
                    System.out.println("User 1: " + user_1[i].getNomeMonstro());
                    System.out.println("User 2: " + user_2[j].getNomeMonstro());
                    rodada_1 = user_1[i].getVida() + user_1[i].getDefesa() - user_2[j].getForca() - user_2[j].getGolpe(escolheGolpe);
                    System.out.println(rodada_1);
                    System.out.println(user_1[i].getVida());
                    System.out.println("Rodada finalizada");
                }
            }
        }
        else if(escolhaRodada_1 == 1 && escolhaRodada_2 == 2){
            Scanner troca = new Scanner(System.in);
            System.out.println("User 2: Você tem essas opções! ");
            System.out.println("1 - para o Monstro " + user_2[j+1].getNomeMonstro());
            System.out.println("2 - para o Monstro " + user_2[j+2].getNomeMonstro());
            System.out.println("Escolha a sua troca: ");
            int troca_1 = troca.nextInt();
            if(troca_1 == 1){
                j = 1;
                System.out.println(user_2[j].getNomeMonstro());
            }
            else if(troca_1 == 2){
                j = 2;
                System.out.println(user_2[j].getNomeMonstro());
            }
            System.out.println("Troca Efetuada: " + troca_1);
        }
        else if(escolhaRodada_1 == 2 && escolhaRodada_2 == 1){
            Scanner troca_ = new Scanner(System.in);
            System.out.println("User 1: Você tem essas opções! ");
            System.out.println("1 - Monstro " + user_1[i+1].getNomeMonstro());
            System.out.println("2 - Monstro " + user_1[i+2].getNomeMonstro());
            System.out.println("Escolha a sua troca: ");
            int troca_2 = troca_.nextInt();
            if(troca_2 == 1){
                i = 1;
                System.out.println(user_1[i].getNomeMonstro());
            }else if(troca_2 == 2){
                i = 2;
                System.out.println(user_1[i].getNomeMonstro());
            }
            System.out.println("Troca Efetuada: " + troca_2);
        }
        }while(user_1[i].getVida() != 0 && user_2[j].getVida() != 0);
    }
}