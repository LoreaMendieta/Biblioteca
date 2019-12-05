package com.elorrieta;

import java.util.Scanner;

public class Biblios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio de Proyecto");
		System.out.println("Por favor, Intorduzca la operacion que quiera realizar:");
		System.out.println("A: Sacar un libro");
		System.out.println("B: Devolver un libro");
		System.out.println("S: Salir");
		System.out.println("");
		System.out.println("Seleccione una opcion valida:");
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		char opcion=sc.nextLine().toUpperCase().charAt(0);//Me quedo con la primera letra que haya introducido si mete AF me quedo con la A
	
		switch (opcion) {
		case 'A':
	
		break;
		case 'B':
			
			break;
		case 'S':
			
			break;
		default:
		break;
	} 
	}

}
