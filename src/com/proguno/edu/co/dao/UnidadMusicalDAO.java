package com.proguno.edu.co.dao;

import java.util.ArrayList;

import com.proguno.edu.co.modelo.UnidadMusical;

public interface UnidadMusicalDAO {

	public String guardar(ArrayList<UnidadMusical> unidadMusical);

	public UnidadMusical getUnidadMusical(int id);

	public ArrayList<UnidadMusical> list();

	public void eliminar(int id);

	public void modificar(UnidadMusical unidadMusical, int id);

}