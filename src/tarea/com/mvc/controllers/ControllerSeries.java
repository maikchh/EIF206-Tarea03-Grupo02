package tarea.com.mvc.controllers;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import tarea.com.mvc.models.Genero;
import tarea.com.mvc.models.Serie;
import tarea.com.mvc.models.dao.DAOSerie;
import tarea.com.mvc.views.SeriesPanel;

public class ControllerSeries extends Functions implements Controller<Serie>{

	private ControllerPrincipal cp;
	private DAOSerie dao;

	public ControllerSeries(ControllerPrincipal cp) {
		this.cp=cp;
		this.dao = new DAOSerie();

	}

	@Override
	public void index() {
		calculate();
		loadComboBox();

		//paso 1 borrar lo viejo
		cp.vp.panelSeries.removeAll();

		// paso 2 agregar elemntos
		ArrayList<Serie> list = dao.all();

		for(Serie item: list) {

			SeriesPanel v = new SeriesPanel();

			v.lblTitulo.setText(item.getTitulo());
			v.lblGenero.setText(cp.cg.dao.find(item.getIdGenero()).getNombre());
			v.lblTemporadas.setText(item.getTemporadas() + "");
			v.lblCalificacion.setText(item.getCalificacion() + "");

			v.btnEditar.addActionListener(e->{
				edit2(v, item.getId());
			});
			v.btnEliminar.addActionListener(e->{
				destroy(item.getId());
			});
			cp.vp.panelSeries.add(v);
		}

		//paso 3 refrescar la vista
		cp.vp.panelSeries.repaint();
		cp.vp.panelSeries.revalidate();

		

		this.cp.vp.btnNuevo.addActionListener(e->{
			create();
		});
	}

	@Override
	public void create() {
		String titulo = this.cp.vp.txtTitulo.getText();
		String genero = this.cp.vp.cbGenero.getSelectedItem().toString();
		int temporadas = Integer.parseInt(this.cp.vp.textTemporadas.getText());
		double calificacion = Double.parseDouble(this.cp.vp.textCalificacion.getText());

		Serie newSerie = new Serie(titulo, temporadas, calificacion, cp.cg.findGenderById(genero).getId());

		if(!titulo.trim().isEmpty() && temporadas > 0 && genero != null) {
			store(newSerie);
		}
		index();
	}

	
	public void edit2(SeriesPanel sp , int id) {
		Serie item = dao.find(id);

		this.cp.vp.txtTitulo.setText(item.getTitulo());
		this.cp.vp.cbGenero.setSelectedItem(cp.cg.dao.find(item.getIdGenero()).getNombre());
		this.cp.vp.textCalificacion.setText(item.getCalificacion() + "");
		this.cp.vp.textTemporadas.setText(item.getTemporadas() + "");

		this.cp.vp.btnGuardar.addActionListener(e->{
			String titulo = this.cp.vp.txtTitulo.getText();
			String genero = this.cp.vp.cbGenero.getSelectedItem().toString();
			int temporadas = Integer.parseInt(this.cp.vp.textTemporadas.getText());
			double calificacion = Double.parseDouble(this.cp.vp.textCalificacion.getText());
			
			Serie updatedSerie = new Serie(titulo, temporadas, calificacion, cp.cg.findGenderById(genero).getId());
			
			if(!titulo.trim().isEmpty() && temporadas > 0 && genero != null) {
				update(updatedSerie, id);
			}
			
			index();
			
		});
	}
	
	@Override
	public void edit(int id) {
		return;
	}

	@Override
	public void store(Serie item) {
		if(dao.store(item)) {

			JOptionPane.showMessageDialog(null, "Se agrego el registro!");
		}else {
			JOptionPane.showMessageDialog(null, "ERROR AL CREAR");
		}

	}

	@Override
	public void update(Serie item, int id) {

		if(dao.update(item, id)) {
			JOptionPane.showMessageDialog(null, "Registro Actualizado!");
			index();
		}else {
			JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
		}
	}

	@Override
	public void destroy(int id) {
		if(dao.destroy(id)) {
			JOptionPane.showMessageDialog(null, "Registro eliminado!");
			index();
		}else {
			JOptionPane.showMessageDialog(null, "ERROR");
		}

	}

	public void loadComboBox() {
		this.cp.vp.cbGenero.removeAll();

		ArrayList<Genero> list = cp.cg.getListGender();

		for(Genero g : list) {
			this.cp.vp.cbGenero.addItem(g.getNombre());
		}
	}

	public void calculate() {
		ArrayList<Serie> list = dao.all();

		int size = list.size();
		double addition = 0;

		for(Serie s : list) {
			addition+= s.getCalificacion();
		}
		double result = addition / size;

		this.cp.vp.lblCantidad.setText(size + "");
		this.cp.vp.lblCalificacion.setText(Math.round(result * 100.0) / 100.0 + "");
	}
}
