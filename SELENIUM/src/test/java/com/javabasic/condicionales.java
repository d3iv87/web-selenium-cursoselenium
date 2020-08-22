package com.javabasic;

public class condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int velocidad=60;
//		int limitevelocidad=70;
//		boolean highway = false;
//		
//		//if (velocidad>limitevelocidad) {
//			//System.out.println("multa");
//			
//		//}else {
//		//		System.out.println("no hay multa");
//			//}
//		
//		if (highway==true) {
//			System.out.println("vamos en la highway");
//			
//			limitevelocidad=100;
//			
//			if(velocidad>limitevelocidad) {
//				System.out.println("multa!!");
//			}else {
//				System.out.println("vamos a velocidad adecuada");
//		}	
//		} else if (velocidad>limitevelocidad) {
//			System.out.println("vamos en la callle y a exceso de velocidad  multa!!");
//		
//		
//		}else {
//			System.out.println("vas en una calle y a una velocidad adecuada");
//	}
		
		int temperatura=35;
		switch(temperatura) {
		case 10:
			System.out.println("frio");
			break;
		case 20:
		System.out.println("agradable");
		break;
		case 30:
		System.out.println("calor");
		break;
		case 40:
		System.out.println("estamos en el desierto");
		break;
		default:
			System.out.println("da igual");
			break;
			
		
		}
	}
}


