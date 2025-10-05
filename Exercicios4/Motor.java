// Lucas Fares Corrêa Auad Pereira 

public class Motor {
    private int qtdPist;
    private int potencia;
    
    // Construtor default
    public Motor() {
        this.qtdPist = 0;
        this.potencia = 0;
    }
    
    // Getters e Setters
    public int getQtdPist() {
        return qtdPist;
    }
    
    public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }
    
    public int getPotencia() {
        return potencia;
    }
    
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}