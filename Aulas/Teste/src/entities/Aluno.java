package entities;

public class Aluno {
	
	private String nome;
	private int rgm;
	
	public Aluno(String nome, int rgm) {
		this.nome = nome;
		this.rgm = rgm;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getRgm() {
		return this.rgm;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setRgm(int rgm) {
		this.rgm = rgm;
	}

}
