public class ListaLigadaComUltimo extends ListaLigada{
    private No ultimo;

    public ListaLigadaComUltimo(){
        super();
        this.ultimo = null;
    }

    public No getUltimo() {
		return this.ultimo;
	}

    public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}

    //OPERAÇÕES DE INICIO CARACTERIZAM PILHA
    @Override
    public void insereInicio(int info){
        No novo = new No(info);
        if(!listaVazia()){
            novo.setProximo(getPrimeiro());
        }else{
            setUltimo(novo);
        }
        this.setPrimeiro(novo);
    }

    @Override
    public int removeInicio(){
        int aux = getPrimeiro().getInfo();
        setPrimeiro(getPrimeiro().getProximo());
        if(listaVazia()){
            this.setUltimo(null);
        }

        return aux;
    }

    @Override
    public void insereFim(int info){
        No novo = new No(info);
        if(this.listaVazia()){
            getPrimeiro(novo);
        }else{
            this.ultimo.setProximo(novo);
        }
        this.setUltimo(novo);
    }

    public int removeFim(){
        int intAux = this.ultimo.getInfo();
        if(getPrimeiro() == this.ultimo){
            setPrimeiro(null);
            this.setUltimo(null);
        }else{
            No aux = getPrimeiro();
            while(aux.getProximo() != this.ultimo){
                aux = aux.getProximo();
            }
            aux.setProximo(null);
            this.setUltimo(aux);
        }
        return intAux;
    }
}