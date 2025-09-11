public class Pessoa{ //Classe Entidade

	private int cpf = 0;
	private String nome = "";
	
	private Endereco ender = new Endereco();
	
//========================================
	public Endereco getEnder(){
		return ender;		
	}
	
	public void setEnder(Endereco ender){
		this.ender = ender;	
	}
//========================================	
	
	public int getCpf(){
		return cpf;		
	}
	public String getNome(){
		return nome;		
	}
	
	public void setCpf(int cpf){
		if(cpf >= 0){
			this.cpf = cpf;		
		}
		else{
			System.out.println("\nCPF deve ser positivo");
		}
	}
	
	public void setNome(String nome){
		this.nome = nome;		
	}
}