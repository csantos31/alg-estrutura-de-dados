public class Carro{
    private String placa;
    private Carro proximo;
    private int voltasNoQuart;
    private Carro entrada;
    private Carro saida;

    public Carro(String placa){
        this.setPlaca(placa);
        this.setProximo(null);
        this.setVoltasNoQuart(0);
        //A DEFINIR
        this.setEntrada(null);
        this.setSaida(null);
    }


	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Carro getProximo() {
		return this.proximo;
	}

	public void setProximo(Carro proximo) {
		this.proximo = proximo;
	}

	public int getVoltasNoQuart() {
		return this.voltasNoQuart;
	}

	public void setVoltasNoQuart(int voltasNoQuart) {
		this.voltasNoQuart = voltasNoQuart;
	}

    public Carro getEntrada() {
		return this.entrada;
	}

	public void setEntrada(Carro entrada) {
		this.entrada = entrada;
	}

	public Carro getSaida() {
		return this.saida;
	}

	public void setSaida(Carro saida) {
		this.saida = saida;
	}

    @Override
    public String toString(){
        return "[" + this.placa + "]("+this.voltasNoQuart +") ";
    }

}