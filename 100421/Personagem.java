public class Personagem{
    private String nome;
    private int forca;
    private int fome;
    private int sono;

    public Personagem(String nome, int forca, int fome, int sono){
        this.setNome(nome);
        this.setForca(forca);
        this.setFome(fome);
        this.setSono(sono);
    }

    public Personagem(String nome){
        this.setNome(nome);
        this.setForca(1);
        this.setFome(1);
        this.setSono(1);
    }

    public Personagem(){}

    //GETTERS AND SETTERS
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getForca() {
		return this.forca;
	}

	public void setForca(int forca) {
        if(forca >= -5 && forca <=5){
            this.forca = forca;
        }
	}

	public int getFome() {
		return this.fome;
	}

	public void setFome(int fome) {
		if(fome >= 0 && fome <= 8){
            this.fome = fome;
        }
	}

	public int getSono() {
		return this.sono;
	}

	public void setSono(int sono) {
		if(sono >= 0 && sono <= 10){
            this.sono = sono;
        }
	}

    @Override
    public String toString(){
        String personagem =
        "\n\n\tNome: "+ this.nome 
         + "\n\tForça " + this.forca 
         + "\n\tSono: "+ this.sono 
         + "\n\tFome: "+ this.fome;
        return personagem;
    }
}