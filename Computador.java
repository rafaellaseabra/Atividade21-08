package Aula2108;

public class Computador {
	
	String marca;
	String modelo;
	int capacidade;
	int valor;
	
	public String getMarca() {
		return marca;
	}
    public void setMarca(String marca) {
    	this.marca = marca;
    }
    public String getModelo() {
    	return modelo;
    }
    public void setModelo(String modelo) {
    	this.modelo = modelo;
    }
    public int getCapacidade() {
    	return capacidade;
    }
    public void setCapacidade (int capacidade) {
    	this.capacidade = capacidade;
    }
    public int getValor() {
    	return valor;
    }
    public void setValor(int valor) {
    	this.valor = valor;
    }

    public String Ligar() {
    	return ".Seu computador está ligando";
    }
    public String Reiniciar() {
    	return ".Computando REINICIANDO";
    }
    public String Desligar() {
    	return ".Desligando Computador ";
    }
}
