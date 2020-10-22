package escuela_it.poo;

public class Primos1 {
	public static void main(String[] args) {
		int i=0;
		boolean esPrimo=false;
		int suma=0;
		for (i=2; i <50; i++) {
			esPrimo=true;
			for (int j = 2; j <= i-1; j++) {
				if (i%j==0) {
					esPrimo=false;
				}
			}
			if (esPrimo == true) {
				suma = suma + i;
				i++;
			}
		}

		System.out.println("La suma de los números primos en los primeros 50 núemros es " + suma);
	}

}
