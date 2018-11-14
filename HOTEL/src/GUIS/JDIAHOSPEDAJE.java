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

public class JDIAHOSPEDAJE extends JDialog implements MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDIAHOSPEDAJE dialog = new JDIAHOSPEDAJE();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDIAHOSPEDAJE() {
		setUndecorated(true);
		setTitle("HOSPEDAJE");
		setBounds(100, 100, 571, 318);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.setLocationRelativeTo(null);
		{
			JLabel lblNumeroDeBunglow = new JLabel("NUMERO DE BUNGLOW:");
			lblNumeroDeBunglow.setBounds(10, 11, 152, 25);
			contentPanel.add(lblNumeroDeBunglow);
		}
		{
			textField = new JTextField();
			textField.setBounds(172, 13, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblCodCliente = new JLabel("COD INGRESO:");
			lblCodCliente.setBounds(10, 49, 120, 20);
			contentPanel.add(lblCodCliente);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(172, 49, 86, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JButton btnReservar = new JButton("RESERVAR");
			btnReservar.setBounds(404, 12, 100, 39);
			contentPanel.add(btnReservar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 94, 535, 174);
			contentPanel.add(scrollPane);
			{
				JTextArea textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			}
		}
		{
			label = new JLabel("X");
			label.addMouseListener(this);
			label.setFont(new Font("Tahoma", Font.PLAIN, 18));
			label.setBounds(542, 0, 19, 29);
			contentPanel.add(label);
		}
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
}
