package GUIS;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PRINCIPAL extends JFrame implements ActionListener {
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenu mnNewMenu_4;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_9;
	private JMenuItem mntmNewMenuItem_10;
	private JMenuItem mntmNewMenuItem_11;
	private JMenuItem mntmNewMenuItem_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PRINCIPAL frame = new PRINCIPAL();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PRINCIPAL() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setTitle("Gestionador Club de esparcimiento");
		setBounds(100, 100, 912, 602);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
	
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 912, 34);
		contentPane.add(menuBar);
		
		mnNewMenu = new JMenu("MANTENIMIENTO");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("SOCIO");
		mntmNewMenuItem.addActionListener(this);
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("PRODUCTO");
		mntmNewMenuItem_1.addActionListener(this);
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("BUNGALOW");
		mntmNewMenuItem_2.addActionListener(this);
		mnNewMenu.add(mntmNewMenuItem_2);
		
		mnNewMenu_1 = new JMenu("REGISTRO");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_3 = new JMenuItem("INGRESO");
		mntmNewMenuItem_3.addActionListener(this);
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		mntmNewMenuItem_4 = new JMenuItem("CONSUMO");
		mntmNewMenuItem_4.addActionListener(this);
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_5 = new JMenuItem("HOSPEDAJE");
		mntmNewMenuItem_5.addActionListener(this);
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		mnNewMenu_2 = new JMenu("PAGO");
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_6 = new JMenuItem("INGRESOS Y CONSUMOS");
		mntmNewMenuItem_6.addActionListener(this);
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		mntmNewMenuItem_7 = new JMenuItem("HOSPEDAJES");
		mntmNewMenuItem_7.addActionListener(this);
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		mnNewMenu_3 = new JMenu("REPORTE");
		menuBar.add(mnNewMenu_3);
		
		mntmNewMenuItem_8 = new JMenuItem("INGRESOS Y CONSUMOS PENDIENTES");
		mntmNewMenuItem_8.addActionListener(this);
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		mntmNewMenuItem_9 = new JMenuItem("INGRESOS Y CONSUMOS PAGADOS");
		mntmNewMenuItem_9.addActionListener(this);
		mnNewMenu_3.add(mntmNewMenuItem_9);
		
		mntmNewMenuItem_11 = new JMenuItem("HOSPEDAJES PENDIENTES");
		mntmNewMenuItem_11.addActionListener(this);
		mnNewMenu_3.add(mntmNewMenuItem_11);
		
		mntmNewMenuItem_10 = new JMenuItem("HOSPEDAJES PAGADOS");
		mntmNewMenuItem_10.addActionListener(this);
		mnNewMenu_3.add(mntmNewMenuItem_10);
		
		mnNewMenu_4 = new JMenu("ARCHIVO");
		mnNewMenu_4.addActionListener(this);
		menuBar.add(mnNewMenu_4);
		
		mntmNewMenuItem_12 = new JMenuItem("SALIR");
		mntmNewMenuItem_12.addActionListener(this);
		mnNewMenu_4.add(mntmNewMenuItem_12);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmNewMenuItem_2) {
			actionPerformedMntmNewMenuItem_2(arg0);
		}
		if (arg0.getSource() == mntmNewMenuItem_1) {
			actionPerformedMntmNewMenuItem_1(arg0);
		}
		if (arg0.getSource() == mntmNewMenuItem) {
			actionPerformedMntmNewMenuItem(arg0);
		}
		if (arg0.getSource() == mntmNewMenuItem_12) {
			actionPerformedMntmNewMenuItem_12(arg0);
		}
		if (arg0.getSource() == mnNewMenu_4) {
			actionPerformedMnNewMenu_4(arg0);
		}
		if (arg0.getSource() == mntmNewMenuItem_10) {
			actionPerformedMntmNewMenuItem_10(arg0);
		}
		if (arg0.getSource() == mntmNewMenuItem_11) {
			actionPerformedMntmNewMenuItem_11(arg0);
		}
		if (arg0.getSource() == mntmNewMenuItem_9) {
			actionPerformedMntmNewMenuItem_9(arg0);
		}
		if (arg0.getSource() == mntmNewMenuItem_8) {
			actionPerformedMntmNewMenuItem_8(arg0);
		}
		if (arg0.getSource() == mntmNewMenuItem_7) {
			actionPerformedMntmNewMenuItem_7(arg0);
		}
		if (arg0.getSource() == mntmNewMenuItem_6) {
			actionPerformedMntmNewMenuItem_6(arg0);
		}
		if (arg0.getSource() == mntmNewMenuItem_5) {
			actionPerformedMntmNewMenuItem_5(arg0);
		}
		if (arg0.getSource() == mntmNewMenuItem_4) {
			actionPerformedMntmNewMenuItem_4(arg0);
		}
		if (arg0.getSource() == mntmNewMenuItem_3) {
			actionPerformedMntmNewMenuItem_3(arg0);
		}
	}
	protected void actionPerformedMntmNewMenuItem_3(ActionEvent arg0) 
	{ JDIAINGRESO dialog = new JDIAINGRESO();
    dialog.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_4(ActionEvent arg0)
	{  JDIACONSUMO dialog = new JDIACONSUMO();
    dialog.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_5(ActionEvent arg0) 
	{  JDIAHOSPEDAJE dialog = new JDIAHOSPEDAJE();
    dialog.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_6(ActionEvent arg0) 
	{  JDIAINGRESOSYCONSUMOS dialog = new JDIAINGRESOSYCONSUMOS();
    dialog.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_7(ActionEvent arg0)
	{  JDIAHOSPEDAJES dialog = new JDIAHOSPEDAJES();
    dialog.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_8(ActionEvent arg0) 
	{  JDIAINGRESOYCONSUPENDIENTES dialog = new JDIAINGRESOYCONSUPENDIENTES();
    dialog.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_9(ActionEvent arg0) 
	{  JDIAINGREYCONSUPAGADOS dialog = new JDIAINGREYCONSUPAGADOS();
    dialog.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_11(ActionEvent arg0) 
	{  JDIAHOSPENDIENTES dialog = new JDIAHOSPENDIENTES();
    dialog.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_10(ActionEvent arg0)
	{  JDIAHOSPAGADOS dialog = new JDIAHOSPAGADOS();
    dialog.setVisible(true);
	}
	protected void actionPerformedMnNewMenu_4(ActionEvent arg0)
	{ 
	}
	protected void actionPerformedMntmNewMenuItem_12(ActionEvent arg0) 
	{ dispose();
	}
	protected void actionPerformedMntmNewMenuItem(ActionEvent arg0)
	{ SOCIO dialog = new SOCIO();
	dialog.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_1(ActionEvent arg0)
	{ PRODUCTO dialog = new PRODUCTO();
	dialog.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_2(ActionEvent arg0)
	{ BUNGALOW dialog = new BUNGALOW();
	dialog.setVisible(true);
	}
}
