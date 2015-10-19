package br.aeso.aula16.prototype;
public class CheeseCake implements Cake {
	private String acucar;
	private String manteiga;
	private String queijo;
	private String nome;
	public Cake prepareCake() {
		Cake cake = null;
		try {
			cake = (Cake) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cake;
	}
	public String getAcucar() {
		return acucar;
	}
	public void addAcucar(String acucar) {
		this.acucar = acucar;
	}
	public String getManteiga() {
		return manteiga;
	}
	public void addManteiga(String manteiga) {
		this.manteiga = manteiga;
	}
	public String getQueijo() {
		return queijo;
	}
	public void addQueijo(String queijo) {
		this.queijo = queijo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String toString() {
		return "CheeseCake [acucar=" + acucar + ", manteiga=" + manteiga + ", queijo=" + queijo + ", nome=" + nome
				+ "]";
	}
}
