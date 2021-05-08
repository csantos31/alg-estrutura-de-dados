public class PilhaVetorGenerica<T>{
    private T[] dados;
    private int capacidade;
    private int topo;
    private String nome;

    public PilhaVetorGenerica(){
        this(10);
    }

    public PilhaVetorGenerica(int capacidade){
        this.dados = (T[]) new Object[capacidade];
        this.topo = 0;
        this.capacidade = capacidade;
        this.nome = "nomea";
    }


    public boolean estaCheia(){
        return this.topo==this.capacidade;
    }

    public boolean estaVazia(){
        return this.topo == 0;
    }

    public void push(T i){
        this.dados[this.topo++]=i;
    }

    public T pull(){
        return this.dados[--topo];
    }

    public int tamanho(){
        return this.topo;
    }

    public T topo(){
        return this.dados[topo-1];
    }

    @Override
    public String toString(){
        String sPilha = "\tPilha: ";
        if(this.estaVazia()){
            sPilha = sPilha + "Está vazia";
        }else{
            sPilha =
                " Nome: " + this.nome +
                " Capacidade: " + this.capacidade +
                " Tamanho: " + this.tamanho() + "\n\t";

            for(int i=this.topo; i>=0;i--){
                sPilha = sPilha + this.dados[i] + " ";
            }
        }

        sPilha = sPilha+"\n\t";
        return sPilha;
    }
}