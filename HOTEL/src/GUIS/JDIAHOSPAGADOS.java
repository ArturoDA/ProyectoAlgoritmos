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

public class JDIAHOSPAGADOS extends JDialog implements MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JLabel lblX;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDIAHOSPAGADOS dialog = new JDIAHOSPAGADOS();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDIAHOSPAGADOS() {
		setUndecorated(true);
		setTitle("HISPEDAJES PAGADOS");
		setBounds(100, 100, 769, 373);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setLocationRelativeTo(null);
		{
			JLabel lblCodIngreso = new JLabel("COD INGRESO: ");
			lblCodIngreso.setBounds(10, 11, 101, 29);
			contentPanel.add(lblCodIngreso);
		}
		{
			textField = new JTextField();
			textField.setBounds(125, 15, 133, 29);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JButton btnMostrar = new JButton("MOSTRAR");
			btnMostrar.setBounds(512, 14, 101, 29);
			contentPanel.add(btnMostrar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 68, 733, 255);
			contentPanel.add(scrollPane);
			{
				JTextArea textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			}
		}
		{
			lblX = new JLabel("X");
			lblX.addMouseListener(this);
			lblX.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblX.setBounds(740, 0, 19, 29);
			contentPanel.add(lblX);
		}
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblX) {
			mouseClickedLblX(e);
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
	protected void mouseClickedLblX(MouseEvent e) 
	{  dispose();
	}
}
