public class NoDuplo{
    private int info;
    private NoDuplo proximo;
    private NoDuplo anterior; 
    
    public NoDuplo(int info){
        this.setInfo(info);
        this.setProximo(null);
        this.setAnterior(null);
    }
    
    public int getInfo(){
        return this.info;
    }
    
    public NoDuplo getProximo(){
        return this.proximo;
    }
    
    public void setInfo(int info){
        this.info=info;
    }
   
    public NoDuplo getAnterior() {
        return this.anterior;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }
    
    public void setProximo(NoDuplo proximo){
        this.proximo=proximo;
    }

    @Override
    public String toString(){
        return "[" + this.info + "] ";
    }
}