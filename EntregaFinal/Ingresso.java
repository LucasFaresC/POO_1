// Lucas Fares Correa Auad Pereira
// RA: 2706652

import java.time.LocalDateTime;

public class Ingresso {
    private int id;
    private Sessao sessao;
    private int fileira;
    private int poltrona;
    private float precoCompra;
    private boolean meia;
    private LocalDateTime dataHoraCompra;

    public Ingresso() {
        this.id = 0;
        this.sessao = null;
        this.fileira = 0;
        this.poltrona = 0;
        this.precoCompra = 0.0f;
        this.meia = false;
        this.dataHoraCompra = LocalDateTime.now();
    }
    
    //SOBRECARGA
    public Ingresso(int id, Sessao ses, int fil, int pol, float preCom, boolean meia, LocalDateTime dhc){
        this.id = id;
        this.sessao = ses;
        this.fileira = fil;
        this.poltrona = pol;
        this.precoCompra = preCom;
        this.meia = meia;
        this.dataHoraCompra = dhc;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public int getFileira() {
        return fileira;
    }

    public void setFileira(int fileira) {
        this.fileira = fileira;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public boolean isMeia() {
        return meia;
    }

    public void setMeia(boolean meia) {
        this.meia = meia;
    }

    public LocalDateTime getDataHoraCompra() {
        return dataHoraCompra;
    }

    public void setDataHoraCompra(LocalDateTime dataHoraCompra) {
        this.dataHoraCompra = dataHoraCompra;
    }
}