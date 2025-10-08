// Lucas Fares Correa Auad Pereira

import java.time.LocalDate;

public class Filme {
    private int id;
    private String nome;
    private String sinopse;
    private String diretor;
    private int duracaoMin;
    private boolean legendado;
    private boolean dublado;
    private boolean emExibicao;
    private LocalDate estreia;
    private LocalDate fimExibicoes;

    public Filme() {
        // Construtor default
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }

    public boolean isLegendado() {
        return legendado;
    }

    public void setLegendado(boolean legendado) {
        this.legendado = legendado;
    }

    public boolean isDublado() {
        return dublado;
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }

    public boolean isEmExibicao() {
        return emExibicao;
    }

    public void setEmExibicao(boolean emExibicao) {
        this.emExibicao = emExibicao;
    }

    public LocalDate getEstreia() {
        return estreia;
    }

    public void setEstreia(LocalDate estreia) {
        this.estreia = estreia;
    }

    public LocalDate getFimExibicoes() {
        return fimExibicoes;
    }

    public void setFimExibicoes(LocalDate fimExibicoes) {
        this.fimExibicoes = fimExibicoes;
    }
}