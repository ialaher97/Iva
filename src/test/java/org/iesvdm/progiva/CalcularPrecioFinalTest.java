package org.iesvdm.progiva;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalcularPrecioFinalTest {
	
	
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
	public void introducirBase()throws Exception {
		 //Given:
		provideInput("80");
		Scanner sc = new Scanner(System.in);
		
		//When:
		Double base = CalcularPrecioFinal.introducirBase(sc);
		
		
		//Expect:
		Assert.assertEquals(80.0, base, 0.01);
	}
	@Test
	public void introducirBaseconError()throws Exception {
		 //Given:
		provideInput("a");
		Scanner sc = new Scanner(System.in);
		
		//When:
		try {
		Double base = CalcularPrecioFinal.introducirBase(sc);
		
		}catch (Exception e) {
		//Expect:
		Assert.assertEquals(null, e.getMessage());
		
		}
	}
	
	
	@Test
	public void tipoIva()throws Exception {
		 //Given:
		provideInput("general");
		Scanner sc = new Scanner(System.in);
		
		//When:
		Double iva = CalcularPrecioFinal.tipoIva(sc);
		
		
		//Expect:
		Assert.assertEquals(21.0, iva, 0.01);
	}
	@Test
	public void tipoIvaConError()throws Exception {
		 //Given:
		provideInput("general");
		Scanner sc = new Scanner(System.in);
		
		//When:
		try {
		Double iva = CalcularPrecioFinal.tipoIva(sc);
		
		}catch (Exception e) {
		//Expect:
		Assert.assertEquals("ERROR", e.getMessage());
		
		}
	}
	
	
	@Test
	public void introducirCodigo()throws Exception {
		 //Given:
		provideInput("5porc");
		Scanner sc = new Scanner(System.in);
		provideInput("50");
		Scanner sc1 = new Scanner(System.in);
		double base = CalcularPrecioFinal.introducirBase(sc1);
		
		//When:
		Double iva = CalcularPrecioFinal.introducirCodigo(sc,base);
		
		
		//Expect:
		Assert.assertEquals(2.5, iva, 0.01);
	}
	@Test
	public void introducirCodigoConError()throws Exception {
		 //Given:
		provideInput("5por");
		Scanner sc = new Scanner(System.in);
		provideInput("50");
		Scanner sc1 = new Scanner(System.in);
		double base = CalcularPrecioFinal.introducirBase(sc1);
		try {
		//When:
		Double iva = CalcularPrecioFinal.introducirCodigo(sc,base);
		
		}catch(Exception e) {
		//Expect:
		Assert.assertEquals("ERROR",e.getMessage() );
		}
	}
	

}

