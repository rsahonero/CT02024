package ejemplosJava;

public class Ejemplo_If_Anidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperatura = 27;
		
		if(temperatura > 15) {
			if(temperatura > 25) {
				System.out.println("A la playa");
			} else {
				System.out.println("A la montana");
			}
		} else {
			System.out.println("A descansar...");
		}
	}

}
