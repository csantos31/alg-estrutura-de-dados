public class TesteLista{
    public static void main(String[] args) {
        ListaDupla ll = new ListaDupla();
        System.out.println(ll);
        ll.insereInicio(10);
        ll.insereInicio(20);
        ll.insereInicio(30);
        ll.insereInicio(60);

        ll.insereInicio(100);
        System.out.println(ll);

        if(!ll.listaVazia()){
            System.out.println(ll.removeInicio() + " Foi removido do início");
            System.out.println(ll);

            System.out.println(ll.removeFim() + " Foi removido do fim");
            System.out.println(ll);
        }
    }
}