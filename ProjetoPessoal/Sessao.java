// Lucas Fares Correa Auad Pereira
// RA: 2706652

import java.time.LocalDate;
import java.time.LocalTime;

public class Sessao {

    private int id;
    private Filme filme;
    private boolean cheio;
    private boolean poltronasOcupadas[][];
    private LocalDate data;
    private LocalTime hora;

    public Sessao(){}// construtor default

    // Sobrecarga
    public Sessao(int i, Filme f, boolean c, LocalDate d, LocalTime h){
        this.id = i;
        this.filme = f;
        this.cheio = c;
        this.data = d;
        this.hora = h;
    }
    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public boolean isCheio() {
        return cheio;
    }

    public void setCheio(boolean cheio) {
        this.cheio = cheio;
    }

    public boolean[][] getPoltronasOcupadas() {
        return poltronasOcupadas;
    }

    public void setPoltronasOcupadas(boolean[][] poltronasOcupadas) {
        this.poltronasOcupadas = poltronasOcupadas;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    //Sobrescrita
    public String toString() {
        return "Sessao ID: " + id + " - " + filme.getNome() + " - " + data + " " + hora;
    }


    // Método para verificar se uma poltrona está livre
    public boolean poltronaLivre(int fileira, int poltrona) {
        if (fileira >= 0 && fileira < poltronasOcupadas.length && 
            poltrona >= 0 && poltrona < poltronasOcupadas[fileira].length) {
            return !poltronasOcupadas[fileira][poltrona];
        }
        return false;
    }

    // Método adicional para ocupar uma poltrona
    public boolean ocuparPoltrona(int fileira, int poltrona) {
        if (poltronaLivre(fileira, poltrona)) {
            poltronasOcupadas[fileira][poltrona] = true;
            
            // Verificar se a sessão está cheia
            verificarSeEstaCheio();
            return true;
        }
        return false;
    }


    // Método privado para verificar se todas as poltronas estão ocupadas
    private void verificarSeEstaCheio() {
        for (int i = 0; i < poltronasOcupadas.length; i++) {
            for (int j = 0; j < poltronasOcupadas[i].length; j++) {
                if (!poltronasOcupadas[i][j]) {
                    cheio = false;
                    return;
                }
            }
        }
        cheio = true;
    }
}