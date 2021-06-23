public class NoBinario{
    private int info;
    private NoBinario esq;
    private NoBinario dir;


    public NoBinario(int info){
        this.info = info;
    }

	public int getInfo() {
		return this.info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public NoBinario getEsq() {
		return this.esq;
	}

	public void setEsq(NoBinario esq) {
		this.esq = esq;
	}

	public NoBinario getDir() {
		return this.dir;
	}

	public void setDir(NoBinario dir) {
		this.dir = dir;
	}

    @Override
    public String toString(){
        return "["+info+"]";
    }
}