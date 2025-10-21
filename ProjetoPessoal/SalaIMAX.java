// Lucas Fares Corrêa Auad Pereira
// RA: 2706652

public class SalaIMAX extends Sala implements Calc{
    private boolean poltronaPremium;
    private float taxaAdicional = 32.50f;
    public SalaIMAX(){} // constructor default

    //Sobrecarga
    public SalaIMAX(boolean pol_pre, float tax_add) {
        this.poltronaPremium = pol_pre;
        this.taxaAdicional = tax_add;
    }
    
    // Getters e Setters
    public boolean getPoltronaPremium() {
        return poltronaPremium;
    }

    public void setPoltronaPremium(boolean poltronaPremium) {
        this.poltronaPremium = poltronaPremium;
    }

    public float getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(float taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }

    //Sobrescrita
    public String toString() {
        String info = poltronaPremium == true ? "\nCom Poltronas Premium instaladas" : "";
        return "Sala IMAX - ID: " + getId() + " - Taxa Adicional: R$" + taxaAdicional + info;
    }

    //Sobrecarga
    public float calcularPreco(float preco) {
        return preco + taxaAdicional;
    }

}