public class Pessoa{
	
	private int cpf;
	private String nome;

	public Pessoa(){ 
		cpf = 0;
		nome = "";
	}
		
	public int getCpf(){
		return cpf;		
	}
	
	public String getNome(){
		return nome;		
	}
	
	public void setCpf(int cpf){
		this.cpf = cpf;
	}
	
	public void setNome(String nome){
		this.nome = nome;		
	}
}