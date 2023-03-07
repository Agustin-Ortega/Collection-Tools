package implementacion;

public class ListaDeClientes_porNombre extends ListaOrdenada_Nodos<String, Cliente> {

//	Cliente cliente = new Cliente(44, "Hamilton");
//	Cliente cliente2 = new Cliente(22, "Verstappen");

	@Override
	public int compare(Cliente dato1, Cliente dato2) {

		return dato1.getNombre().compareTo(dato2.getNombre());
	}

	@Override
	public int compareByKey(String clave, Cliente elemento) {

		return clave.compareTo(elemento.getNombre());
	}

}
