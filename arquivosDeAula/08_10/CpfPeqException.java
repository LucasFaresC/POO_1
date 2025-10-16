public class CpfPeqException extends Exception{

	Leitura l1 = new Leitura();

	public void impErrCpfPeq(){
		System.out.println("\n O CPF deve ser um inteiro positivo");
	}
	
	public Pessoa consertCpfPeq(Pessoa p){
		
		try{		
			p.setCpf(Integer.parseInt(l1.entDados("\nNOVO CPF..: ")));
		}
		
		catch(CpfPeqException cpe){
			impErrCpfPeq();
			p = consertCpfPeq(p);
		}
		
		catch(CpfGrdException cge){
			cge.impErrCpfGrd();
		}
		catch(NumberFormatException nfe){
			System.out.println("\nO valor do CPF deve ser um inteiro");
		}
		
		return p;
	}
	

}