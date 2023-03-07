package Generics;

public class Printer<T> {
	
	T algoParaImprimir;
	
	
	public Printer(T algo){
		this.algoParaImprimir = algo;
	}

	public void print() {
		System.out.println(algoParaImprimir);
	}
}
