package tarea.com.mvc.views;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SeriesPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public SeriesPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelButtons = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelButtons.getLayout();
		flowLayout.setHgap(35);
		panelButtons.setBorder(new EmptyBorder(25, 0, 25, 0));
		add(panelButtons, BorderLayout.SOUTH);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Yu Gothic", Font.BOLD, 22));
		panelButtons.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Yu Gothic", Font.BOLD, 22));
		panelButtons.add(btnEliminar);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(25, 25, 25, 0));
		FlowLayout flowLayout_1 = (FlowLayout) panel.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		add(panel, BorderLayout.NORTH);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo.setFont(new Font("Yu Gothic", Font.BOLD, 23));
		panel.add(lblTitulo);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 2));

	}

}
