package ReadOnly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Corredores {
	
	private ArrayList<String> nombres;
	
	public Corredores() {
		this.nombres = new ArrayList<>();
	}

	
	
//	public Corredores clone() throws CloneNotSupportedException {
//		return (Corredores) super.clone();
//	}

	
	protected List<String> getReadOnlyItem()
	{
		return Collections.unmodifiableList(nombres);
	}



	public void agregarNombre(String string) 
	{
		this.nombres.add(string);
	}
	
	
}
