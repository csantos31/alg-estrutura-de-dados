public class TesteNo {
    public static void main (String[] args) {
        No no1;
        no1 = new No(5);
        System.out.println(no1);
        No no2;
        no2 = new No(8);        
        no1.setProximo(no2);
        System.out.println(no1.getProximo());
    }
}