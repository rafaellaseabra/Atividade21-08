package Aula2108;

public class Fornecedor {
	String razaoSocial;
	String cnpj;
	String endereco;
	String fone;
	String email;
	String inscricaoEstadual;
	String nomeFantasia;
	int id;

	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getfone() {
		return fone;
	}
	public void setFone(String fone ) {
		this.fone = fone;
	}
	public void setEmail(String email ) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia ) {
		this.nomeFantasia = nomeFantasia;
	}
	public int getId() {
		return id;
	}
	public void setId (int id) {
		this.id = id;
	}

	
	public String Pagar() {
		return "pagamento concluido";
	}
    public String Vender() {
    	return "Vendendo";
    }
   
}
