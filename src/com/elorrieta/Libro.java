package com.elorrieta;

public class Libro {
	private String Titulo;
	private String Codigo;
	
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public Libro(String titulo, String codigo) {
		super();
		Titulo = titulo;
		Codigo = codigo;
	}
	public Libro() {
		super();
		Titulo = "";
		Codigo = "";
	}
}
