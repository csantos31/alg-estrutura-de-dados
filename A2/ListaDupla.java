public class ListaDupla{
    private NoDuplo primeiro;
    private NoDuplo ultimo;

    public ListaDupla(){
        this.primeiro = null;
        this.ultimo = null;
    }

	public NoDuplo getPrimeiro() {
		return this.primeiro;
	}

	public void setPrimeiro(NoDuplo primeiro) {
		this.primeiro = primeiro;
	}

    
    public NoDuplo getUltimo() {
        return this.ultimo;
	}
    
	public void setUltimo(NoDuplo ultimo) {
        this.ultimo = ultimo;
	}
    
    public boolean listaVazia(){
        return this.getPrimeiro() == null;
    }

    //OPERAÇÕES DE INICIO CARACTERIZAM PILHA
    public void insereInicio(int info){
        NoDuplo novo = new NoDuplo(info);
        if(!this.listaVazia()){
            novo.setProximo(this.primeiro);
        }else{
            this.setUltimo(novo);
        }
        this.setPrimeiro(novo);
    }

    public int removeInicio(){
        int aux = this.primeiro.getInfo();
        setPrimeiro(this.primeiro.getProximo());
        if(this.listaVazia()){
            this.setUltimo(null);
        }
        return aux;
    }

    public void insereFim(int info){
        NoDuplo novo = new NoDuplo(info);
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
            NoDuplo aux = this.primeiro;
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
            NoDuplo aux = this.primeiro;
            while(aux!=null){
                s += aux +"-> ";
                aux=aux.getProximo(); 
            }
            s += " //";
        }

        return s;
    }
}