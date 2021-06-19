public class TesteLista{
    public static void main(String[] args) {
        ListaLigada ll = new ListaLigada();
        System.out.println(ll);
        ll.insereInicio(10);
        ll.insereInicio(20);
        ll.insereInicio(30);
        System.out.println(ll);

        if(!ll.listaVazia()){
            System.out.println(ll.removeInicio() + " Foi removido do início");
            System.out.println(ll);
        }
    }
}