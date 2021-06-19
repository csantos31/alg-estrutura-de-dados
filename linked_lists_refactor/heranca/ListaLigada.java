public class ListaLigada{
    private No primeiro;

    public ListaLigada(){
        this.primeiro = null;
    }

	public No getPrimeiro() {
		return this.primeiro;
	}

	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}

    public boolean listaVazia(){
        return this.getPrimeiro() == null;
    }

    //OPERAÇÕES DE INICIO CARACTERIZAM PILHA
    public void insereInicio(int info){
        No novo = new No(info);
        if(!listaVazia()){
            novo.setProximo(this.primeiro);
        }
        this.setPrimeiro(novo);
    }

    public int removeInicio(){
        int aux = this.primeiro.getInfo();
        setPrimeiro(this.primeiro.getProximo());
        return aux;
    }

    public void insereFim(int info){
        No novo = new No(info);
        if(this.listaVazia()){
            this.setPrimeiro(null);
        }else{
            No aux = this.primeiro;
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }

    @Override
    public String toString(){
        String s = "Lista ";

        if(this.listaVazia()){
            s+= "vazia";
        }else{
            No aux = this.primeiro;
            while(aux!=null){
                s += aux +"-> ";
                aux=aux.getProximo(); 
            }
            s += " //";
        }

        return s;
    }
}