public class Aula4{
	public static void main(String arg[]){
		int x = Integer.parseInt(arg[0]);// transformando o tipo alvo em int
		int y = Integer.parseInt(arg[1]);
		
		subVal(x, y);
		multiVal(x, y);
        diviVal(x , y);

	}
	public static void subVal(int x, int y){
		System.out.println("x-y = " + (x - y));

	}
	public static void multiVal(int x, int y){
		System.out.println("xy = " + (x*y));

	}
	public static void diviVal(int x, int y){
		System.out.println("x÷y = " +(x/y));
	}  
}
