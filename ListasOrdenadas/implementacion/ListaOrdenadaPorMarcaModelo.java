package implementacion;

import interfaces.nodos.ListaOrdenada;

public class ListaOrdenadaPorMarcaModelo extends ListaOrdenada_Nodos<String, Auto> implements ListaOrdenada<String, Auto> {

	@Override
	public int compare(Auto dato1, Auto dato2) {
		
		//compare de datos float (pq el int toma solo la parte entera no los decimales)
		//float resta = (dato1.getCilindrada() - datos.getCilindrada);
		//return resta == 0 ? 0 : resta > 0 ? 1 : -1;
		
		return dato1.getClaveCompuesta().compareToIgnoreCase(dato2.getClaveCompuesta());
	}

	@Override
	public int compareByKey(String clave, Auto elemento) {
		return clave.compareToIgnoreCase(elemento.getClaveCompuesta());
	}

}




class Auto{
	private String marca;
	private String modelo;
	
	public Auto(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getClaveCompuesta() {
		return this.marca + "-" + this.modelo;
	}

	@Override
	public String toString() {
		return "Auto [" + (marca != null ? "marca=" + marca + ", " : "") + (modelo != null ? "modelo=" + modelo : "")
				+ "]";
	}
	
	
}