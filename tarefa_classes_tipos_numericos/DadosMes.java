public class DadosMes{
    private int index;
    private String nome;
    private int quantidadeDias;

    public DadosMes(int index,String nome, int quantidadeDias){
        this.index = index;
        this.nome = nome;
        this.quantidadeDias = quantidadeDias;
    }

	public int getIndex() {
		return this.index;
	}

	public String getNome() {
		return this.nome;
	}

	public int getQuantidadeDias() {
		return this.quantidadeDias;
	}

	@Override
	public String toString() {
		return "DadosMes{" +
				"index=" + index +
				", nome='" + nome + '\'' +
				", quantidadeDias=" + quantidadeDias +
				'}';
	}
}