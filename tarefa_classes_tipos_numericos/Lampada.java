public class Lampada{
   
    private int tensao;
    private String tipo;
    private int potencia;
    private boolean status; //true -> acesa | false-> apagada

    //construtores
    public Lampada(int tensao, String tipo, int potencia, boolean status){
        this.tensao = tensao;
        this.tipo = tipo;
        this.potencia = potencia;
        this.status = status;
    }

    public Lampada(){
        this.tensao = 220;
        this.tipo = "Fluorescente";
        this.potencia = 25;
        this.status = true;
    }

    //metodos do levantamento de requisitos
    public void acender(){
        this.setStatus(true);
    }

    public void apagar(){
        this.setStatus(false);
    }

    public boolean verificaStatus(){
        return this.isStatus();
    }

    //getters & setters
    public int getTensao() {
		return this.tensao;
	}

	public void setTensao(int tensao) {
		this.tensao = tensao;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPotencia() {
		return this.potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

    @Override 
    public String toString(){
        return  "\n\t***************************************"+
                "\n\tRESUMO DA LÂMPADA"+
                "\n\tTENSÃO: "+ this.tensao + "V"+
                "\n\tTIPO: "+ this.tipo +
                "\n\tPOTÊNCIA: "+ this.potencia + "W"+
                "\n\tSTATUS: "+ (this.isStatus() ? "Acesa" : "Apagada")+
                "\n\t***************************************";
    }

}