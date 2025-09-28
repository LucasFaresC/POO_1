public class Aluno extends Pessoa implements Calculadora, Mostra{ //Classe Entidade

	private int ra;
	private String curso;
	
//========================================	
	//Sobrescrita
	public void impDados(){
		System.out.println("\nimpDados() da Classe-Filha Aluno");		
	}
	
	//Sobrescrita
	public void calcVal(){
		//valor = 13; //erro --> atributo de interface é "final"
		System.out.println("\n Valor da var valor: "+valor);	
	}
	
	//Sobrescrita
	public void printDados(){}
	
	public void mostraVal(){
		System.out.println("\n implem. do método mostraVal()"); 
		
	}
	

	
	public void acessaId(){
		id = 25;
		System.out.println("\nID em Em aluno - protected: "+ id);
		
	}
//========================================
	
	
	public Aluno(){
		//super(1, "Teste", new Endereco(), 16);
		ra = 0;
		curso = "";
		

	}
	
	public int getRa(){
		return ra;		
	}
	public String getCurso(){
		return curso;		
	}
	
	public void setRa(int ra){
		this.ra= ra;		
	}
	
	public void setCurso(String curso){
		this.curso = curso;		
	}
}