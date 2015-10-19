package br.aeso.aula16.prototype;
public class Documento implements Cloneable {
	private String nome;
	private String formato;
	public Documento clone() {
		try {
			Documento clone = (Documento) super.clone();
			return clone;
		}
		catch (CloneNotSupportedException e) { 
			return null; 
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
}
