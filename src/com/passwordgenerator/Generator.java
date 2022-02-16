package com.passwordgenerator;

import java.util.Random;

public class Generator {

	// OBJETO PARA LOS NUMEROS RANDOM
	private Random rd = new Random();
	// LONGITUD FINAL DE LA CONTRASEÑA
	@SuppressWarnings("unused")
	public static int LONGITUD_PASS = 12;

	// VARIABLES LOCALES PARA LA GENERACION DE CADA STRING (PRIMERO INT, LUEGO CHAR,
	// FINALMENTE STRING)
	private int entero;
	private char caracter;

	public static int cambiarLongitud(int valor) {
		Generator.LONGITUD_PASS = valor;
		
		return valor;
	}

	// METODO QUE DEVUELVE UN SIMBOLO RANDOM EN UN OBJETO STRING
	private String agregarCaracter() {
		boolean agregar = true;
		String clave = "";
		entero = rd.nextInt(122 - 48 + 1) + 48;
		if(entero == 94) {
			agregar = false;
		}
		else {
			agregar = true;
			caracter = (char) entero;
		}
		
		return clave += String.valueOf(caracter);
	}

	// METODO QUE GENERA UNA CONTRASEÑA RANDOM DE 12 CARACTERES
	// INCLUYENDO >>> MINUSCULAS, MAYUSCULAS, SIMBOLOS Y NUMEROS
	// Y DEVUELVE UN STRING CON LA CONTRASEÑA COMPLETA.
	public String generarContraseña(String password) {

		// INSTANCIAMOS LA CLASE PARA CREAR UN OBJETO Y UTILIZAR LOS METODOS PARA
		// GENERAR LOS CARACTERES
		Generator generador = new Generator();
		
		for (int i = 0 ; i < LONGITUD_PASS ; i++) {
			
			password += generador.agregarCaracter();
	
			if(i >= LONGITUD_PASS) {
				i = LONGITUD_PASS;
			}
		}
		

		return password;
	}
	
	

}
