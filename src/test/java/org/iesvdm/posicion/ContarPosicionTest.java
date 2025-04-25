package org.iesvdm.posicion;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.junit.Test;

import junit.framework.Assert;

public class ContarPosicionTest {

		void provideInput(String data) {
		    ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
		    System.setIn(testIn);
		}
		
		
		@Test
		public void InsertarNumero() {
			//Given:
			provideInput("85432");
			Scanner sc = new Scanner(System.in);
			
			//When
			String numero = ContarPosicion.escribirNumero(sc);
			
			//Expect:
			Assert.assertEquals("85432",numero);
		}
		
		@Test
		public void buscarDigito() {
			//Given:
			provideInput("4");
			Scanner sc = new Scanner(System.in);
			
			//When
			char c = ContarPosicion.escribirDigito(sc);
			//Expect
			Assert.assertEquals('4', c);
		}
		
		@Test
		public void contarDigito() {
			//Given
			provideInput("85432\n5\n");
			Scanner sc = new Scanner(System.in);
			
			//When
			String numero = ContarPosicion.escribirNumero(sc);
			char digito = ContarPosicion.escribirDigito(sc);
			
			//Expect
			int cont= ContarPosicion.contarPosicion(numero, digito);
			
			Assert.assertEquals(2, cont);
		}
	}

