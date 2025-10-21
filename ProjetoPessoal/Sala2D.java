// Lucas Fares Corrêa Auad Pereira
// RA: 2706652

public class Sala2D extends Sala implements Calc{
    private boolean acessibilidadeSurdo;
    private boolean acessibilidadeCego;
    
    public Sala2D(){}// construtor default

    // Sobrecarga
    public Sala2D(boolean acess_surdo, boolean acess_cego) {
        this.acessibilidadeSurdo = acess_surdo;
        this.acessibilidadeCego = acess_cego;
    }

    // Getters e Setters
    public boolean isAcessibilidadeSurdo() {
        return acessibilidadeSurdo;
    }

    public void setAcessibilidadeSurdo(boolean acessibilidadeSurdo) {
        this.acessibilidadeSurdo = acessibilidadeSurdo;
    }

    public boolean isAcessibilidadeCego() {
        return acessibilidadeCego;
    }

    public void setAcessibilidadeCego(boolean acessibilidadeCego) {
        this.acessibilidadeCego = acessibilidadeCego;
    }

    //Sobrescrita
    public String toString() {
        return "Sala 2D - ID: " + getId() + " - Capacidade: " + getFileiras()*getPoltronas() + " " + getInfoAcessibilidade(true);
    }

    //Sobrecarga
    public String getInfoAcessibilidade() {
        String resposta_surdo = acessibilidadeSurdo ? "Habilitada" : "Desabilitada";
        String resposta_cego = acessibilidadeSurdo ? "Habilitada" : "Desabilitada";
        return "Acessibilidade Surdo: " + resposta_surdo + ", Acessibilidade Cego: " + resposta_cego;
    }

    //Sobrecarga
    public String getInfoAcessibilidade(boolean detalhado) {
        if (detalhado) {
            String info = "";
            if (acessibilidadeSurdo) info += "Possui audiodescrição; ";
            if (acessibilidadeCego) info += "Possui sistema para deficientes visuais; ";
            return info.isEmpty() ? "Sem acessibilidade especial" : info;
        }
        return getInfoAcessibilidade();
    }

    public float calcularPreco(float precoBase){
        return precoBase;
    }
}