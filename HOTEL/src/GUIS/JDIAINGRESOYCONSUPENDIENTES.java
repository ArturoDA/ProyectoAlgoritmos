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

public class JDIAINGRESOYCONSUPENDIENTES extends JDialog implements MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDIAINGRESOYCONSUPENDIENTES dialog = new JDIAINGRESOYCONSUPENDIENTES();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDIAINGRESOYCONSUPENDIENTES() {
		setUndecorated(true);
		setTitle("INGRESOS Y CONSUMOS PENDIENTES");
		setBounds(100, 100, 683, 317);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.setLocationRelativeTo(null);
		{
			JLabel lblCodIngreso = new JLabel("COD INGRESO:");
			lblCodIngreso.setBounds(10, 11, 114, 26);
			contentPanel.add(lblCodIngreso);
		}
		{
			textField = new JTextField();
			textField.setBounds(147, 14, 104, 23);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JButton btnMostrar = new JButton("MOSTRAR");
			btnMostrar.setBounds(376, 11, 95, 25);
			contentPanel.add(btnMostrar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(20, 48, 637, 219);
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
			label.setBounds(654, 0, 19, 29);
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
