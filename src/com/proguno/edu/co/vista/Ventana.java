package com.proguno.edu.co.vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.proguno.edu.co.controlador.Controlador;

public class Ventana extends JFrame implements ActionListener {
	private PanelInformacionGeneral panel;
	private PanelBotones botones;
	private Controlador controlador;

	public Ventana(Controlador inControlador) {

		super("App Definitiva");
		this.setSize(350, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(2, 1));

		controlador = inControlador;
		panel = new PanelInformacionGeneral(this);
		botones = new PanelBotones(this);

		this.add(panel);
		this.add(botones);

		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent evento) {

		if (evento.getActionCommand().equalsIgnoreCase("MOSTRAR")) {

			String mensaje = controlador.mostrarInformacion();
			JOptionPane.showMessageDialog(null, mensaje);

		} else if (evento.getActionCommand().equalsIgnoreCase("GRABAR")) {

			String mensaje = controlador.grabarEnArchivo();
			JOptionPane.showMessageDialog(null, mensaje);

		} else if (evento.getActionCommand().equalsIgnoreCase("GUARDAR")) {
			String mensaje = controlador.registrarUnidadMusical(Integer.parseInt(panel.getTxtId().getText()),
					panel.getTxtAlbum().getText(), panel.getTxtAutor().getText(), panel.getTxtFormato().getText());
			JOptionPane.showMessageDialog(null, mensaje);
		}

	}

	public PanelInformacionGeneral getPanel() {
		return panel;
	}

	public void setPanel(PanelInformacionGeneral panel) {
		this.panel = panel;
	}

	public PanelBotones getBotones() {
		return botones;
	}

	public void setBotones(PanelBotones botones) {
		this.botones = botones;
	}

}
