package GUIS;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class JDIAINGRESO extends JDialog implements MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNombreDelCliente;
	private JTextField textField;
	private JButton btnIngresar;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDIAINGRESO dialog = new JDIAINGRESO();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDIAINGRESO() {
		setUndecorated(true);
		setTitle("INGRESO");
		setBounds(100, 100, 494, 322);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.setLocationRelativeTo(null);
		
		lblNombreDelCliente = new JLabel("NOMBRE DEL CLIENTE:");
		lblNombreDelCliente.setBounds(10, 11, 133, 24);
		contentPanel.add(lblNombreDelCliente);
		
		textField = new JTextField();
		textField.setBounds(162, 12, 133, 22);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBounds(335, 12, 96, 36);
		contentPanel.add(btnIngresar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 59, 458, 203);
		contentPanel.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		label = new JLabel("X");
		label.addMouseListener(this);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(465, 0, 19, 29);
		contentPanel.add(label);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
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
