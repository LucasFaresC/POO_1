import java.util.List;
import java.util.ArrayList;

public class TstCol{

	private static Leitura l = new Leitura();
	
	private static Pessoa p1 = new Pessoa();
	
	private static List<Pessoa> bdPes = new ArrayList<Pessoa>();
	
	public static void main(String arg[]){
		
		System.out.println("\nTAMANHO DO VETOR PRÉ INSERÇÃO: " + bdPes.size());
		
		menu();

		int var;
		while (true){
			while(true){
				try{
					var = Integer.parseInt(l.entDados(">>> "));
					break;
				}catch (NumberFormatException nfe){
					System.out.print("Digite numeros por favor\n");
				}
			}

			if(var == 1){
				inserirPessoa();
			}else if(var == 2){
				consPessoa();
			}else if(var == 3){
				
			}else if(var == 4){
				
			}

		}
		


		impAllList();
		
		//int cpf_Err = Integer.parseInt(l.entDados("\nCPF CONSULTADO: "));// o uso do cpf_Err fugiu da O.O

		Pessoa p3 = new Pessoa();
		p3.setCpf(Integer.parseInt(l.entDados("\nCPF ATUALIZADO: ")));
		
		for(int i = 0; i < bdPes.size(); i++){
			if(p3.getCpf() == bdPes.get(i).getCpf()){
				p3 = bdPes.get(i);
				p3.setNome(l.entDados("\n NOVO NOME: "));
				
				bdPes.set(i, p3); // Atualização do array
			}
		}
		
		impAllList();
		
		Pessoa p4 = new Pessoa();
		p4.setCpf(Integer.parseInt(l.entDados("\nCPF DELETADO: ")));
		
		for(int i = 0; i < bdPes.size(); i++){
			if(p4.getCpf() == bdPes.get(i).getCpf()){
				bdPes.remove(i);
			}
		}		
		
		System.out.println("\nTAMANHO DO VETOR PÓS DELEÇÃO: " + bdPes.size());

		impAllList();		

	} //fim do main
	

	public static void impAllList(){
		
		for(Pessoa p : bdPes){ //for each
			System.out.println(
				"CPF.: " + p.getCpf()
				+ " - NOME.: "+p.getNome()
				
				//+ " - ÍNDICE.: " +  
			);
		}
	}

	public static void inserirPessoa(){
		boolean vai = true;
		
			
		p1 = new Pessoa();
		p1.setCpf(Integer.parseInt(l.entDados("\nCPF...: ")));
		p1.setNome(l.entDados("NOME..: "));
		
		bdPes.add(p1); // adiciona um objeto Pessoa no array
		
		System.out.println("\nTAMANHO DO VETOR PÓS INSERÇÃO: " + bdPes.size());
		

	}

	public static void consPessoa(){
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
	}


	public static void menu(){
		System.out.println("<<< Gestão de Pessoas >>>\n1) Inserir\n2) Consultar\n3) Alterar\n4) Deletar\n5) Imprimir Todos");
	}

}//fim da classe
