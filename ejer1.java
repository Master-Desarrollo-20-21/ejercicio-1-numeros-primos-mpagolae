package escuela_it.poo;

public class Primos1 {
	public static void main(String[] args) {
		int i=0;
		int num=2;
		boolean esPrimo=false;
		int suma=0;
		while (i < 50) {
			esPrimo=true;
			for (int j = 2; j <= num-1; j++) {
				if (num%j==0) {
					esPrimo=false;
				}
			}
			if (esPrimo == true) {
				suma = suma + num;
				i++;
			}
			num++;
		}
		System.out.println("La suma de los 50 primeros números primos es " + suma);
	}

}
