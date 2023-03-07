package hasmap;

import java.util.HashMap;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // HashMap conjunto de par de Key y valor  :  Agustin/01
        // nos sirve para guardar un par asociado de diferentes tipos de datos
        // coleccion de par de claves - valor
        HashMap<String, Integer> empleadosId = new HashMap<>();

        // Los guarda en forma desordenada
        empleadosId.put("Agustin",01);
        empleadosId.put("Lewis",02);
        empleadosId.put("Max",04);
        // pisa el dato que tenga la misma Key que en este caso seria el String de nombre
        empleadosId.put("Max",03);
        empleadosId.put("Charles",04);

        System.out.println(empleadosId);

        // metodo get recibe la Key de un elemento y devuelve el valor asignado
        System.out.println("Metodo Get : "+empleadosId.get("Agustin"));

        // metodo containsKey devuelve un boolean por si existe o no el elemento con la Key pasada por parametro
        System.out.println("Metodo containsKey : "+empleadosId.containsKey("George"));
        // metodo containsValue devuelve un boolean por si existe o no el elemento con el Value pasado por parametro
        System.out.println("Metodo containsValue : "+empleadosId.containsValue(04));

        // metodo replace reemplaza el elemento con la K pasada por parametro Si existe
        // en caso de no existir no lo agrega, a diferencia del met put que setea al valor del elemento pasado
        empleadosId.replace("Kramer", 564);
        System.out.println("Metodo replace : "+empleadosId);

        // metodo putIfAbsent agrega un nuevo elemento si el elemento de la K del parametro existe
        // en caso de no existir no hace nada
        // a dif del replace que solo reemplza si existe, este reemplaza si exite si no crea uno nuevo
        empleadosId.putIfAbsent("Lewis",05);
        System.out.println("Metodo putIfAbsent repetido : "+empleadosId);

        empleadosId.putIfAbsent("Checo",05);
        System.out.println("Metodo putIfAbsent inexistente: "+empleadosId);

        empleadosId.remove("Checo");
        System.out.println("Metodo remove: "+empleadosId);
	}

}
