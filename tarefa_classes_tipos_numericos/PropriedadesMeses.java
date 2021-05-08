import java.util.ArrayList;
import java.util.Collections;

public class PropriedadesMeses{

    ArrayList<DadosMes> listaDeMeses=new ArrayList<DadosMes>(
            Collections.nCopies(13, new DadosMes(0,"invalido",0)));
    private int getQuantidadeDiasFevereiro(int ano){
        if (ano % 4 == 0) {
            if (ano % 100 != 0) {
                return 29;
            } else if (ano % 100 == 0 && ano % 400 == 0) {
                return 29;
            }
        }
        return 28;
    }

    public PropriedadesMeses(int ano){
        //o elemento zero desse vetor será descartado por legibilidade
        listaDeMeses.set(1,new DadosMes(1, "Janeiro", 31)) ;
        listaDeMeses.set(2,new DadosMes(2, "Fevereiro", this.getQuantidadeDiasFevereiro(ano)));
        listaDeMeses.set(3,new DadosMes(3, "Março", 31));
        listaDeMeses.set(4,new DadosMes(4, "Abril", 30));
        listaDeMeses.set(5,new DadosMes(5, "Maio", 31));
        listaDeMeses.set(6,new DadosMes(6, "Junho", 30));
        listaDeMeses.set(7,new DadosMes(7, "Julho", 31));
        listaDeMeses.set(8,new DadosMes(8, "Agosto", 31));
        listaDeMeses.set(9,new DadosMes(9, "Setembro", 30));
        listaDeMeses.set(10,new DadosMes(10, "Outubro", 31));
        listaDeMeses.set(11,new DadosMes(11, "Novembro", 30));
        listaDeMeses.set(12,new DadosMes(12, "Dezembro", 31));
    }

}