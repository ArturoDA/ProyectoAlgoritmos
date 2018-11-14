package GUIS;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class BUNGALOW extends JDialog implements MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblX;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BUNGALOW dialog = new BUNGALOW();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BUNGALOW() {
		setUndecorated(true);
		setBounds(100, 100, 716, 477);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.setLocationRelativeTo(null);
		{
			JLabel lblNewLabel = new JLabel("CODIGO:");
			lblNewLabel.setBounds(29, 11, 56, 21);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("ESTADO:");
			lblNewLabel_1.setBounds(29, 43, 56, 25);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField = new JTextField();
			textField.setBounds(95, 11, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(95, 45, 86, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JButton btnAceptar = new JButton("ACEPTAR");
			btnAceptar.setBounds(231, 10, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			JButton btnNewButton = new JButton("LISTAR");
			btnNewButton.setBounds(363, 10, 99, 35);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnModificar = new JButton("MODIFICAR");
			btnModificar.setBounds(506, 10, 99, 35);
			contentPanel.add(btnModificar);
		}
		{
			JButton btnConsultar = new JButton("CONSULTAR");
			btnConsultar.setBounds(363, 56, 109, 35);
			contentPanel.add(btnConsultar);
		}
		{
			JButton btnEliminar = new JButton("ELIMINAR");
			btnEliminar.setBounds(506, 56, 99, 35);
			contentPanel.add(btnEliminar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 144, 680, 283);
			contentPanel.add(scrollPane);
			{
				JTextArea textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			}
		}
		{
			lblX = new JLabel("x");
			lblX.addMouseListener(this);
			lblX.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblX.setBounds(663, 14, 27, 31);
			contentPanel.add(lblX);
		}
	}

	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == lblX) {
			mouseClickedLblX(arg0);
		}
	}
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void mouseClickedLblX(MouseEvent arg0) {
		dispose();
	}
}
// Julio