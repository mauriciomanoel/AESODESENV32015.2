package br.aeso.aula24;
public class ProgramaBancoUsuario {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Usuário sem permissão");
		BancoUsuario banco = new BancoProxy("usuario", "1234");
		System.out.println(banco.getNumeroDeUsuarios());
		System.out.println(banco.getUsuariosConectados());
		 
		System.out.println("\nAdministrador acessando");
		banco = new BancoProxy("admin", "admin");
		System.out.println(banco.getNumeroDeUsuarios());
		System.out.println(banco.getUsuariosConectados());
	}
}
