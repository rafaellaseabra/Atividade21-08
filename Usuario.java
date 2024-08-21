package Aula2108;

public class Usuario {
	String nome;
	String permissao;
	String usuario;
	int senha;
	int id;
	
	public String getNome(){
		return nome;	
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
    public String getUsuario() {
		return usuario;
    	
    }
    public void setUsuario(String usuario) {
    	this.usuario = usuario;
    }
    public String getPermissao() {
		return permissao;
    	
    }
    public void setPermissao(String permissao) {
    	this.permissao = permissao;
    }
    public int getSenha() {
		return senha;
    	
    }
    public void setSenha (int senha) {
    	this.senha = senha;
    }
    public int getId() {
		return id;
    	
    }
    public void setId(int id) {
    	this.id = id;
    }

    public String Cadastrar (){
    	return "Cliente cadastrado";
    }
    public String Removendo () {
    	return "Removendo";
    }

}
