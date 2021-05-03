package projeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] nomes = {"Alfredo", "Jorge", "Armando", "Inacio", "Carlos", "Miguel"};
        String[] elementos = {"Água", "Fogo", "Terra", "Ar", "Ar", "Fogo"};
        int[] forcas = {45,46,47,48,49,50};
        int[] vidas = {45,46,47,48,49,50};
        int[] defesas = {45,46,47,48,49,50};
        int[] velocidades = {45,46,47,48,49,50};
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

        Monstros[] user1 = new Monstros[3];
        Monstros[] user2 = new Monstros[3];

        int escolha = 0;
        while(escolha < 3){
            System.out.println("User 1: Digite o numero do teu pokemon: ");
            int monstro = scanner.nextInt();
            Monstros monstroUser = new Monstros(nomes[monstro], elementos[monstro], vidas[monstro], forcas[monstro], defesas[monstro], velocidades[monstro], golpes[monstro], golpes[monstro+1]);
            user1[escolha] = monstroUser;
            escolha++;
        }

        escolha = 0;
        while(escolha < 3){
            System.out.println("User 2: Digite o numero do teu pokemon: ");
            int monstro = scanner.nextInt();
            Monstros monstroUser = new Monstros(nomes[monstro], elementos[monstro], vidas[monstro], forcas[monstro], defesas[monstro], velocidades[monstro], golpes[monstro], golpes[monstro+1]);
            user2[escolha] = monstroUser;
            escolha++;
        }

        System.out.println("User 1 escolheu: " + user1[0].toString());
        System.out.println("User 1 escolheu: " + user1[1].toString());
        System.out.println("User 1 escolheu: " + user1[2].toString());
        System.out.println();
        System.out.println("User 2 escolheu: " + user2[0].toString());
        System.out.println("User 2 escolheu: " + user2[1].toString());
        System.out.println("User 2 escolheu: " + user2[2].toString());

        int checaMostro = 0;
        Rodada[] User_1 = new Rodada[2];
        Rodada[] User_2 = new Rodada[2];

        
        do{
            System.out.println("Usuario 1: Menu de Escolha!!!");
            System.out.println("1 - Ataque");
            System.out.println("2 - Troca");
            int escolhaRodada = scanner.nextInt();
            Rodada rodadaUser_1 = new Rodada(nomes[escolhaRodada], elementos[escolhaRodada], vidas[escolhaRodada], forcas[escolhaRodada], defesas[escolhaRodada], velocidades[escolhaRodada], golpes[escolhaRodada], golpes[escolhaRodada+1], escolhaRodada);
            User_1[checaMostro] = rodadaUser_1;
        }while(checaMostro != 0);

        do{
            System.out.println("Usuario 2: Menu de Escolha!!!");
            System.out.println("1 - Ataque");
            System.out.println("2 - Troca");
            int escolhaRodada = scanner.nextInt();
            Rodada rodadaUser_2 = new Rodada(nomes[escolhaRodada], elementos[escolhaRodada], vidas[escolhaRodada], forcas[escolhaRodada], defesas[escolhaRodada], velocidades[escolhaRodada], golpes[escolhaRodada], golpes[escolhaRodada+1], escolhaRodada);
            User_2[checaMostro] = rodadaUser_2;
        }while(checaMostro != 0);
        scanner.close();


        int rodadaUser_1 = 0;
        int rodadaUser_2 = 0;
        System.out.println("User 1 escolheu: " + User_1[rodadaUser_1].toString());

        System.out.println("User 2 escolheu: " + User_2[rodadaUser_2].toString());

        if(rodadaUser_1 == 1 && rodadaUser_2 == 1){
            
        }
    }
}