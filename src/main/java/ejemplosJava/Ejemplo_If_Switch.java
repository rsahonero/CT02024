package ejemplosJava;

public class Ejemplo_If_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 5;
		int a = 50;
		
		switch (i) {
		case 0:
			System.out.println("i es cero");
			break;
		case 1:
			System.out.println("i es uno");
			break;
		case 2:
			System.out.println("i es dos");
			break;
		default:
			System.out.println("i es mayor que 2.");
			break;
		}
		
		switch (a) {
		
		case 50:
			System.out.println ("a es 50");
			break;
		case 60:
			System.out.println("a es 60");
		default:
			System.out.println("a es diferente");
			break;
		
		}
		
	}

}
