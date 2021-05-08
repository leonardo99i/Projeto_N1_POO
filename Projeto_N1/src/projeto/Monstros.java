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

    public String getNomeMonstro() {
        return nomeMonstro;
    }

    public void setNomeMonstro(String nomeMonstro) {
        this.nomeMonstro = nomeMonstro;
    }

    public String getTipoElemento() {
        return tipoElemento;
    }

    public void setTipoElemento(String tipoElemento) {
        this.tipoElemento = tipoElemento;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Golpes getGolpe_1() {
        return golpe_1;
    }

    public void setGolpe_1(Golpes golpe_1) {
        this.golpe_1 = golpe_1;
    }

    public Golpes getGolpe_2() {
        return golpe_2;
    }

    public void setGolpe_2(Golpes golpe_2) {
        this.golpe_2 = golpe_2;
    }

    boolean estaVivo(){
        if(this.vida <= 0){
            this.vida = 0;
            return false;
        }
        return true;
    }
    
    public int getGolpe(int numeroGolpe){
        if(numeroGolpe == 1){
            return golpe_1.getPoder();
        }else if(numeroGolpe == 2){
            return golpe_2.getPoder();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Monstro " + nomeMonstro + ", elemento = " + tipoElemento + ", vida = " + vida + ", força = " + forca
                + ", defesa = " + defesa + ", velocidade = " + velocidade + ", primeiro golpe = " + golpe_1
                + ", segundo golpe = " + golpe_2;
    }   
}