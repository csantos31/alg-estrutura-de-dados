public class Carta{
    private String naipe;
    private String valor;


	public String getNaipe() {
		return this.naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

    public Carta(){
    }

    public Carta(String naipe, String valor){
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "\tNaipe: "+ this.naipe +" Valor :" + this.valor;
    }

}