package Aula2108;

public class ObjetoUsuario {

	public static void main(String[] args) {

		Usuario usuario1 = new Usuario();

		usuario1.setNome("Nome: Taína");
		usuario1.setPermissao("Permissão: Aceita");
		usuario1.setUsuario("Tipo de usuário: Funcionário");
		usuario1.setSenha(40807);
		usuario1.setId(12345678);
         
		
		System.out.println(usuario1.getNome());
		System.out.println(usuario1.getPermissao());
	    System.out.println(usuario1.getUsuario());
		System.out.println(usuario1.getSenha());
		System.out.println(usuario1.getId());
		System.out.println(usuario1.Cadastrar());
	}
	

}
