package projeto;

public class Golpes {
    private String nomeGolpe;
    private int poder;
    private String elemento;

    public Golpes(String nomeGolpe, int poder, String elemento){
        this.nomeGolpe = nomeGolpe;
        this.poder = poder;
        this.elemento = elemento;
    }

    @Override
    public String toString(){
        return "[" + nomeGolpe + ", elemento = " + elemento + ", poder = " + poder + "]";
    }
    
    public int getPoder(){
        return this.poder;
    }
}