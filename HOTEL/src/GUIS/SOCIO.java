package GUIS;

import java.awt.BorderLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import Arreglos.ArregloSocio;
import Clases.Socio;

import java.awt.Color;

public class SOCIO extends JDialog implements ActionListener, MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtNombre;
	private JTextField txtDni;
	private JTextField txtApellido;
	private JTextField txtCodigoSocio;
	private JTextField txtTelefono;
	private JButton btnAceptar;
	private JButton btnAdicionar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JLabel label;
	private JScrollPane scrollPane;
	private JTable tblSocio;
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SOCIO dialog = new SOCIO();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SOCIO() {
		setUndecorated(true);
		setTitle("SOCIO");
		setBounds(100, 100, 719, 470);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.setLocationRelativeTo(null);
		
		lblNewLabel = new JLabel("NOMBRE:");
		lblNewLabel.setBounds(23, 11, 57, 14);
		contentPanel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("DNI:");
		lblNewLabel_1.setBounds(23, 50, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("APELLIDO:");
		lblNewLabel_2.setBounds(23, 86, 69, 20);
		contentPanel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("CODIGO:");
		lblNewLabel_3.setBounds(217, 14, 58, 14);
		contentPanel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("TELEFONO:");
		lblNewLabel_4.setBounds(217, 50, 69, 20);
		contentPanel.add(lblNewLabel_4);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setBounds(90, 8, 86, 20);
		contentPanel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setEditable(false);
		txtDni.setBounds(90, 47, 86, 20);
		contentPanel.add(txtDni);
		txtDni.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setBounds(90, 86, 86, 20);
		contentPanel.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtCodigoSocio = new JTextField();
		txtCodigoSocio.setEditable(false);
		txtCodigoSocio.setBounds(298, 11, 86, 20);
		contentPanel.add(txtCodigoSocio);
		txtCodigoSocio.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setEditable(false);
		txtTelefono.setBounds(296, 50, 86, 20);
		contentPanel.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setForeground(Color.BLACK);
		btnAceptar.setBounds(295, 89, 89, 23);
		contentPanel.add(btnAceptar);
		
		btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(559, 7, 111, 28);
		contentPanel.add(btnAdicionar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(559, 46, 111, 32);
		contentPanel.add(btnModificar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(559, 89, 111, 32);
		contentPanel.add(btnEliminar);
		
		label = new JLabel("X");
		label.addMouseListener(this);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(690, 0, 19, 29);
		contentPanel.add(label);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 131, 672, 326);
		contentPanel.add(scrollPane);
		
		tblSocio = new JTable();
		tblSocio.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblSocio);
		
		modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Teléfono");
        modelo.addColumn("DNI");
        tblSocio.setModel(modelo);
 
 
 
        modelo.setRowCount(0);
        Object[] fila = { 10, 20, 30, 40, 50 };
        modelo.addRow(fila);

        habilitarEntradas(false);
        ajustarAnchoColumnas();
        listar();
        editarFila();
	}
	//Declaración global
	ArregloSocio as = new ArregloSocio();
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnListar(arg0);
		}
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == label) {
			mouseClickedLabel(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
		if (arg0.getSource() == btnAceptar) {
			mouseEnteredBtnAceptar(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			mouseEnteredBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			mouseEnteredBtnModificar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			mouseEnteredBtnAdicionar(arg0);
		}
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedTblSocio(MouseEvent arg0) {
		habilitarEntradas(false);
		habilitarBotones(true);
		editarFila();
	}
	
	
	protected void mouseEnteredBtnAdicionar(MouseEvent arg0) {
		btnAdicionar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	protected void mouseEnteredBtnModificar(MouseEvent arg0) {
		btnModificar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	protected void mouseEnteredBtnEliminar(MouseEvent arg0) {
		btnEliminar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	protected void mouseEnteredBtnAceptar(MouseEvent arg0) {
		btnAceptar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	//Metodos tipo void (sin parametros)
	void ajustarAnchoColumnas() {
		TableColumnModel tcm = tblSocio.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(anchoColumna(20));
		tcm.getColumn(1).setPreferredWidth(anchoColumna(20));
		tcm.getColumn(2).setPreferredWidth(anchoColumna(20));
		tcm.getColumn(3).setPreferredWidth(anchoColumna(20));
		tcm.getColumn(4).setPreferredWidth(anchoColumna(20));
	}
	void listar() {
		int posFila = 0;
		if(modelo.getRowCount()>0)
			posFila= tblSocio.getSelectedRow();
		if(modelo.getRowCount() == as.tamaño() -1)
			posFila = as.tamaño() - 1;
		if(posFila == as.tamaño())
			posFila --;
		modelo.setRowCount(0);
		Socio p;
		for (int i=0; i<as.tamaño();i++) {
			p = as.obtener(i);
			Object[] fila = { p.getCodigoSocio(),
							p.getNombres(),
							p.getApellidos(),
							p.getTelefono(),
							p.getDni()};
			modelo.addRow(fila);
			}
			if(as.tamaño()>0)
				tblSocio.getSelectionModel().setSelectionInterval(posFila, posFila);
		}
	void editarFila() {
		if (as.tamaño()==0)
			limpieza();
		else {
			Socio s= as.obtener(tblSocio.getSelectedRow());
			txtCodigoSocio.setText("" + s.getCodigoSocio());
			txtNombre.setText(s.getNombres());;
			txtApellido.setText(s.getApellidos());
			txtTelefono.setText(s.getTelefono());
			txtDni.setText(s.getDni());
		}
	}
	void limpieza() {
		txtCodigoSocio.setText("" + as.codigoCorrelativo());
		txtNombre.setText("");;
		txtApellido.setText("");
		txtTelefono.setText("");
		txtDni.setText("");
	}
	//Metodos tipo void (con parametros)
	void mensaje (String s) {
		JOptionPane.showMessageDialog(this, s, "Información", 0);
	}
	void error(String s, JTextField txt) {
		mensaje(s);
		txt.setText("");
		txt.requestFocus();
	}
	void habilitarEntradas(boolean sino) {
		txtNombre.setEditable(sino);
		txtApellido.setEditable(sino);
		txtTelefono.setEditable(sino);
		txtDni.setEditable(sino);
	}
	void habilitarBotones(boolean sino) {
		btnAdicionar.setEnabled(sino);
		btnModificar.setEnabled(sino);
	}
//  Métodos que retornan valor (sin parámetros)
	int leerCodigoSocio() {
		return Integer.parseInt(txtCodigoSocio.getText().trim());
	}
	String leerNombres() {
		return txtNombre.getText().trim();
	}
	String leerApellidos() {
		return txtApellido.getText().trim();
	}
	String leerTelefono() {
		return txtTelefono.getText().trim();
	}
	String leerDni() {
		return txtDni.getText().trim();
	}
	//  Métodos que retornan valor (con parámetros)
	int anchoColumna(int porcentaje) {
		return porcentaje * scrollPane.getWidth() / 100;
	}
	int confirmar(String s) {
		return JOptionPane.showConfirmDialog(this, s, "Alerta", 0, 1, null);
	}
	
}

/*Arturo Xulls*/