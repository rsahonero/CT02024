package ejemplosJava;

public class Triangulo extends DosDimemnsiones {
	
	String estilo;
	
	double area() {
		return base * altura / 2;
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es: " + estilo);
	}

}
