// Lucas Fares Corrêa Auad Pereira
public abstract class Veiculo {
    private String placa;
    private String marca;
    private String dataCadastro;
    private String modelo;
    private String cor;
    private int qtdRodas;
    private int velocMax;
    private Motor motor;
    
    public Veiculo() {
        this.motor = new Motor();
        this.dataCadastro = "";
    }
    
    // Getters e Setters
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public int getQtdRodas() {
        return qtdRodas;
    }
    
    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }
    
    public int getVelocMax() {
        return velocMax;
    }
    
    public void setVelocMax(int velocMax) {
        if (velocMax < 10 || velocMax > 250) {

            System.out.println("A velocidade está fora dos limites brasileiros");
            this.velocMax = 100;
        
        }else{
            this.velocMax = velocMax;
        }
    }
    
    public Motor getMotor() {
        return motor;
    }
    
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public String getDataCadastro() {
        return dataCadastro;
    }
    
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    public abstract int calcVel();
}