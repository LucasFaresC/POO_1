public class TstTratExc{

	public static void main(String arg[]){//classLoader
	
		Leitura l1 = new Leitura();
		Pessoa p1 = new Pessoa();

		try{		
			p1.setCpf(Integer.parseInt(l1.entDados("\nCPF..: ")));

		}catch(CpfPeqException cpe){
			System.out.println("\nEntrou no CATCH de CpfPeqException");
		
		}finally{
			System.out.println("passamos pelo finally, top");
		}
		
		try {
			p1.setNome(l1.entDados("NOME..: "));
			
		} catch (NomeGrdException nge){
			
			System.out.println("\nCPF...: " + p1.getCpf());
			
		}finally{
			System.out.println("passamos pelo finally, top");
			
		}
	}	
}
/*
TRY --> Tente executar tal método
CATCH --> Captura um objeto lançado por try
*/