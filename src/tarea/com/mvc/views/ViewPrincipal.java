package tarea.com.mvc.views;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class ViewPrincipal extends JFrame {

	public  JPanel contentPane;
	public  JLabel lblTitulo;
	public JLabel lblCalificacion;
	public JTextField txtTitulo;
	public JTextField textTemporadas;
	public JTextField textCalificacion;
	public JPanel panelSeries;
	public JLabel lblCantidad;
	public JComboBox cbGenero;

	public ViewPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 649);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		lblTitulo = new JLabel("Titulo");
		lblTitulo.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		panel.add(lblTitulo);
		
		JPanel panelRegistros = new JPanel();
		panelRegistros.setBorder(new EmptyBorder(35, 0, 35, 0));
		contentPane.add(panelRegistros, BorderLayout.SOUTH);
		panelRegistros.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panelRegistros.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblPromedioCalificaciones = new JLabel("Promedio Calificaciones: ");
		lblPromedioCalificaciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblPromedioCalificaciones.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		panel_2.add(lblPromedioCalificaciones);
		
		lblCalificacion = new JLabel("0.0");
		lblCalificacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalificacion.setFont(new Font("Yu Gothic", Font.BOLD, 23));
		panel_2.add(lblCalificacion);
		
		JPanel panel_1 = new JPanel();
		panelRegistros.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblSeriesRegistradas = new JLabel("Series Registradas");
		lblSeriesRegistradas.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeriesRegistradas.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		panel_1.add(lblSeriesRegistradas);
		
		lblCantidad = new JLabel("0\r\n");
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setFont(new Font("Yu Gothic", Font.BOLD, 21));
		panel_1.add(lblCantidad);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panelData = new JPanel();
		panelData.setBorder(new EmptyBorder(35, 0, 35, 0));
		panel_3.add(panelData, BorderLayout.NORTH);
		panelData.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(0, 25, 0, 25));
		panelData.add(panel_5);
		panel_5.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel lblTitulo_1 = new JLabel("Titulo");
		lblTitulo_1.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		panel_5.add(lblTitulo_1);
		
		txtTitulo = new JTextField();
		txtTitulo.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		txtTitulo.setText("\r\n");
		panel_5.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblTemporadas = new JLabel("Temporadas");
		lblTemporadas.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		panel_5.add(lblTemporadas);
		
		textTemporadas = new JTextField();
		textTemporadas.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		panel_5.add(textTemporadas);
		textTemporadas.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panelData.add(panel_6);
		panel_6.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		panel_6.add(lblGenero);
		
		cbGenero = new JComboBox();
		cbGenero.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		panel_6.add(cbGenero);
		
		JLabel lblCalificacion_1 = new JLabel("Calificacion (0-10)");
		lblCalificacion_1.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		panel_6.add(lblCalificacion_1);
		
		textCalificacion = new JTextField();
		panel_6.add(textCalificacion);
		textCalificacion.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panelButtons = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelButtons.getLayout();
		flowLayout.setHgap(20);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panelButtons.setBorder(new EmptyBorder(20, 0, 20, 0));
		panel_4.add(panelButtons, BorderLayout.NORTH);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		panelButtons.add(btnGuardar);
		
		JButton btnNuevo = new JButton("+ Nuevo");
		btnNuevo.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		panelButtons.add(btnNuevo);
		
		panelSeries = new JPanel();
		panel_4.add(panelSeries, BorderLayout.CENTER);
	}

	
	public void init() {
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setTitle("Sistema Gestor de Series");
	}
	
	
}
