import javax.swing.JOptionPane;

public class CxDialogs{
	public static void main(String arg[]){
		
		JOptionPane.showMessageDialog(
			null, // Objeto de origem da chamada da caixa de diálogo
			"Cadastro de Pessoas",
			"Gestao de RH",
			//JOptionPane.INFORMATION_MESSAGE
			1
		);
		
		int x = Integer.parseInt(
			JOptionPane.showInputDialog(
				null,
				"Informe um numero: ",
				"Cadastro de Numeros",
				JOptionPane.QUESTION_MESSAGE
			)
		);
		
		String nome = JOptionPane.showInputDialog(
			null,
			"Informe um nome: ",
			"Cadastro de Pessoas",
			JOptionPane.QUESTION_MESSAGE
		);
		
		JOptionPane.showMessageDialog(
			null, // Objeto de origem da chamada da caixa de diálogo
			"O nome informado foi: \n" + nome + " - " +x,
			"Gestao de RH",
			JOptionPane.INFORMATION_MESSAGE
		);	

		int resp = JOptionPane.showConfirmDialog(
			null,
			"Confirma o nome?",
			"Cofirmação",
			JOptionPane.YES_NO_CANCEL_OPTION
		);
		
		if(resp == 0){
			JOptionPane.showMessageDialog(
				null, // Objeto de origem da chamada da caixa de diálogo
				"Confirmou o nome: " +nome,
				"Gestao de RH",
				JOptionPane.INFORMATION_MESSAGE
			);	
		}
		
		else if(resp == 1){
			JOptionPane.showMessageDialog(
				null, // Objeto de origem da chamada da caixa de diálogo
				"NÃO Confirmou o nome",
				"Gestao de RH",
				JOptionPane.INFORMATION_MESSAGE
			);		
		}
		else{
			JOptionPane.showMessageDialog(
				null, // Objeto de origem da chamada da caixa de diálogo
				"CANCELOU a operação",
				"Gestao de RH",
				JOptionPane.INFORMATION_MESSAGE
			);		
		}
		
		
	}
	
}