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
            }else{
                this.setSaida(novo);
            }
            this.setEntrada(novo);
            this.setVagasDisponiveis(this.getVagasDisponiveis()-1);

        }else{
            System.out.println("\nO carro "+placa+" nao pode entrar pois nao ha mais vagas disponiveis\n");
        }
    }

    public void removeCarro(String placa){
        Carro carroSaindo = new Carro(placa);
        Carro carroAux = this.getEntrada();
        while(carroAux.getProximo() != null){
            if(carroSaindo.getPlaca() != this.getSaida().getPlaca()){
                String placaAux = this.getSaida().getPlaca();
                this.removeSaida();
                this.insereEntrada(placaAux);
                this.entrada.setVoltasNoQuart(this.entrada.getVoltasNoQuart()+1);
            }else{
                this.removeSaida();
                this.setSaida(this.getSaida());
            }
        }
    }

    public Carro removeSaida(){
        Carro saidaAux = this.getSaida();
        System.out.println(saidaAux.getPlaca() + " saindo");
        if(this.entrada == this.saida){
            this.setEntrada(null);
            this.setSaida(null);
        }else{
            Carro aux = this.entrada;
            while(aux.getProximo() != this.saida){
                aux = aux.getProximo();
            }
            aux.setProximo(null);
            this.setSaida(aux);
        }
        this.setVagasDisponiveis(this.getVagasDisponiveis()-1);
        return saidaAux;
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
        Carro aux = this.getEntrada();
        while(aux.getProximo() != null){
            aux=aux.getProximo();
        }
        return aux;
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