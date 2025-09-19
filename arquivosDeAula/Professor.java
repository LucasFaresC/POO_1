public class Professor extends Pessoa{
    String titulo = "";
    int salario = 8000;

    public void setSalario(int sal){
        this.salario = sal;
    }

    public int getSalario(){
        return salario;
    }

    public void setTitulo(String tit){
        this.titulo = tit;
    }

    public String getTitulo(){
        return titulo;
    }

}