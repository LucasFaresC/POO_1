
public class Computador{ // A classe tem que ter o mesmo nome do programa 

    private PlacaDeVideo placa_video;
    private int armazentamento_tb;
    private int memoria_gb;

    public Computador(){ 

        /*metodo Construtor : 
        independente do que colocar, vai criar o objeto
        aqui, instanciamos as variaveis
        */ 
        
        placa_video = new PlacaDeVideo();
        armazentamento_tb = 3;
        memoria_gb = 16;
    }

    // Sobrecarga
        public Computador(PlacaDeVideo placa, int memoria, int armazentamento){
        this.memoria_gb = memoria;
        this.armazentamento_tb = armazentamento;
        this.placa_video = placa;
    }

    public PlacaDeVideo getPlacaDeVideo(){ // metodo getter retorna
        return placa_video;
    }

    public void setPlacaDeVideo(PlacaDeVideo placa_video  ){ // setter não retorna
        this.placa_video = placa_video;
    }

    public int getMemoria(){
        return memoria_gb;
    }

    public int getArmazenamento(){
        return armazentamento_tb;
    }

    public void setMemoria(int memoria_gb){
        this.memoria_gb = memoria_gb;
    }

    public void setArmazenamento(int armazentamento_tb){
        this.armazentamento_tb = armazentamento_tb;
    }

}   