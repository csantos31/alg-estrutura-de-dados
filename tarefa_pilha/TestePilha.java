import javax.swing.JOptionPane;

public class TestePilha{
    public static void main(String[] args) {
        PilhaVetor p1 = new PilhaVetor("Pilha fraca");
        p1.push(2);
        p1.push(4);
        p1.push(7);
        PilhaVetor p2 = new PilhaVetor("Pilha forte");
        p2.push(7);
        p2.push(4);
        p2.push(6);
        System.out.println("A pilha 1  é forte: "+p1.empilhaForte()); //precisa ser true
        System.out.println("A pilha 2  é forte: "+p2.empilhaForte()); //precisa ser false
        System.out.println(p2);
        // System.out.println(p2.pull() + " foi desempilhado"); //6
        System.out.println(p2.desempilhaEmBaixo()+" foi desempilhado");//7
        System.out.println(p2);

        System.out.println("30 decimal to binary: "+p1.decimalToBinary(30));
    }
}