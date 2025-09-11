public class TstPes{

	public static void main(String arg[]){//classLoader
		

		Leitura l1 = new Leitura();
		Pessoa p1 = new Pessoa();
		//Endereco e1 = new Endereco(); //ERRO
		
		//e1.setRua("das Flores");//ERRO
		//e1.setNum(15);//ERRO
	

		p1.setCpf(Integer.parseInt(l1.entDados("Cpf:")));
		p1.setNome(l1.entDados("NOME"));
		p1.getEnder().setRua("das Pedras"); //Reflexidade
		p1.getEnder().setNum(115); //Reflexidade
	
		System.out.println("\nCPF: "+p1.getCpf());
		System.out.println("NOME: "+p1.getNome());
		System.out.println("\nRUA_R: "+p1.getEnder().getRua()); //Reflexidade
		System.out.println("NUMERO_R: "+p1.getEnder().getNum());//Reflexidade
		
		//System.out.println("\nRUA: "+e1.getRua());//ERRO
		//System.out.println("\nNUMERO: "+e1.getNum());//ERRO
		
		
	}
}
//p1.cpf = -15; //ERRO
		//p1.nome = "Errado"; //ERRO
		//System.out.println("\nCPF_X: "+p1.cpf); //ERRO
		//System.out.println("\nNOME_X: "+p1.nome);	//ERRO