public class No {
    private int info;
    private No proximo;
    //construtor    public No (int info) {
        this.setInfo(info);
        this.setProximo(null);
    }
    //getters    public int getInfo() {
        return this.info;
    }
    public No getProximo() {
        return this.proximo;
    }
    //setters    public void setInfo(int info) {
        this.info = info;
    }
    public void setProximo (No proximo) {
        this.proximo = proximo;
    }
    @Override    public String toString() {
        return "[" + this.info + "] ";
    }
}