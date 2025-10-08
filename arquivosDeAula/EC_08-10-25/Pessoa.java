public class Pessoa{ 

	private int cpf;
	private String nome;
	
	public int getCpf(){
		return cpf;		
	}
	public String getNome(){
		return nome;		
	}
//===================================
// THROWS (com "S"): "AVISO"--> POSSO lancar um objeto do tipo tal
// THROW (sem "S"): "ORDEM" --> LANCE o objeto do tipo tal

// PADRÃO DE PROJETO DE SOFTWARE: FACTORY
	
	public void setCpf(int cpf) throws CpfPeqException, CpfGrdException{
		if(cpf>0){
			if(cpf <=100){
				this.cpf = cpf;		
			}
			else{
				throw new CpfGrdException();
			}
		}
		else{
			throw new CpfPeqException();
		}
	}
	
	
	public void setNome(String nome){
		this.nome = nome;		
	}
}