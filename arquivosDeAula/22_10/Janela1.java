import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Janela1{
	
	private static JFrame jan1 = new JFrame("Inical");
	
	public static void main(String arg[]){
		criaJan();		
	}
	
	public static void criaJan(){
		
		int larg = 500, alt = 300;
		jan1.setSize(larg, alt);
		
		jan1.setVisible(true);
		
	}
	
}