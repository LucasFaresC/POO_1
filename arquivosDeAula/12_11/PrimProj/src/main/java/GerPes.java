import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GerPes{
    
    private Pessoa pes = new Pessoa();
    private List<Pessoa> bdPes = new ArrayList<Pessoa>();
    
    public List<Pessoa> getBdPes(){
        return bdPes;
    }

    public Pessoa consPesCpf(Pessoa pes){
        for(int i = 0; i < bdPes.size(); i++){
            if(pes.getCpf() == bdPes.get(i).getCpf()){
                    return bdPes.get(i);
            }
        }
        return null;
    }//fim consPesCod	

    public Pessoa insPes(Pessoa pes){
        if(consPesCpf(pes)== null){
            bdPes.add(pes);
            return pes;
        }
        else{
            return null;
        }
    }//fim insPes

    public Pessoa delPesCpf(Pessoa pes){
        Pessoa pes1 = consPesCpf(pes);
        if(pes1 != null){
            bdPes.remove(pes1);
            return null;
        }
        else{
            return pes;
        }
    }//fim removePesCpf2

    public Pessoa atualizaPesCpf(Pessoa pes){ //Não atualiza o CPF, apenas os demais campos
        for(int i = 0; i < bdPes.size(); i++){
            if(pes.getCpf() == bdPes.get(i).getCpf()){
                pes = bdPes.get(i);

                String nome = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo NOME",
                    "Atulizar dados",
                    JOptionPane.INFORMATION_MESSAGE
                );

                pes.setNome(nome);
                bdPes.set(i, pes);  
                return bdPes.get(i);
            }
        }
        return null;
    }//fim atualizaPesCpf
}//fim da classe
