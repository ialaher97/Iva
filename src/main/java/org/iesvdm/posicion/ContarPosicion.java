package org.iesvdm.posicion;

import java.util.Scanner;

public class ContarPosicion {
	
	public static String escribirNumero(Scanner sc) {
		System.out.println("Introduce el número: ");
		String n = sc.next();
		return n;

	}

	public static char escribirDigito(Scanner sc) {
		System.out.println("Introduce el digito: ");
		String digito = sc.next();
		char digit = digito.charAt(0);
		return digit;
	}

	public static int contarPosicion(String n, char c) {
		int pos = 0;
		int cont = 0;
		boolean encontrado = false;
		while(cont<n.length() && !encontrado) {
			if(n.charAt(pos) == c) {
				encontrado = true;
			}else {
				cont++;
			}
			pos++;
		}
		return cont+1;
	}
}
