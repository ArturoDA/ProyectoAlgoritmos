package GUIS;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

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
	private JTextField txtCodigo;
	private JTextField textField_4;
	private JButton btnAceptar;
	private JButton btnListar;
	private JButton btnModificar;
	private JButton btnConsultar;
	private JButton btnEliminar;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel label;

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
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(298, 11, 86, 20);
		contentPanel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(296, 50, 86, 20);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);
		
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setBounds(295, 89, 89, 23);
		contentPanel.add(btnAceptar);
		
		btnListar = new JButton("ADICIONAR");
		btnListar.addActionListener(this);
		btnListar.setBounds(559, 7, 111, 28);
		contentPanel.add(btnListar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(559, 46, 111, 32);
		contentPanel.add(btnModificar);
		
		btnConsultar = new JButton("CONSULTAR");
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(559, 86, 111, 32);
		contentPanel.add(btnConsultar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(559, 129, 111, 32);
		contentPanel.add(btnEliminar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 188, 647, 240);
		contentPanel.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		label = new JLabel("X");
		label.addMouseListener(this);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(690, 0, 19, 29);
		contentPanel.add(label);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
		if (arg0.getSource() == btnConsultar) {
			actionPerformedButton(arg0);
		}
	}
	protected void actionPerformedButton(ActionEvent arg0) {
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == label) {
			mouseClickedLabel(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLabel(MouseEvent e) 
	{  dispose();
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
	}
}
/*Arturo Xulls*/