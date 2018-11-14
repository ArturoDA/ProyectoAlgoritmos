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

public class JDIAHOSPEDAJES extends JDialog implements MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDIAHOSPEDAJES dialog = new JDIAHOSPEDAJES();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDIAHOSPEDAJES() {
		setUndecorated(true);
		setTitle("HOSPEDAJES");
		setBounds(100, 100, 633, 318);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.setLocationRelativeTo(null);
		{
			JLabel lblCodHospedaje = new JLabel("COD HOSPEDAJE");
			lblCodHospedaje.setBounds(10, 11, 115, 22);
			contentPanel.add(lblCodHospedaje);
		}
		{
			textField = new JTextField();
			textField.setBounds(135, 12, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JButton btnBuscar = new JButton("BUSCAR");
			btnBuscar.setBounds(416, 11, 95, 23);
			contentPanel.add(btnBuscar);
		}
		{
			JButton btnPagar = new JButton("PAGAR");
			btnPagar.setBounds(416, 39, 95, 23);
			contentPanel.add(btnPagar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 72, 597, 196);
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
			label.setBounds(604, 4, 19, 29);
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
