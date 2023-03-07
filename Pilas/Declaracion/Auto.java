package Declaracion;

public class Auto {
private String patente;
private String modelo;
private String marca;

public Auto(String patente, String modelo, String marca) {
	setMarca(marca);
	setModelo(modelo);
	setPatente(patente);
	
}




public Auto(String marca) {
	super();
	this.marca = marca;
}




public String getPatente() {
	return patente;
}
public void setPatente(String patente) {
	this.patente = patente;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
@Override
public String toString() {
	return "Auto - Patente : " + patente + ", Modelo : " + modelo + ", Marca : " + marca;
}


	
	
}
