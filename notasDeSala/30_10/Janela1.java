import java.awt.FlowLayout;
import java.awt.event.ActionListener; //Interface
import java.awt.event.ActionEvent;

import javax.swing.*;


public class Janela1 implements ActionListener{
	
	private static JFrame jan1 = new JFrame("Inical");
	private static JLabel rtCpf = new JLabel("CPF");
	private static JTextField cxCpf = new JTextField(15);
	
	private static JButton btLimpar = new JButton("Limpar");
	private static JButton btSair = new JButton("Sair");
	private static JButton btSomar = new JButton("+");		
	
	private static Janela1 jn1 = new Janela1();
	
	
	public static void main(String arg[]){
		criaJan();		
	}
	
	public static void criaJan(){
		
		jan1.setDefaultCloseOperation(jan1.EXIT_ON_CLOSE);
		//jan1.setDefaultCloseOperation(jan1.DISPOSE_ON_CLOSE);
		//jan1.setDefaultCloseOperation(jan1.HIDE_ON_CLOSE);
		//jan1.setDefaultCloseOperation(jan1.DO_NOTHING_ON_CLOSE);

		int larg = 500, alt = 300;
		jan1.setSize(larg, alt);
		
		jan1.add(rtCpf);
		jan1.add(cxCpf);
		jan1.add(btLimpar);
		jan1.add(btSair);
		jan1.add(btSomar);
		
		btLimpar.addActionListener(jn1);
		btSair.addActionListener(jn1);
		btSomar.addActionListener(jn1);
		
		jan1.setLayout(new FlowLayout());
		
		jan1.setVisible(true);
		
	}// fim do main
	
	public void actionPerformed(ActionEvent evt){
		
		if(evt.getSource().equals(btLimpar)){
			limpar();
		}
		if(evt.getSource().equals(btSair)){
			sair();
		}
		
		if(evt.getSource().equals(btSomar)){
			somar();
		}
	} //Fim do actionPerformed
	
	public void limpar(){
		cxCpf.setText("");
		cxCpf.requestFocus(); //posiciona o curso
	}
	public void sair(){
		int resp = JOptionPane.showConfirmDialog(
			null,
			"Deseja realmente sair?",
			"Saida",
			JOptionPane.YES_NO_OPTION
		);
		if(resp == 0){
			jan1.dispose();
		}
	}
	
	public void somar(){
		int a = 0, b = 0;
		try{
			a = Integer.parseInt(cxCpf.getText());
			b = Integer.parseInt(cxCpf.getText());
		}catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(
				null,
				"O Valor deve ser um inteiro",
				"Valor errado",
				JOptionPane.ERROR_MESSAGE
			);

		}
		int c = a+b;
		cxCpf.setText(Integer.toString(c));
	}
	
}
