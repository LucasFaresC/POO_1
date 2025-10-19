// Lucas Fares Correa Auad Pereira

import java.time.LocalDate;

public class Filme {
    private int id;
    private String nome;
    private String sinopse;
    private String diretor;
    private String genero;
    private int duracaoMin;
    private boolean legendado;
    private boolean dublado;
    private LocalDate estreia;
    private LocalDate fimExibicoes;

    public Filme() {
        // Construtor default
    }

    // Sobrecarga
    public Filme(int i, String n, String s, String d, boolean leg, boolean dub, boolean ex, LocalDate estr, LocalDate fimex){
        this.id = i;
        this.sinopse = s;
        this.nome = n;
        this.diretor = d;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public void setGenero(String s){
        this.genero = s;
    }

    public String getGenero(){
        return genero;
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


    // Sobrescrita
    public String toString() {
        return "\nID: "+ id +"\nTitulo: "+nome+ "\nSinopse: " + sinopse + "\nDuração: "+ duracaoMin + " min" +"\nGenero: "+genero+"\n";
    }
}