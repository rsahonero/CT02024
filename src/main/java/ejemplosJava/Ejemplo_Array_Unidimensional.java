package ejemplosJava;

public class Ejemplo_Array_Unidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray[];
		int[] intarray2;
		double doublearray[];
		
		//Declarar un arreglo de strings
		String[] arr;
		
		//Assignar memoria para 5 strings
		arr = new String[5];
		
		//inicializar el primer elmento del arreglo
		arr[0]= "cero";
		
		//inicializar el segundo elmento del arreglo
		arr[1]= "uno";
		arr[2]= "dos";
		arr[3]= "tres";
		arr[4]= "cuatro";
		
		System.out.println("La posiciones del arreglo es: " + arr[3]);
		
		for(int i = 0; i < arr.length; i++) { //arr.lengh calcula la longitud del arreglo en un tipo de dato int
			System.out.println("Elemento en el indice " + i + ":" + arr[i]);
		}
		
		//ejemplo de arreglo con enteros
		int[] intArr = new int[] {1,2,3,4,5,6,7,8};
		
	}

}
