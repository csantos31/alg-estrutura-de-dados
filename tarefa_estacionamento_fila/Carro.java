public class Carro{
    private String placa;
    private Carro proximo;
    private int voltasNoQuart;
    private int entrada;
    private int saida;


    public Carro(String placa){
        this.setPlaca(placa);
        this.setProximo(null);
        this.setVoltasNoQuart(0);
        //A DEFINIR
        this.setEntrada(0);
        this.setSaida(0);
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

	public int getEntrada() {
		return this.entrada;
	}

	public void setEntrada(int entrada) {
		this.entrada = entrada;
	}

	public int getSaida() {
		return this.saida;
	}

	public void setSaida(int saida) {
		this.saida = saida;
	}

    @Override
    public String toString(){
        return "[" + this.placa + "] ";
    }

}