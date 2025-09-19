public class Aluno extends Pessoa{ //Classe Entidade

	private int ra;
	private String curso;

	public void impDados(){
		System.out.println("OIIIIII");
	}
	
	public Aluno(){
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