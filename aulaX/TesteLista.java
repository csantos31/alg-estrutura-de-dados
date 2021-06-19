public class TesteLista {
    public static void main(String[] args) {
        ListaLigada ll = new ListaLigada();
        System.out.println(11);
        ll.insereInicio(10);
        ll.insereInicio(20);
        ll.insereInicio(30);
        System.out.println(ll);
        if(!ll.listaVazia()) {
            System.out.println(ll.removeInicio() + " foi removido do inicio");
            System.out.println(ll);
        }
    }
}