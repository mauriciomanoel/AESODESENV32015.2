package br.aeso.aula12.exemplo02;

public abstract class Pizza {
	public final static int MARGUERITA = 1;
	public static final int PORTUGUESA = 2;
	public static final int FRANGO_CATUPIRY = 3;
	
	public abstract void preparar();
	 
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
    
    public abstract String tipo();
}

