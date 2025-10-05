// Lucas Fares Corrêa Auad Pereira

public final class Carga extends Veiculo implements Calc {
    private int tara;
    private int cargaMax;
    
    public Carga() {
        super();
    }
    
    public int getTara() {
        return tara;
    }
    
    public void setTara(int tara) {
        this.tara = tara;
    }
    
    public int getCargaMax() {
        return cargaMax;
    }
    
    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }
    
    //Sobrescrita
    public int calcVel() {
        return getVelocMax() * 100000; // Converte km/h para cm/h (centímetros por hora)
    }
    
    //Sobrescrita
    public int calcular() {
        // Soma de todos os valores numéricos
        int soma = 0;
        soma = getQtdRodas() + getVelocMax() + getMotor().getPotencia() + getMotor().getQtdPist() + this.tara + this.cargaMax;
        return soma;
    }
}