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

public class JDIAINGRESOSYCONSUMOS extends JDialog implements MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDIAINGRESOSYCONSUMOS dialog = new JDIAINGRESOSYCONSUMOS();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDIAINGRESOSYCONSUMOS() {
		setUndecorated(true);
		setTitle("INGRESOS Y CONSUMOS");
		setBounds(100, 100, 637, 333);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.setLocationRelativeTo(null);
		{
			JLabel lblCodIngreso = new JLabel("COD INGRESO:");
			lblCodIngreso.setBounds(10, 11, 102, 22);
			contentPanel.add(lblCodIngreso);
		}
		{
			textField = new JTextField();
			textField.setBounds(142, 12, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JButton btnBuscar = new JButton("BUSCAR");
			btnBuscar.setBounds(381, 11, 89, 23);
			contentPanel.add(btnBuscar);
		}
		{
			JButton btnPagar = new JButton("PAGAR");
			btnPagar.setBounds(505, 11, 89, 23);
			contentPanel.add(btnPagar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 70, 601, 213);
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
			label.setBounds(608, 0, 19, 29);
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
