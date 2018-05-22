package com.proguno.edu.co.dao.impl;

import java.util.ArrayList;

import com.proguno.edu.co.dao.UnidadMusicalDAO;
import com.proguno.edu.co.modelo.UnidadMusical;
import com.proguno.edu.co.persistencia.OperacionArchivo;

public class UnidadMusicalDAOImpl implements UnidadMusicalDAO {

	private OperacionArchivo op = new OperacionArchivo();
	
	private ArrayList<UnidadMusical> unMusical = new ArrayList<UnidadMusical>();

	public String guardar(ArrayList<UnidadMusical> unidadMusical) {
		return op.agregarRegistros(unidadMusical);
	}

	public UnidadMusical getUnidadMusical(int id) {
		return (UnidadMusical) unMusical.get(id);
	}

	public void modificar(UnidadMusical unidadMusical, int id) {
		unMusical.set(id, unidadMusical);
	}

	public void eliminar(int id) {
		unMusical.remove(id);
	}

	public ArrayList<UnidadMusical> list() {
		
		return op.leerRegistros();
	}

}
