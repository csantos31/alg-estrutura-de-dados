import javax.swing.JOptionPane;

public class TestePilha{
    public static void main(String[] args) {
        PilhaVetor pv1 = new PilhaVetor();
        
        pv1.push(10);
        pv1.push(20);
        System.out.println(pv1);
        
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade da pilha"));
        PilhaVetor pv2 = new PilhaVetor("Pilha 2",c);
        pv2.push(3);
        pv2.push(7);
        pv2.push(5);
        System.out.println(pv2);
        
        System.out.println("\t"+ pv2.pull()+ "\tfoi desempilhado\t");
        
        System.out.println(pv2);
        
    
    }
}