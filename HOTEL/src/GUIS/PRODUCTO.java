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

public class PRODUCTO extends JDialog implements ActionListener, MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton_1;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PRODUCTO dialog = new PRODUCTO();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PRODUCTO() {
		setUndecorated(true);
		setBounds(100, 100, 718, 473);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.setLocationRelativeTo(null);
		{
			JLabel lblNewLabel = new JLabel("CODIGO:");
			lblNewLabel.setBounds(26, 22, 68, 20);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("DETALLE:");
			lblNewLabel_1.setBounds(26, 53, 56, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("STOCK:");
			lblNewLabel_2.setBounds(231, 50, 56, 20);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("PRECIO:");
			lblNewLabel_3.setBounds(231, 22, 56, 20);
			contentPanel.add(lblNewLabel_3);
		}
		{
			textField = new JTextField();
			textField.setBounds(104, 19, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(104, 50, 86, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(308, 22, 86, 20);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(308, 50, 86, 20);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("LISTAR");
			btnNewButton.setBounds(572, 18, 97, 35);
			contentPanel.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("ACEPTAR");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(308, 85, 97, 35);
			contentPanel.add(btnNewButton_1);
		}
		{
			JButton btnModificar = new JButton("MODIFICAR");
			btnModificar.setBounds(572, 64, 97, 35);
			contentPanel.add(btnModificar);
		}
		{
			JButton btnConsultar = new JButton("CONSULTAR");
			btnConsultar.setBounds(437, 64, 107, 35);
			contentPanel.add(btnConsultar);
		}
		{
			JButton btnEliminar = new JButton("ELIMINAR");
			btnEliminar.setBounds(437, 15, 97, 35);
			contentPanel.add(btnEliminar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 144, 682, 279);
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
			label.setBounds(689, 0, 19, 29);
			contentPanel.add(label);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			actionPerformedBtnNewButton_1(e);
		}
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
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
