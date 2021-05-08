public class PilhaVetor{
    private int dados[];    
    private int capacidade;
    private int topo;
    private String nome;

    public PilhaVetor(String nome){
        this(nome,10);
    }

    public PilhaVetor(String nome,int capacidade){
        this.dados = new int[capacidade];
        this.topo = 0;
        this.capacidade = capacidade;
        this.nome = nome;
    }

    public boolean estaCheia(){
        return this.topo==this.capacidade;
    }

    public boolean estaVazia(){
        return this.topo == 0;
    }

    public void push(int i){
        this.dados[this.topo++]=i;
    }

    public int pull(){
        return this.dados[--topo];
    }

    public int tamanho(){
        return this.topo;
    }

    public int topo(){
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

            for(int i=this.topo-1; i>=0;i--){
                sPilha = sPilha + this.dados[i] + " ";
            }
        }

        sPilha = sPilha+"\n\t";
        return sPilha;
    }
}