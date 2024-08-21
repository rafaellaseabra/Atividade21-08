package Aula2108;

public class ObjetoComputador {

	public static void main(String[] args) {
		
		Computador comp1 = new Computador();
		
		comp1.setMarca("°Apple");
		comp1.setModelo("°iMac-24");
		comp1.setCapacidade(256);
		comp1.setValor(10000);
		
		System.out.println ("*********************************");
		System.out.println(comp1.getMarca());
		System.out.println(comp1.getModelo());
		System.out.println(comp1.getCapacidade());
		System.out.println(comp1.getValor());
		System.out.println(comp1.Ligar());
		
		
	}

}
