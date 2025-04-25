package org.iesvdm.pronum;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntroducirNumerosTest {
	private final PrintStream standardOut = System.out;

	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@Before
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	void provideInput(String data) {
		ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
		System.setIn(testIn);
	}
	
	@Test
	public void cantidadNumeros() {
		//Given:
		provideInput("5\n12\n4\n5\n7\n-1\n");
		Scanner sc = new Scanner(System.in);
		
		//When:
		int cantNumeros = IntroducirNumeros.cantidadNumeros(sc);
		
		//Expect:
		Assert.assertEquals(5, cantNumeros,0.01);
		
	}
	
	@Test
	public void mediaImpares() {
		//Given:
		provideInput("1\n2\n3\n4\n5\n6\n7\n-1\n");
		Scanner sc = new Scanner(System.in);
		
		//When:
		double resultado = IntroducirNumeros.mediaImpares(sc);
		
		//Expect:
		Assert.assertEquals(4, resultado,0.01);
		
	}
	
	@Test
	public void numParMayor() {
		//Given:
		provideInput("2\n22\n12\n42\n8\n-1\n");
		Scanner sc = new Scanner(System.in);
		
		//When:
		int resultado = IntroducirNumeros.numParMayor(sc);

		//Expect:
		Assert.assertEquals(42, resultado);
		
	}
}
