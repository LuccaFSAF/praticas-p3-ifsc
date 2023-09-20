package ifsc;

public class Animal {

	private String nome;
	private String raca;

	private Float Comprimento;
	private Integer NumPatas;
	private String Cor;
	private String ecossitema;

	public Float getComprimento() {
		return Comprimento;
	}

	public void setComprimento(Float comprimento) {
		Comprimento = comprimento;
	}

	public Integer getNumPatas() {
		return NumPatas;
	}

	public void setNumPatas(Integer numPatas) {
		NumPatas = numPatas;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public String getEcossitema() {
		return ecossitema;
	}

	public void setEcossitema(String ecossitema) {
		this.ecossitema = ecossitema;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void caminha() {

	}

}
