import javax.swing.JOptionPane;

public class TesteData{
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("\n\tInforme o dia: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("\n\tInforme o mes: "));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("\n\tInforme o ano: "));
    
        Data data = new Data(dia, mes, ano);
        System.out.println("\n\t******************************************************");
        System.out.println("\n\tDATA INFORMADA: "+data);
        System.out.println("\n\tDATA SEGUINTE: "+ data.diaSeguinte(dia, mes, ano));
        System.out.println("\n\tDATA ANTERIOR: "+ data.diaAnterior(dia, mes, ano));
        System.out.println("\n\t******************************************************");
        
    }
}