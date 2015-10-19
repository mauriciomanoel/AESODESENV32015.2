package br.aeso.aula16.prototype;
public class Nota implements Cloneable {
	private String som;
	public Object clone() {
		try {
			Nota n = (Nota) super.clone();
			return n;
		}
		catch (CloneNotSupportedException e) { 
			return null; 
		}
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	} 
}