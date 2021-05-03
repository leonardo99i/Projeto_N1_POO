package projeto;

public class Rodada extends Monstros{

    private int escolhaRodada;

    public Rodada(String nomeMonstro, String tipoElemento, int vida, int forca, int defesa, int velocidade, Golpes golpe_1, Golpes golpe_2, int escolhaRodada) {
        super(nomeMonstro, tipoElemento, vida, forca, defesa, velocidade, golpe_1, golpe_2);
        this.escolhaRodada = escolhaRodada;
    }

    @Override
    public String toString() {
        return "Rodada [escolhaRodada=" + escolhaRodada + "]";
    }
}
