public class Pessoa{ //Classe Entidade

	private int cpf;
	private String nome;
	private Endereco ender;
	
//========================================		
	public Pessoa(){
		System.out.println("\nConstrutor Default\n");
		cpf = 0;
		nome = "";
		ender = new Endereco();
	}
	
	//Sobrecarga
	public Pessoa(int cpf, String nome, Endereco ender){
		System.out.println("\nConstrutor Sobrec - 1 \n");		
		this.cpf = cpf;
		this.nome = nome;
		this.ender = ender;
		//this.ender.setRua(rua);		
		//this.ender.setNum(num); 	
	}
	
	//Sobrecarga
	public Pessoa(String n, int c, Endereco e){
		System.out.println("\nConstrutor Sobrec - 2 \n");		
		this.cpf = c;
		this.nome = n;
		this.ender = e;
	}	
	
//========================================

	public void impDados(){
		System.out.println("\nimpDados() Default\n");		
	}
	
	public int impDados(int x){
		System.out.println("\nimpDados Sobrec - 1 \n "+ x);		
		return 0;
	}
	
//========================================
	public Endereco getEnder(){
		return ender;		
	}
	
	public void setEnder(Endereco ender){
		this.ender = ender;	
	}
	
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