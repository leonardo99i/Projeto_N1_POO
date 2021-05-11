package projeto;

import java.util.Scanner;

public class Main {
    
    public static final int OPCAO_SAIR = 0;
    public static final int INICIAR_JOGO = 1;
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 0;
        int j = 0;

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

        Monstros monstro_1 = new Monstros("Alfredo", "Água", 200, 105, 45, 90, golpe_1, golpe_2);
        Monstros monstro_2 = new Monstros("Jorge", "Fogo", 200, 120, 45, 40, golpe_3, golpe_4);
        Monstros monstro_3 = new Monstros("Armando", "Terra", 200, 95, 45, 45, golpe_5, golpe_6);
        Monstros monstro_4 = new Monstros("Inacio", "Ar", 200, 100, 75, 60, golpe_7, golpe_8);
        Monstros monstro_5 = new Monstros("Carlos", "Grama", 200, 170, 55, 32, golpe_9, golpe_10);
        Monstros monstro_6 = new Monstros("Miguel", "Eletricidade", 200, 99, 65, 87, golpe_11, golpe_12);

        Monstros[] monstros = {monstro_1, monstro_2, monstro_3, monstro_4, monstro_5, monstro_6};
        Monstros[] user_1 = new Monstros[3];
        Monstros[] user_2 = new Monstros[3];
        
        System.out.println("----Menu de Opções----");
        System.out.println("Monstro 0 - " + monstro_1);
        System.out.println("Monstro 1 - " + monstro_2);
        System.out.println("Monstro 2 - " + monstro_3);
        System.out.println("Monstro 3 - " + monstro_4);
        System.out.println("Monstro 4 - " + monstro_5);
        System.out.println("Monstro 5 - " + monstro_6);

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

        System.out.println("User 1 escolheu: ");
        System.out.println("1 - " + user_1[0].toString());
        System.out.println("2 - " + user_1[1].toString());
        System.out.println("3 - " + user_1[2].toString());
        System.out.println();
        System.out.println("User 2 escolheu: ");
        System.out.println("1 - " + user_2[0].toString());
        System.out.println("2 - " + user_2[1].toString());
        System.out.println("3 - " + user_2[2].toString());

