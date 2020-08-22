package com.javabasic;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String []nombres= new String[4];
//		nombres[0]="Ricardo";
//		nombres[1]="Ivan";
//		nombres[2]="Pepe";
//		nombres[3]="Toño";
//		
//		System.out.println(nombres[1]);
		
		
		String[][]persona = new String [4][4];
		persona[0][0]="Ana";
		persona[0][1]="Tester Jr";
		persona[1][0]="Bryan";
		persona[1][1]="Tester SR";
		persona[2][0]="carlos";
		persona[2][1]="Tester SR";
		persona[3][0]="cristian";
		persona[3][1]="Tester SR";
		getNombreRol(persona);
		
	}
	
	public static void getNombreRol(String [][]persona) {
		System.out.println("el nombre es: "+persona[2][0]+" y su rol es: " + persona[2][1]);
	}
	

}
