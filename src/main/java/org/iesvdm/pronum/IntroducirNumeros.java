package org.iesvdm.pronum;

import java.util.Scanner;

public class IntroducirNumeros {

	public static int cantidadNumeros(Scanner sc) {
		System.out.println("Escriba un número (Introducir -1 para finalizar)");
		int num = sc.nextInt();
		int cont = 0;
		while (num >= 0) {
			cont++;
			System.out.println("Escriba un número (Introducir -1 para finalizar)");
			num = sc.nextInt();

		}
		return cont;
	}

	public static double mediaImpares(Scanner sc) {
		int cont = 0;
		int sumaImpares = 0;
		System.out.println("Escriba un número (Introducir -1 para finalizar)");
		int num = sc.nextInt();
		while (num >= 0) {
			if (num % 2 != 0) {
				cont++;
				sumaImpares += num;
			}
			System.out.println("Escriba un número (Introducir -1 para finalizar)");
			num = sc.nextInt();

		}
		double media = sumaImpares / cont;
		return media;
	}

	public static int numParMayor(Scanner sc) {
		int numParMayor = 0;
		System.out.println("Escriba un número (Introducir -1 para finalizar)");
		int n = sc.nextInt();
		
		while (n >= 0) {
			if (n % 2 == 0) {
				if (n > numParMayor) {
					numParMayor = n;
				}
			}
			System.out.println("Introduzca un número(negativo para parar): ");
			n = sc.nextInt();

		}
		return numParMayor;

	}
	
}

