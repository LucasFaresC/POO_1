public class TstPes{

	public static void main(String arg[]){//classLoader
	
		Leitura l1 = Leitura.geraLeitura();
		
		Pessoa p1 = new Pessoa();
		Aluno a1 = new Aluno();
		
		a1.setRa(115);//Aluno
		a1.setCurso("Eng. Comput."); //Aluno
		a1.setCpf(34); //Pessoa
		a1.setNome("Jose"); // Pessoa
				
		System.out.println("\nCPF: "+a1.getCpf());// Pessoa
		System.out.println("NOME: "+a1.getNome());//Pessoa		
		System.out.println("RA: "+a1.getRa());//Aluno		
		System.out.println("CURSO: "+a1.getCurso()); //Aluno

		
		a1.impDados();
		p1.impDados();



	
	}
}
