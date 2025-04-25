package org.iesvdm.progiva;

import java.util.Scanner;

public class CalcularPrecioFinal {
	/*Escribe un programa que calcule el precio final de un producto según su  base imponible (precio antes de impuestos), el tipo de IVA aplicado 
	 * (general, reducido o superreducido) y el código promocional. Los tipos de IVA general,  reducido y superreducido son del 21%, 10% y 4% respectivamente.
	 * Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan respectivamente que no se aplica promoción, el precio se reduce a la mitad,
	   se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén tabulados.

     Ejemplo:
     Introduzca la base imponible: 25
     Introduzca el tipo de IVA (general, reducido o superreducido): reducido
     Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
     Base imponible        25.00
     IVA (10%)              2.50
     Precio con IVA        27.50
     Cód. promo. (mitad): -13.75
     TOTAL                 13.75
*/


	
	public static double introducirBase(Scanner sc) {
		System.out.println("Intoduce Base");
		double base = sc.nextDouble();
		return base;
	}
	
	public static double tipoIva(Scanner sc) throws Exception {
		System.out.println("Escribe tipo de Iva");
		String tipoIva = sc.next();
		double iva = 0;
		
		if(tipoIva.equalsIgnoreCase("general")) {
			iva = 21.0;
		}else if(tipoIva.equalsIgnoreCase("reducido")) {
			iva = 10.0;
		}else if(tipoIva.equalsIgnoreCase("superreducido")){
			iva = 4.0;
		}else {
			throw new Exception("ERROR");
		}
		return iva;
		
	}
	
	public static double introducirCodigo(Scanner sc,double base) throws Exception {
		System.out.println("¿Que tipo de promoción tiene?");
		String promo = sc.next();
		double reduccion = 0;
		
		if(promo.equals("nopro")) {
			System.out.println("No se aplica promoción");
		}else if(promo.equals("mitad")) {
			reduccion = introducirBase(sc)/2;
		}else if(promo.equals("meno5")) {
			reduccion = 5.0;
		}else if(promo.equalsIgnoreCase("5porc")){
			reduccion = base*5/100;
		}else {
			throw new Exception("ERROR");
		}
		
		return reduccion;
		
	}
	
	public static double calcularPrecio(Scanner sc) throws Exception {
		double base = introducirBase(sc);
		double iva = tipoIva(sc);
		double promo = introducirCodigo(sc,base);
		
		double precioFinal =base +((21*base)/100)-promo;
		return precioFinal;
		
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println(calcularPrecio(sc));

	}
}
