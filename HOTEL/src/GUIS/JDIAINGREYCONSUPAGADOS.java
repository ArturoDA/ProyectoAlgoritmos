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

public class JDIAINGREYCONSUPAGADOS extends JDialog implements MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDIAINGREYCONSUPAGADOS dialog = new JDIAINGREYCONSUPAGADOS();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDIAINGREYCONSUPAGADOS() {
		setUndecorated(true);
		setTitle("INGRESOS Y CONSUMOS PAGADOS");
		setBounds(100, 100, 653, 360);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.setLocationRelativeTo(null);
		{
			JLabel lblCodIngreso = new JLabel("COD INGRESO:");
			lblCodIngreso.setBounds(10, 11, 106, 26);
			contentPanel.add(lblCodIngreso);
		}
		{
			textField = new JTextField();
			textField.setBounds(121, 14, 146, 23);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JButton btnMostrar = new JButton("MOSTRAR");
			btnMostrar.setBounds(429, 13, 93, 31);
			contentPanel.add(btnMostrar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 70, 617, 222);
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
			label.setBounds(624, 0, 19, 29);
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
