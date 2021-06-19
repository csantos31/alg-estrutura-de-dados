public class ListaLigada {
    private No primeiro;
    
    public ListaLigada() {
        this.primeiro = null;
    }
    public No getPrimeiro() {
        return this.primeiro;
    }
    public void setPrimeiro(No no) {
        this.primeiro = no;
    }
    public boolean listaVazia() {
        return this.primeiro == null;
    }
    public void insereInicio(int info) {
        No novo = new No(info);
        if(!listaVazia()) {
            novo.setProximo(this.primeiro);
        }
        this.setPrimeiro(novo);
    }
    public int removeInicio() {
        int intAux = this.primeiro.getInfo();
        setPrimeiro(primeiro.getProximo());//this.primeiro = this.primeiro.getProximo();        return intAux;
    }
    public void insereFim (int info) {//papaléguas        No novo = new No(info);
        if(this.listaVazia()) {
            this.primeiro = novo;
        }
        else {
            No aux = this.primeiro;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }
    @Override    public String toString() {
        String s = "lista: ";
        if(listaVazia()) {
            s+= "vazia";
        }
        else {
            //como percorrer a lista?            No aux = this.primeiro;
            while(aux != null) {
                s+= aux + "-> ";
                aux = aux.getProximo();
            }
            s+= "//";
        }
        return s ;
    }
}