//public abstract class Pessoa{ //Classe Entidade

public class Pessoa{
	
	private int cpf;
	private String nome;
	private Endereco ender;
	
	//private final int x;// = 10;
	
	protected int id;
	
//========================================	
	public void impDados(){
		System.out.println("\nimpDados() da Classe-Mãe Pessoa");		
	}
//========================================	


	
	public Pessoa(){
		System.out.println("\nConstrutor Default - Super\n");
		cpf = 0;
		nome = "";
		ender = new Endereco();
		id = 0;
		//x = 34;
	}
	
	//Sobrecarga
	public Pessoa(int cpf, String nome, Endereco ender, int id){
		System.out.println("\nConstrutor Sobrec - 1 \n");		
		this.cpf = cpf;
		this.nome = nome;
		this.ender = ender;
		this.id  = id;
		
		//this.ender.setRua(rua);		
		//this.ender.setNum(num); 	
	}
	
//========================================


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
	public int getId(){
		return id;		
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
	
	public void setId(int id){
		this.id = id;		
	}
	
	public void setNome(String nome){
		this.nome = nome;		
	}
}