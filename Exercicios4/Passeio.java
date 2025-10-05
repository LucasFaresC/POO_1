// Lucas Fares Corrêa Auad Pereira
    
public final class Passeio extends Veiculo implements Calc {

    private int qtdePassageiro;
    
    public Passeio() {
        super();
    }
    
    public int getQtdePassageiro() {
        return qtdePassageiro;
    }
    
    public void setQtdePassageiro(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }
    
    //Sobrescrita
    public int calcVel() {
        return getVelocMax() * 1000; // Converte km/h para m/h (metros por hora)
    }
    
    //Sobrescrita
    public int calcular() {
        // Soma das quantidades de letras em todos os atributos String
        int soma = getPlaca().length() + getMarca().length() + getDataCadastro().length() + getModelo().length() + getCor().length();
        return soma;
    }
}