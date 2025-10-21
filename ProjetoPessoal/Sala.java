// Lucas Fares Correa Auad Pereira
// RA: 2706652

import java.util.ArrayList;
import java.util.List;


public abstract class Sala{
    private int id;
    private int poltronasCadeirantes;
    private int fileiras = 4;
    private int poltronas = 4;
    private int quantidadeSessoes = 4;
    private List<Sessao> sessoes = new ArrayList<Sessao>();
    private int sessaoAtual = 0;
    private float precoBase = 14.50f;

    
    public Sala(){}// contrutor default
        

    // Sobrecarga
    public Sala(int i, int pol_cade, int fil, int pol ,int qtd_sessoes, int ses_atual) {
        this.id = i;
        this.poltronasCadeirantes = pol_cade;
        this.fileiras = fil;
        this.poltronas = pol;
        this.quantidadeSessoes = qtd_sessoes;
        this.sessaoAtual = ses_atual;
    }

    public void avancarSessao(){ 
        if(sessaoAtual < 4){
            this.sessaoAtual += 1;
        }else{
            System.out.print("Sessão invalida");
        }
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getPoltronasCadeirantes() {
        return poltronasCadeirantes;
    }

    public void setPoltronasCadeirantes(int poltronasCadeirantes) {
        this.poltronasCadeirantes = poltronasCadeirantes;
    }

    public int getFileiras() {
        return fileiras;
    }

    public void setFileiras(int fileiras) {
        this.fileiras = fileiras;
    }

    public int getPoltronas() {
        return poltronas;
    }

    public void setPoltronas(int poltronas) {
        this.poltronas = poltronas;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> s) {
        this.sessoes = s;
    }

    public void setPrecoBase(float p){
        this.precoBase = p;
    }

    public float getPrecoBase(){
        return precoBase;
    }
}