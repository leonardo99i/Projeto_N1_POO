package projeto;

public class Monstros {
    private String nomeMonstro;
    private String tipoElemento;
    private int vida;
    private int forca;
    private int defesa;
    private int velocidade;
    private Golpes golpe_1;
    private Golpes golpe_2;

    public Monstros(String nomeMonstro, String tipoElemento, int vida, int forca, int defesa, int velocidade, Golpes golpe_1, Golpes golpe_2){
        this.nomeMonstro = nomeMonstro;
        this.tipoElemento = tipoElemento;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.golpe_1 = golpe_1;
        this.golpe_2 = golpe_2;
    }

    public Monstros(String string, String string2, int i, int j, int k, int l, Golpes[] golpes) {

    }

    boolean estaVivo(){
        if(this.vida <= 0){
            this.vida = 0;
            return false;
        }
        return true;
    }

    public void perderVida(int poderDoGolpe){
        this.vida = this.vida + this.defesa - poderDoGolpe;
    }

    @Override
    public String toString() {
        return "Monstro{" +
                "nomeMonstro='" + nomeMonstro + "\n" +
                ", tipoElemento='" + tipoElemento + "\n" +
                ", vida=" + vida +
                ", forca=" + forca +
                ", defesa=" + defesa +
                ", velocidade=" + velocidade + golpe_1.toString() + golpe_2.toString() +
                '}';
    } 
}