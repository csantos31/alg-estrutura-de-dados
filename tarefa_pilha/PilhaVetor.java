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

    public int desempilhaEmBaixo(){
        int[] dadosAux = this.dados;
        int removido = this.dados[0];
        if(!estaVazia()){
            for(int i=0;i<this.tamanho();i++){
                this.dados[i] = dadosAux[i+1];
            }
            this.topo--;
        }
        return removido;
    }

    public int tamanho(){
        return this.topo;
    }

    public int topo(){
        return this.dados[topo-1];
    }

    public boolean empilhaForte(){
        int valorAux = this.dados[0];

        for(int i=1; i<this.tamanho(); i++){
            if(valorAux > this.dados[i]){
                return false;
            }
        }
        return true;
    }

    public String decimalToBinary(double deci){
        String s = "";
        int top =0;
        int divs[] = new int[100];
        while(deci > 0){
            if(deci%2==0){
                deci = deci/2;
                divs[top]=0;
            }else{
                deci = (deci-1)/2;
                divs[top]=1;
            }
            top++;
        }

        for(int i=top-1;i>=0;i--){
            s+=divs[i];
        }

        return s;
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