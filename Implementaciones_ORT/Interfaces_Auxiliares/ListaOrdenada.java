package Interfaces_Auxiliares;

public interface ListaOrdenada <K, T> extends Tda, Iterable<T> {
    String MSG_INVALID_KEY = "Clave invalida";
    String MSG_INDEX_OUT_OF_RANGE = "Indice fuera de rango: El maximo es %d";
    String MSG_NULL_NODE = "El nodo es null";
    String MSG_ELEM_IS_NULL = "El elemento no puede ser Null";

    
    // metodo agregar
    void add(T newElement);

    // compara la posicion de uno con el otro
    int compare(T dato1, T dato2);

    // recibe una clave y un elemento y compara la posicion de cada uno
    int compareByKey(K clave, T elemento);

    // devuelve si existe o no
    boolean exists(K key);

    // devuelve un elemento
    T get(int pos);

    // remueve el elemento de la lista
    boolean remove(T elem);

    T removeAt(int pos);

    T removeByKey(K key);

    T search(K key);
 

}
