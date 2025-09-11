
public class PlacaDeVideo { // classe entidade
    
    private int serie; // privado só pode modificar por metodo da classe
    private String familia = "";

    public String getFamilia(){
        return familia;
    }

    public void setFamilia(String fam ){
        this.familia = fam;
    }

    public int getSerie(){
        return serie;
    }

    public void setSerie(int ser){
        this.serie = ser;
    }

}
