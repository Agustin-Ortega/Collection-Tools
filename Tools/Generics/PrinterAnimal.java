package Generics;

public class PrinterAnimal<T extends Animal & Cloneable> {

	T algoParaImprimir;

	public PrinterAnimal(T algo) {
		this.algoParaImprimir = algo;
	}

	public void print() {
		System.out.println(algoParaImprimir);
		algoParaImprimir.comer(); // tenemos acceso ya que el elemento T es un animal
	}

}
