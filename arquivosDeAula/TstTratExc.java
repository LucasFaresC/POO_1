import java.io.IOException;

public class TstTratExc{

	public static void main(String arg[])throws CpfPeqException, CpfGrdException,NumberFormatException, IOException{//classLoader
	
		Leitura l1 = new Leitura();
		Pessoa p1 = new Pessoa();
		
		
//try{		
	p1.setCpf(Integer.parseInt(l1.entDados("\nCPF..: ")));
//}

/* MultiCatching
catch(CpfPeqException | CpfGrdException | NumberFormatException objGeral){ 
	System.out.println("\nAcessou no MultCathing");
	String nomeclasse = objGeral.getClass().getName(); //Reflex. nativa
	System.out.println("\nO Objeto é do tipo: "+nomeclasse);	
}


catch(CpfPeqException cpe){
		System.out.println("\nEntrou no CATCH de CpfPeqException");
}
catch(CpfGrdException cpe){
		System.out.println("\nEntrou no CATCH de CpfGrdException");
}
catch(NumberFormatException nfe){
		System.out.println("\nO valor do CPF deve ser um inteiro");
}
catch(IOException ioe){
    System.out.println("\nERRO: JVM - RAM");
}

finally{
		System.out.println("\nEntrou no FINALLY");	
}

*/


System.out.println("\nCPF...: " + p1.getCpf());
				
	
	}
}
/*
TRY --> Tente executar tal método
CATCH --> Captura um objeto lançado por try
FINALLY --> Será independente de lançar ou não uma exceção
*/