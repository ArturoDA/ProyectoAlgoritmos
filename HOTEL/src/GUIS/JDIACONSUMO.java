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

public class JDIACONSUMO extends JDialog implements MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDIACONSUMO dialog = new JDIACONSUMO();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDIACONSUMO() {
		setUndecorated(true);
		setTitle("CONSUMO");
		setBounds(100, 100, 580, 362);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.setLocationRelativeTo(null);
		{
			JLabel lblCodCliente = new JLabel("COD INGRESO:");
			lblCodCliente.setBounds(10, 23, 92, 22);
			contentPanel.add(lblCodCliente);
		}
		{
			textField = new JTextField();
			textField.setBounds(114, 24, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JButton btnBuscar = new JButton("BUSCAR");
			btnBuscar.setBounds(322, 23, 89, 23);
			contentPanel.add(btnBuscar);
		}
		{
			JLabel lblNewLabel = new JLabel("PRODUCTO1:");
			lblNewLabel.setBounds(10, 55, 86, 23);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("PRODUCTO2:");
			lblNewLabel_1.setBounds(10, 80, 92, 29);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(114, 55, 86, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(114, 84, 86, 20);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JButton btnAgregar = new JButton("AGREGAR");
			btnAgregar.setBounds(439, 23, 89, 23);
			contentPanel.add(btnAgregar);
		}
		{
			JButton btnQuitar = new JButton("QUITAR");
			btnQuitar.setBounds(439, 55, 89, 23);
			contentPanel.add(btnQuitar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(20, 120, 534, 192);
			contentPanel.add(scrollPane);
			{
				JTextArea textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			}
		}
		{
			JButton btnGuardar = new JButton("GUARDAR");
			btnGuardar.setBounds(322, 55, 100, 33);
			contentPanel.add(btnGuardar);
		}
		{
			lblNewLabel_2 = new JLabel("X");
			lblNewLabel_2.addMouseListener(this);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_2.setBounds(547, 0, 23, 33);
			contentPanel.add(lblNewLabel_2);
		}
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblNewLabel_2) {
			mouseClickedLblNewLabel_2(e);
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
	protected void mouseClickedLblNewLabel_2(MouseEvent e)
	{ dispose();
	}
}
