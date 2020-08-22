package com.javabasic;

public class Tickets {
	int precioadulto,edad;
	double precionino,precioestudiante;
	boolean estudiante= false;
	String costo;
	
	public Tickets(int precionormal,int edadpersona, boolean credencialestudiante) {
		
		precioadulto=precionormal;
		precionino=precionormal * (.85);
		precioestudiante= precionormal * (.5);
		costo="Precio Normal";
		edad= edadpersona;
		estudiante=credencialestudiante;
				
		
	}
	
	
	/**************************************************METODO*/
	
	public void costoDia() {
		
		System.out.println("el costo tiket : "+ costo);
	}
	
	public void precioAdulto() {
		System.out.println("tiket adulto : $ " +precioadulto);
		
	}
	public void precioNino() {
		System.out.println("tiket estudiante : $ " +precionino);
		
	}
	
	public void precioEstudiante() {
		System.out.println("tiket estudiante : $ " +precioestudiante);
		
	}
	
	public void verificarticket() {
		if (estudiante==true) {
			System.out.println("eres un ESTUDIANTE el precio de su tiket es : $" + precioestudiante);
		} else if (edad>18) {
			
			System.out.println("eres un adulto el precio de tu tiket es : $ " +precioadulto);
		}else {
			System.out.println("eres un adulto el precio de tu tiket es : $ " +precionino);
			
		}
	}
	
	
	/**********************************************************************************************SOBRECARGA**/
	
	public double sumarTiket() {
		double suma = precioadulto + precionino;
		System.out.println(suma);
		return suma;
		
	}
	
	
	public double sumarTiket(int descuento) {
		double suma = precioadulto + precionino - descuento;
		System.out.println(suma);
		return suma;
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tickets tickets=new Tickets (100,19,true);
		
		tickets.costoDia();
		tickets.precioAdulto();
		tickets.precioNino();
		tickets.precioEstudiante();
		
		tickets.sumarTiket(30);
		tickets.sumarTiket();
		
		
	}

}
