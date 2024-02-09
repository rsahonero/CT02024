package ejemplosJava;

public class Ejemplo_Array_Bidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos e inicializamos a un arreglo 2 dimensiones
		int arr[][] = {{2,7,9}, {3,6,1}, {7,6,1}};
		
		// System.out.println(arr[0][0]); --> (arra[0] -> primer array 2,7,9 - [0] --> el valor de ese array en este caso 2)
		
		//imprimir array 2d
		for (int i=0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " "); //print para imprimir en la misma linea
			}
			System.out.println();
		}
	}

}
