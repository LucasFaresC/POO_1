public class Calc{
	
	static Leitura l1 = new Leitura();
	
	public static void main(String arg[]){

		int opcao = 0;
		boolean vai = true;
		
		while(vai){
			System.out.println("\n\t=============================");
			System.out.println("\t\t Calculadora");
			System.out.println("\t=============================\n");
		
			int a = Integer.parseInt(l1.entDados("1º Valor: "));
			int b = Integer.parseInt(l1.entDados("2º Valor: "));
		
			System.out.println("\n  1) Somar");		
			System.out.println("  2) Subtrair");		
			System.out.println("  3) Multiplicar");		
			System.out.println("  4) Dividir");		
			System.out.println("  5) Sair");		
			try{
				opcao = Integer.parseInt(l1.entDados("\n Escolha uma opção: "));
			}
			catch(NumberFormatException nfe){
				l1.entDados("\n A opção deve ser um int");
				continue;
			}
			switch(opcao){
				case 1:{
						somar(a,b);
						break;
				}
				case 2:{
						subtrair(a,b);
						break;
				}
				case 3:{
						multiplicar(a,b);
						break;
				}
				case 4:{
						dividir(a,b);
						break;
				}
				case 5:{
						sair();
						break;
				}
				default:{
					l1.entDados("Escolha uma opção entre 1 e 5 - Press key to continue...");
					continue;
				}
			}// fim do suitch/case
		} // fim do while
	} //fim do main()
	
	public static void somar(int x, int y){
		System.out.println("\n A soma é: "+(x+y));
	} 
	public static void subtrair(int x, int y){
		System.out.println("\n A diferença é: "+(x-y));
	} 
	public static void multiplicar(int x, int y){
		System.out.println("\n A multiplicação é: "+(x*y));
	}
	public static void dividir(int x, int y){
		try{
			System.out.println("\n A multiplicação é: "+(x/y));
		}
		catch(ArithmeticException ae){
			l1.entDados("\n Não existe divisão por zero");
		}
	} 

	public static void sair(){
		System.exit(0);
	}	
	
} //fim da classe