public class Pessoa{ 

	private int cpf;
	private String nome;
	
	public int getCpf(){
		return cpf;		
	}
	public String getNome()throws NomeParException{
		if(nome.length()%2 != 0){
			throw new NomeParException();
		}else{
			return nome;
		}
	}
//===================================
// THROWS (com "S"): "AVISO"--> POSSO lancar um objeto do tipo tal
// THROW (sem "S"): "ORDEM" --> LANCE o objeto do tipo tal
	
	public void setCpf(int cpf) throws CpfPeqException{
		if(cpf>0){
			this.cpf = cpf;		
		}
		else{
			throw new CpfPeqException();
		}
	}
	
	
	public void setNome(String nome) throws NomeGrdException{
		if(nome.length() > 10){
			throw new NomeGrdException();
		}else{
			this.nome = nome;		

		}
	}
}