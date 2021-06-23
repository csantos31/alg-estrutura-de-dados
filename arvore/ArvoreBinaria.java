public class ArvoreBinaria{
    NoBinario raiz;

	public NoBinario getRaiz() {
		return this.raiz;
	}

	public void setRaiz(NoBinario raiz) {
		this.raiz = raiz;
	}

    public void insere(int i){
        NoBinario novo = new NoBinario(i);
        if(this.estaVazia()){
            setRaiz(novo);
        }else{
            insereRecursivo(novo,raiz);
        }
    }

    private void insereRecursivo(NoBinario novo, NoBinario atual){
        if(novo.getInfo() > atual.getInfo()){ //segue pra direita
            if(atual.getDir() == null){//pode inserir nesse nó
                atual.setDir(novo);
            }else{//fazer busca pra esquerda
                insereRecursivo(novo, atual.getDir());
            }
        }else{//segue pra esquerda
            if(atual.getEsq() == null){
                atual.setEsq(novo);
            }else{
                insereRecursivo(novo,atual.getEsq());
            }
        }
    }

    public boolean estaVazia(){
        return raiz == null;
    }

    @Override
    public String toString(){
        //Percurso em ordem na arvore
        
        String s = "A arvore: ";
        
        if(this.estaVazia()){
            s+= "vazia";
        }else{
            s+=toStringRec(raiz);//crise de fadinha by machion
        }

        return s;
    }

    private String toStringRec(NoBinario atual){

        String s = "";
        if(atual != null){
            s+=toStringRec(atual.getEsq());
            s+=atual;
            s+=toStringRec(atual.getDir());   
        }
        return s;
    }
}