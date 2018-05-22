package com.proguno.edu.co.modelo;

import java.io.Serializable;

public class UnidadMusical implements Serializable {

	private int id;
	private String nombreAlbum;
	private String autor;
	private String formato; // CD - DVD

	public UnidadMusical() {
	}

	public UnidadMusical(int id, String nombreAlbum, String autor, String formato) {
		this.id = id;
		this.nombreAlbum = nombreAlbum;
		this.autor = autor;
		this.formato = formato;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreAlbum() {
		return nombreAlbum;
	}

	public void setNombreAlbum(String nombreAlbum) {
		this.nombreAlbum = nombreAlbum;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

}
