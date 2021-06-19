public class ListaLigada{
    private No primeiro;
    private No ultimo;

    public ListaLigada(){
        this.primeiro = null;
        this.ultimo = null;
    }

	public No getPrimeiro() {
		return this.primeiro;
	}

    public No getUltimo() {
		return this.ultimo;
	}

	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}

    public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}

    public boolean listaVazia(){
        return this.getPrimeiro() == null;
    }

    //OPERAÇÕES DE INICIO CARACTERIZAM PILHA
    public void insereInicio(int info){
        No novo = new No(info);
        if(!listaVazia()){
            novo.setProximo(this.primeiro);
        }else{
            setUltimo(novo);
        }
        this.setPrimeiro(novo);
    }

    public int removeInicio(){
        int aux = this.primeiro.getInfo();
        setPrimeiro(this.primeiro.getProximo());
        if(listaVazia()){
            this.setUltimo(null);
        }

        return aux;
    }

    public void insereFim(int info){
        No novo = new No(info);
        if(this.listaVazia()){
            this.setPrimeiro(novo);
        }else{
            this.ultimo.setProximo(novo);
        }
        this.setUltimo(novo);
    }

    public int removeFim(){
        int intAux = this.ultimo.getInfo();
        if(this.primeiro == this.ultimo){
            this.setPrimeiro(null);
            this.setUltimo(null);
        }else{
            No aux = this.primeiro;
            while(aux.getProximo() != this.ultimo){
                aux = aux.getProximo();
            }
            aux.setProximo(null);
            this.setUltimo(aux);
        }
        return intAux;
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