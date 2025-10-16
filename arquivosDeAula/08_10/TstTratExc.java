public class TstTratExc{

	public static void main(String arg[]){
	
		Leitura l1 = new Leitura();
		Pessoa p1 = new Pessoa();
		//boolean vai = true;
	
	//while(vai){	
		
		try{		
			p1.setCpf(Integer.parseInt(l1.entDados("\nCPF..: ")));
			//vai = false;
		}
		
		catch(CpfPeqException cpe){
			cpe.impErrCpfPeq();
			
			p1 = cpe.consertCpfPeq(p1);
		}
		
		catch(CpfGrdException cge){
			cge.impErrCpfGrd();
		}
		catch(NumberFormatException nfe){
			System.out.println("\nO valor do CPF deve ser um inteiro");
		}
		finally{
			System.out.println("\nCPF...: " + p1.getCpf());
		}
	//} //fim do while

	}
}
