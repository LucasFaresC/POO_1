// Lucas Fares Correa Auad Pereira
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Ingresso {
    private int id;
    private Sessao sessao;
    private Cliente cliente;
    private int fileira;
    private int poltrona;
    private float precoCompra;
    private boolean meia;
    private LocalDateTime dataHoraCompra;

    public Ingresso() {
        // Construtor default
    }

    // FAZER SOBRECARGA

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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