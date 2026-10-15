package tarea.com.mvc.views;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.intellijthemes.FlatCobalt2IJTheme;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SeriesPanel extends JPanel {
	
	public JLabel lblTitulo;
	public JLabel lblGenero;
	public JLabel lblTemporadas;
	public JLabel lblCalificacion;
	public JButton btnEditar;
	public JButton btnEliminar;

	/**
	 * Create the panel.
	 */
	public SeriesPanel() {
		setLayout(new BorderLayout(0, 0));
		
		 new FlatCobalt2IJTheme().setup();
		 
		JPanel panelButtons = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelButtons.getLayout();
		flowLayout.setHgap(35);
		panelButtons.setBorder(new EmptyBorder(25, 0, 25, 0));
		add(panelButtons, BorderLayout.SOUTH);
		
		btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Yu Gothic", Font.BOLD, 22));
		panelButtons.add(btnEditar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Yu Gothic", Font.BOLD, 22));
		panelButtons.add(btnEliminar);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(25, 25, 25, 0));
		FlowLayout flowLayout_1 = (FlowLayout) panel.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		add(panel, BorderLayout.NORTH);
		
		lblTitulo = new JLabel("Titulo");
		lblTitulo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo.setFont(new Font("Yu Gothic", Font.BOLD, 27));
		panel.add(lblTitulo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 50, 0, 50));
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(3, 2, 0, 2));
		
		JLabel lbl1 = new JLabel("Genero: ");
		lbl1.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lbl1);
		
		lblGenero = new JLabel("default");
		lblGenero.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		panel_1.add(lblGenero);
		
		JLabel lblFgf = new JLabel("Temporadas:\r\n\r\n");
		lblFgf.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		lblFgf.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblFgf);
		
		lblTemporadas = new JLabel("0\r\n");
		lblTemporadas.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		panel_1.add(lblTemporadas);
		
		JLabel lblGbtbtb = new JLabel("Calificacion:\r\n");
		lblGbtbtb.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		lblGbtbtb.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblGbtbtb);
		
		lblCalificacion = new JLabel("0\r\n");
		lblCalificacion.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		panel_1.add(lblCalificacion);

	}

}
