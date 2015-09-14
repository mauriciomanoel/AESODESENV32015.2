package br.aeso.aula12.exemplo01;

public abstract class Pizza {
	public static int MARGUERITA = 1;
	public static int PORTUGUESA = 2;
	
    public void fazer() {
        System.out.println("* Pegar massa");
        System.out.println("* Colocar molho de tomate");
    }
    public void embalar() {
        System.out.println("* Pizza embalada");
    }
    public void entregar() {
        System.out.println("* Pizza despachada");
    }
    public String tipo() {
    	return null;
    }
}

