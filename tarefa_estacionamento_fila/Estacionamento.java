public class Estacionamento{
    private int vagas;
    private Carro entrada;
    private Carro saida;
    private int vagasDisponiveis;

    public Estacionamento(){
        this.setVagas(10);
        this.setEntrada(null);
        this.setSaida(null);
        this.setVagasDisponiveis(10);
    }

    public void insereEntrada(String placa){
        Carro novo = new Carro(placa);
        if(!this.estacionamentoCheio()){
            System.out.println("O carro "+placa+" entrou");
            if(!this.estacionamentoVazio()){
                novo.setProximo(this.getEntrada());
            }
            this.setEntrada(novo);
            this.setVagasDisponiveis(this.getVagasDisponiveis()-1);
        }else{
            System.out.println("\nO carro "+placa+" nao pode entrar pois nao ha mais vagas disponiveis\n");
        }
    }

    public boolean estacionamentoCheio(){
        return this.vagasDisponiveis == 0;
    }

    public boolean estacionamentoVazio(){
        return this.getEntrada() == null;
    }

	public int getVagas() {
		return this.vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

    public int getVagasDisponiveis() {
		return this.vagasDisponiveis;
	}

	public void setVagasDisponiveis(int vagasDisponiveis) {
		this.vagasDisponiveis = vagasDisponiveis;
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
        String s = "\n\nCARROS NO ESTACIONAMENTO \n\n";

        if(this.estacionamentoVazio()){
            s+= "\nTodas as vagas disponiveis";
        }else{
            Carro aux = this.entrada;
            while(aux!=null){
                s += aux +"-> ";
                aux=aux.getProximo(); 
            }
            s += " //";
        }

        return s;
    }
}