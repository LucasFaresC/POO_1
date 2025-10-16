import java.util.List;
import java.util.ArrayList;

public class TstCol{

	private static Leitura l = new Leitura();
	
	private static Pessoa p1 = new Pessoa();
	
	private static List<Pessoa> bdPes = new ArrayList<Pessoa>();
	
	public static void main(String arg[]){
		
		System.out.println("\nTAMANHO DO VETOR PRÉ INSERÇÃO: " + bdPes.size());
		boolean vai = true;
		
		while(vai){
			
			p1 = new Pessoa();
			
			p1.setCpf(Integer.parseInt(l.entDados("\nCPF...: ")));
			p1.setNome(l.entDados("NOME..: "));
		
			bdPes.add(p1); // adiciona um objeto Pessoa no array
		
			System.out.println("\nTAMANHO DO VETOR PÓS INSERÇÃO: " + bdPes.size());
			
			String resp = l.entDados("\n\t Deseja continuar? <s/n>");
			
			//if(resp == "n" || resp == "N"){ //ERRO: para se comparar objetos se usa "equals" e não "=="
			//if(resp.equals("n") || resp.equals("N")){	
			if(resp.equalsIgnoreCase("n")){				
				vai = false;
				//System.exit(0);
				//break; //continue;
			}
		}//fim do while
		/*
		for(int i = 0; i < bdPes.size(); i++){
			System.out.println(
				"CPF.: " + bdPes.get(i).getCpf()
				+ " - NOME.: "+bdPes.get(i).getNome()
				+ " - ÍNDICE.: " + i 
			);
			
		}
		*/

		for(Pessoa p : bdPes){ //for each
			System.out.println(
				"CPF.: " + p.getCpf()
				+ " - NOME.: "+p.getNome()
				
				//+ " - ÍNDICE.: " + i 
			);
		}

		
		//int cpf_Err = Integer.parseInt(l.entDados("\nCPF CONSULTADO: "));// o uso do cpf_Err fugiu da O.O
		
		Pessoa p2 = new Pessoa();
		p2.setCpf(Integer.parseInt(l.entDados("\nCPF CONSULTADO: ")));
		
		for(int i = 0; i < bdPes.size(); i++){
			if(p2.getCpf() == bdPes.get(i).getCpf()){
				System.out.println(
					"CPF.: " + bdPes.get(i).getCpf()
					+ " - NOME.: "+bdPes.get(i).getNome()
					+ " - ÍNDICE.: " + i 
				);
			}
			
		}

		
		
	} //fim do main

}//fim da classe