        int decisao;
        do{
            System.out.println("Digite 1 para começar o jogo ou 0 para sair ");
            decisao = input.nextInt();
            switch(decisao){
                case Main.OPCAO_SAIR -> {
                }
                
                case Main.INICIAR_JOGO -> iniciarJogo(user_1, user_2, user_1[i].getVida(), user_2[j].getVida());
                
                default -> System.out.println("Opção Invalida!");
            }
        }while(decisao != Main.OPCAO_SAIR);
    }
    
        
    public static void iniciarJogo(Monstros[] user_1, Monstros[] user_2, int vida1, int vida2){
        
        int i=0;
        int j=0;
        
        int monstroVivo_1 = 3; //User_1
        int monstroVivo_2 = 3; //User2
        
        boolean vivo = true;
        
        
        do{ //fiz um do while pra ele nao pegar novamente o valor de i=0 e substituir i quando o monstro for trocado, mas o criterio de para do while esta errado
        
        int bonusElemento;    
        
          
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
        
        //Criando criterios dos elementos
        if("Água".equals(user_1[i].getTipoElemento()) && "Fogo".equals(user_2[j].getTipoElemento()) || "Fogo".equals(user_1[i].getTipoElemento()) && "Água".equals(user_2[j].getTipoElemento())){
            bonusElemento = 2;
        }else if ("Terra".equals(user_1[i].getTipoElemento()) && "Eletricidade".equals(user_2[j].getTipoElemento()) || "Eletricidade".equals(user_1[i].getTipoElemento()) && "Terra".equals(user_2[j].getTipoElemento())){
            bonusElemento = 2;
        }else if ("Ar".equals(user_1[i].getTipoElemento()) && "Grama".equals(user_2[j].getTipoElemento()) || "Grama".equals(user_1[i].getTipoElemento()) && "Ar".equals(user_2[j].getTipoElemento())){
            bonusElemento = 2;
        }else{
            bonusElemento = 1;
        }
        
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
        
        if(escolhaRodada_1 == 1 && escolhaRodada_2 == 1){
            if(user_1[i].getVelocidade() > user_2[j].getVelocidade()){
                System.out.println("User 1 ataca primeiro!!!");
                System.out.println("A batalha começou:");
                System.out.println("User 1: " + user_1[i].getNomeMonstro());
                System.out.println("User 2: " + user_2[j].getNomeMonstro());
                user_2[j].setVida(user_2[j].getVida() + user_2[j].getDefesa() - user_1[i].getForca() - (user_1[i].getGolpe(escolheGolpe)* bonusElemento));
                if(user_2[j].getVida() <= 0){
                    monstroVivo_2--;
                    System.out.println("User 2 troque seu monstro");
                }else{
                    System.out.println("A vida do user 2 caiu para: " + user_2[j].getVida());
                    System.out.println("Rodada finalizada");
                    System.out.println(user_2[j].estaVivo());
                }
            }
            else if(user_1[i].getVelocidade() < user_2[j].getVelocidade()){
                System.out.println("User 2 ataca primeiro!!!");
                System.out.println("A batalha começou:");
                System.out.println("User 1: " + user_1[i].getNomeMonstro());
                System.out.println("User 2: " + user_2[j].getNomeMonstro());
                user_1[i].setVida(user_1[i].getVida() + user_1[i].getDefesa() - user_2[j].getForca()- (user_2[j].getGolpe(escolheGolpe_2)* bonusElemento));
              
                if(user_1[i].getVida() <= 0){
                    monstroVivo_1--;
                    System.out.println("User 1 troque seu monstro");
                }else{
                    System.out.println("A vida do user 1 caiu para: " + user_1[i].getVida());
                    System.out.println("Rodada finalizada");
                    System.out.println(user_1[i].estaVivo());
                }
            }
            else if(user_1[i].getVelocidade() == user_2[j].getVelocidade()){
                if(user_1[i].getDefesa() > user_2[j].getDefesa()){
                    System.out.println("User 1 ataca primeiro!!!");
                    System.out.println("A batalha começou:");
                    System.out.println("User 1: " + user_1[i].getNomeMonstro());
                    System.out.println("User 2: " + user_2[j].getNomeMonstro());
                    user_2[j].setVida(user_2[j].getVida() + user_2[j].getDefesa() - user_1[i].getForca() - (user_1[i].getGolpe(escolheGolpe)* bonusElemento));
                    
                    if(user_2[j].getVida() <= 0){
                        monstroVivo_2--;
                        System.out.println("User 2 troque seu monstro");
                    }else{
                        System.out.println("A vida do user 2 caiu para: " + user_2[j].getVida());
                        System.out.println("Rodada finalizada");
                        System.out.println(user_2[j].estaVivo());
                    }
                }
                else{
                    System.out.println("User 2 ataca primeiro!!!");
                    System.out.println("A batalha começou:");
                    System.out.println("User 1: " + user_1[i].getNomeMonstro());
                    System.out.println("User 2: " + user_2[j].getNomeMonstro());
                    user_1[i].setVida(user_1[i].getVida() + user_1[i].getDefesa() - user_2[j].getForca() - (user_2[j].getGolpe(escolheGolpe_2) * bonusElemento));
                    
                    if(user_1[i].getVida() <= 0){
                        monstroVivo_1--;
                        System.out.println("User 1 troque seu monstro");
                    }else{
                        System.out.println("A vida do user 2 caiu para: " + user_1[i].getVida());
                        System.out.println("Rodada finalizada");
                        System.out.println(user_1[i].estaVivo());
                    }
                }
            }
        }
        else if(escolhaRodada_1 == 1 && escolhaRodada_2 == 2){
            Scanner troca = new Scanner(System.in);
            System.out.println("User 2: Você tem essas opções! ");
            System.out.println("0 - para o Monstro " + user_2[0].getNomeMonstro());
            System.out.println("1 - para o Monstro " + user_2[1].getNomeMonstro());
            System.out.println("2 - para o Monstro " + user_2[2].getNomeMonstro());
            System.out.println("Escolha a sua troca: ");
            int troca_1 = troca.nextInt();
            switch (troca_1) {
                case 1:
                    j = 1;
                    user_2[1].getVida();
                    System.out.println(user_2[1].getVida());
                    System.out.println(user_2[j].getNomeMonstro());
                    
                    if("Água".equals(user_1[i].getTipoElemento()) && "Fogo".equals(user_2[j].getTipoElemento()) || "Fogo".equals(user_1[i].getTipoElemento()) && "Água".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else if ("Terra".equals(user_1[i].getTipoElemento()) && "Eletricidade".equals(user_2[j].getTipoElemento()) || "Eletricidade".equals(user_1[i].getTipoElemento()) && "Terra".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else if ("Ar".equals(user_1[i].getTipoElemento()) && "Grama".equals(user_2[j].getTipoElemento()) || "Grama".equals(user_1[i].getTipoElemento()) && "Ar".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else{
                        bonusElemento = 1;
                    }
                    
                    System.out.println("User 1 ataca primeiro!!!");
                    System.out.println("A batalha começou:");
                    System.out.println("User 1: " + user_1[i].getNomeMonstro());
                    System.out.println("User 2: " + user_2[j].getNomeMonstro());
                    user_2[j].setVida(user_2[j].getVida() + user_2[j].getDefesa() - user_1[i].getForca() - (user_1[i].getGolpe(escolheGolpe) * bonusElemento));
                    
                    if(user_2[j].getVida() <= 0){
                        monstroVivo_2--;
                        System.out.println("User 2 troque seu monstro");
                    }else{
                        System.out.println("A vida do user 2 caiu para: " + user_2[j].getVida());
                        System.out.println("Rodada finalizada");
                        System.out.println(user_2[j].estaVivo());
                    }
                    break;
                case 2:
                    j = 2;
                    user_2[2].getVida();
                    System.out.println(user_2[2].getVida());
                    System.out.println(user_2[j].getNomeMonstro());
                    
                    if("Água".equals(user_1[i].getTipoElemento()) && "Fogo".equals(user_2[j].getTipoElemento()) || "Fogo".equals(user_1[i].getTipoElemento()) && "Água".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else if ("Terra".equals(user_1[i].getTipoElemento()) && "Eletricidade".equals(user_2[j].getTipoElemento()) || "Eletricidade".equals(user_1[i].getTipoElemento()) && "Terra".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else if ("Ar".equals(user_1[i].getTipoElemento()) && "Grama".equals(user_2[j].getTipoElemento()) || "Grama".equals(user_1[i].getTipoElemento()) && "Ar".equals(user_2[j].getTipoElemento())){
                         bonusElemento = 2;
                    }else{
                         bonusElemento = 1;
                    }
                    
                    System.out.println("User 1 ataca primeiro!!!");
                    System.out.println("A batalha começou:");
                    System.out.println("User 1: " + user_1[i].getNomeMonstro());
                    System.out.println("User 2: " + user_2[j].getNomeMonstro());
                    user_2[j].setVida(user_2[j].getVida() + user_2[j].getDefesa() - user_1[i].getForca() - (user_1[i].getGolpe(escolheGolpe) * bonusElemento));
                    if(user_2[j].getVida() <= 0){
                        monstroVivo_2--;
                        System.out.println("User 2 troque seu  monstro");
                    }else{
                        System.out.println("A vida do user 2 caiu para: " + user_2[j].getVida());
                        System.out.println("Rodada finalizada");
                        System.out.println(user_2[j].estaVivo());
                    }
                    break;
                case 0:
                    j = 0;
                    user_2[2].getVida();
                    System.out.println(user_2[j].getVida());
                    System.out.println(user_2[j].getNomeMonstro());
                    
                    if("Água".equals(user_1[i].getTipoElemento()) && "Fogo".equals(user_2[j].getTipoElemento()) || "Fogo".equals(user_1[i].getTipoElemento()) && "Água".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else if ("Terra".equals(user_1[i].getTipoElemento()) && "Eletricidade".equals(user_2[j].getTipoElemento()) || "Eletricidade".equals(user_1[i].getTipoElemento()) && "Terra".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else if ("Ar".equals(user_1[i].getTipoElemento()) && "Grama".equals(user_2[j].getTipoElemento()) || "Grama".equals(user_1[i].getTipoElemento()) && "Ar".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else{
                        bonusElemento = 1;
                    }
                    
                    System.out.println("User 1 ataca primeiro!!!");
                    System.out.println("A batalha começou:");
                    System.out.println("User 1: " + user_1[i].getNomeMonstro());
                    System.out.println("User 2: " + user_2[j].getNomeMonstro());
                    user_2[j].setVida(user_2[j].getVida() + user_2[j].getDefesa() - user_1[i].getForca() - (user_1[i].getGolpe(escolheGolpe) * bonusElemento));
                    if(user_2[j].getVida() <= 0){
                        monstroVivo_2--;
                        System.out.println("User 2 troque seu monstro");
                    }else{
                        System.out.println("A vida do user 2 caiu para: " + user_2[j].getVida());
                        System.out.println("Rodada finalizada");
                        System.out.println(user_2[j].estaVivo());
                    }
                    
                    break;
                default:
                    break;
            }
            System.out.println("Troca Efetuada: " + troca_1);
        }
        else if(escolhaRodada_1 == 2 && escolhaRodada_2 == 1){
            Scanner troca_ = new Scanner(System.in);
            System.out.println("User 1: Você tem essas opções! ");
            System.out.println("o - Monstro " + user_1[0].getNomeMonstro());
            System.out.println("1 - Monstro " + user_1[1].getNomeMonstro());
            System.out.println("2 - Monstro " + user_1[2].getNomeMonstro());
            System.out.println("Escolha a sua troca: ");
            int troca_2 = troca_.nextInt();
            switch (troca_2) {
                case 1:
                    i = 1;
                    user_1[1].getVida();
                    System.out.println(user_1[1].getVida());
                    System.out.println(user_1[i].getNomeMonstro());
                    
                    if("Água".equals(user_1[i].getTipoElemento()) && "Fogo".equals(user_2[j].getTipoElemento()) || "Fogo".equals(user_1[i].getTipoElemento()) && "Água".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else if ("Terra".equals(user_1[i].getTipoElemento()) && "Eletricidade".equals(user_2[j].getTipoElemento()) || "Eletricidade".equals(user_1[i].getTipoElemento()) && "Terra".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else if ("Ar".equals(user_1[i].getTipoElemento()) && "Grama".equals(user_2[j].getTipoElemento()) || "Grama".equals(user_1[i].getTipoElemento()) && "Ar".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else{
                        bonusElemento = 1;
                    }
                    
                    System.out.println("User 2 ataca primeiro!!!");
                    System.out.println("A batalha começou:");
                    System.out.println("User 1: " + user_1[i].getNomeMonstro());
                    System.out.println("User 2: " + user_2[j].getNomeMonstro());
                    user_1[i].setVida(user_1[i].getVida() + user_1[i].getDefesa() - user_2[j].getForca() - (user_2[j].getGolpe(escolheGolpe) * bonusElemento));
                    if(user_1[i].getVida() <= 0){
                        monstroVivo_1--;
                        System.out.println("User 1 troque seu  monstro");
                    }else{
                        System.out.println("A vida do user 1 caiu para: " + user_1[i].getVida());
                        System.out.println("Rodada finalizada");
                        System.out.println(user_1[i].estaVivo());
                    }
                case 2:
                    i = 2;
                    user_1[2].getVida();
                    System.out.println(user_1[2].getVida());
                    System.out.println(user_1[i].getNomeMonstro());
                    
                    if("Água".equals(user_1[i].getTipoElemento()) && "Fogo".equals(user_2[j].getTipoElemento()) || "Fogo".equals(user_1[i].getTipoElemento()) && "Água".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else if ("Terra".equals(user_1[i].getTipoElemento()) && "Eletricidade".equals(user_2[j].getTipoElemento()) || "Eletricidade".equals(user_1[i].getTipoElemento()) && "Terra".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else if ("Ar".equals(user_1[i].getTipoElemento()) && "Grama".equals(user_2[j].getTipoElemento()) || "Grama".equals(user_1[i].getTipoElemento()) && "Ar".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else{
                        bonusElemento = 1;
                    }
                    
                    System.out.println("User 2 ataca primeiro!!!");
                    System.out.println("A batalha começou:");
                    System.out.println("User 1: " + user_1[i].getNomeMonstro());
                    System.out.println("User 2: " + user_2[j].getNomeMonstro());
                    user_1[i].setVida(user_1[i].getVida() + user_1[i].getDefesa() - user_2[j].getForca() - (user_2[j].getGolpe(escolheGolpe) * bonusElemento));          
                    if(user_1[i].getVida() <= 0){
                        monstroVivo_1--;
                        System.out.println("User 1 troque seu monstro");
                    }else{
                        System.out.println("A vida do user 1 caiu para: " + user_1[i].getVida());
                        System.out.println("Rodada finalizada");
                        System.out.println(user_1[i].estaVivo());
                    }
                    break;
                case 0:
                    i = 0;
                    user_1[0].getVida();
                    System.out.println(user_1[0].getVida());
                    System.out.println(user_1[i].getNomeMonstro());
                    
                    if("Água".equals(user_1[i].getTipoElemento()) && "Fogo".equals(user_2[j].getTipoElemento()) || "Fogo".equals(user_1[i].getTipoElemento()) && "Água".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else if ("Terra".equals(user_1[i].getTipoElemento()) && "Eletricidade".equals(user_2[j].getTipoElemento()) || "Eletricidade".equals(user_1[i].getTipoElemento()) && "Terra".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else if ("Ar".equals(user_1[i].getTipoElemento()) && "Grama".equals(user_2[j].getTipoElemento()) || "Grama".equals(user_1[i].getTipoElemento()) && "Ar".equals(user_2[j].getTipoElemento())){
                        bonusElemento = 2;
                    }else{
                        bonusElemento = 1;
                    }
                    
                    System.out.println("User 2 ataca primeiro!!!");
                    System.out.println("A batalha começou:");
                    System.out.println("User 1: " + user_1[i].getNomeMonstro());
                    System.out.println("User 2: " + user_2[j].getNomeMonstro());
                    user_1[i].setVida(user_1[i].getVida() + user_1[i].getDefesa() - user_2[j].getForca() - (user_2[j].getGolpe(escolheGolpe) * bonusElemento));
                    if(user_1[i].getVida() <= 0){
                        monstroVivo_1--;
                        System.out.println("User 1 troque seu monstro");
                    }else{
                        System.out.println("A vida do user 1 caiu para: " + user_1[i].getVida());
                        System.out.println("Rodada finalizada");
                        System.out.println(user_1[i].estaVivo());
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Troca Efetuada: " + troca_2);
        }
        
        if(monstroVivo_1 == 0 || monstroVivo_2 == 0){
            System.out.println("Oi");
            vivo = false;
        }
        
        }while(vivo == true);
        
        if(monstroVivo_1 == 0){
            System.out.println("Fim de Jogo!!! User 2 Ganhou!!!");
        }else{
            System.out.println("Fim de Jogo!!! User 1 Ganhou!!! ");
        }
    }
}