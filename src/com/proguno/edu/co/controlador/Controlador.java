package com.proguno.edu.co.controlador;

import java.util.ArrayList;

import com.proguno.edu.co.dao.UnidadMusicalDAO;
import com.proguno.edu.co.dao.impl.UnidadMusicalDAOImpl;
import com.proguno.edu.co.modelo.UnidadMusical;
import com.proguno.edu.co.persistencia.OperacionArchivo;
import com.proguno.edu.co.vista.Ventana;

public class Controlador {

	//private UnidadMusicalDAO unMusicalDao;
	private Ventana ventana;
	private OperacionArchivo opArchivo;

	ArrayList<UnidadMusical> listaUnidadMusical;

	public Controlador() {

		// this.unMusicalDao= new UnidadMusicalDAO();
		this.ventana = new Ventana(this);
		this.listaUnidadMusical = new ArrayList<UnidadMusical>();
		this.opArchivo = new OperacionArchivo();
	}

	public String mostrarInformacion() { // Obtiene la
											// información desde el
		// archivo
		UnidadMusicalDAO dao = new UnidadMusicalDAOImpl();

		listaUnidadMusical = dao.list();

		String resultado = "";
		for (int k = 0; k < this.listaUnidadMusical.size(); k++) {
			resultado += this.listaUnidadMusical.get(k).getNombreAlbum() + this.listaUnidadMusical.get(k).getAutor()
					+ "\n";
		}

		return resultado;
	}

	public String grabarEnArchivo() { // Obtiene la información desde el
										// ArrayList
										// y graba en el archivo
		UnidadMusicalDAO dao = new UnidadMusicalDAOImpl();

		String mensaje = dao.guardar(listaUnidadMusical);

		return mensaje;

	}

	public String registrarUnidadMusical(int pId, String pAlbum, String pAutor, String pFormato) {
		UnidadMusical temp = new UnidadMusical(pId, pAlbum, pAutor, pFormato);
		listaUnidadMusical.add(temp);
		return "Se agregó un registro";

	}

}
