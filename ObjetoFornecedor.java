package Aula2108;

public class ObjetoFornecedor {

	public static void main(String[] args) {
		
		Fornecedor fornecedor1 = new Fornecedor();
		
		fornecedor1.setRazaoSocial("Razão social - Coca Cola Indústrias Ltda");
		fornecedor1.setNomeFantasia("Nome - Coca-cola");
		fornecedor1.setEndereco("Endereço - Vila Nova Itapetininga"); 
		fornecedor1.setEmail("Email - imprensacoca-cola@edelman.com.");
		fornecedor1.setFone("Telefone - 55 (11) 3060-777");
		fornecedor1.setInscricaoEstadual("Inscrição Estadual - 123098123098");
		fornecedor1.setCnpj("CNPJ - 45.997.418/0017-10.");
		fornecedor1.setId(01010123);
		
		
		System.out.println(fornecedor1.getRazaoSocial());
		System.out.println(fornecedor1.getNomeFantasia());
		System.out.println(fornecedor1.getEndereco());
		System.out.println(fornecedor1.getEmail());
		System.out.println(fornecedor1.getfone());
		System.out.println(fornecedor1.getInscricaoEstadual());
		System.out.println(fornecedor1.getCnpj());
		System.out.println(fornecedor1.getId());
		System.out.println(fornecedor1.Pagar());
	}

}
