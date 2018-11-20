package GUIS;

import Libreria.Lib;
import Clases.Bungalow;
import Arreglos.ArregloBungalow;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;

public class BUNGALOW extends JDialog implements MouseListener, ActionListener, KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNumeroBungalow;
	private JLabel lblX;
	private JLabel lblCategoria;
	private JComboBox<String> CBOESTADO;
	private JComboBox<String> CBOCATEGORIA;
	private JScrollPane scrollPane;
	private JLabel lblPrecio;
	private JTextField TXTPRECIO;
	private JTable tblBungalow;
	private DefaultTableModel modelo;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
		try {
			BUNGALOW dialog = new BUNGALOW();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		});
	}

	/**
	 * Create the dialog.
	 */
	public BUNGALOW() {
		setUndecorated(true);
		setBounds(100, 100, 716, 477);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.setLocationRelativeTo(null);
		{
		    JLabel lblNewLabel = new JLabel("CODIGO:");
			lblNewLabel.setBounds(29, 11, 56, 21);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("ESTADO:");
			lblNewLabel_1.setBounds(29, 43, 56, 25);
			contentPanel.add(lblNewLabel_1);
		}
		{
		     txtNumeroBungalow = new JTextField();
			txtNumeroBungalow.setBounds(95, 11, 86, 20);
			contentPanel.add(txtNumeroBungalow);
			txtNumeroBungalow.setColumns(10);
		}
		{
			btnAceptar = new JButton("ACEPTAR");
			btnAceptar.addMouseListener(this);
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(231, 10, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnNewButton = new JButton("LISTAR");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(363, 10, 99, 35);
			contentPanel.add(btnNewButton);
		}
		{
			btnModificar = new JButton("MODIFICAR");
			btnModificar.addMouseListener(this);
			btnModificar.addActionListener(this);
			btnModificar.setBounds(506, 10, 99, 35);
			contentPanel.add(btnModificar);
		}
		{
			btnConsultar = new JButton("CONSULTAR");
			btnConsultar.addActionListener(this);
			btnConsultar.setBounds(363, 56, 109, 35);
			contentPanel.add(btnConsultar);
		}
		{
			btnEliminar = new JButton("ELIMINAR");
			btnEliminar.addMouseListener(this);
			btnEliminar.addActionListener(this);
			btnEliminar.setBounds(506, 56, 99, 35);
			contentPanel.add(btnEliminar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 144, 680, 283);
			contentPanel.add(scrollPane);
			
			tblBungalow = new JTable();
			tblBungalow.addMouseListener(this);
			tblBungalow.addKeyListener(this);				
			tblBungalow.setFillsViewportHeight(true);
			scrollPane.setViewportView(tblBungalow);
		}
		{
			lblX = new JLabel("x");
			lblX.addMouseListener(this);
			lblX.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblX.setBounds(663, 14, 27, 31);
			contentPanel.add(lblX);
		}
		
		lblCategoria = new JLabel("CATEGORIA: ");
		lblCategoria.setBounds(24, 77, 66, 21);
		contentPanel.add(lblCategoria);
		
		CBOESTADO = new JComboBox <String>();
		CBOESTADO.setEnabled(false);
		CBOESTADO.setModel(new DefaultComboBoxModel <String> (Lib.estadosBungalowt));
		CBOESTADO.setBounds(95, 45, 89, 23);
		contentPanel.add(CBOESTADO);
		
		CBOCATEGORIA = new JComboBox <String>();
		CBOCATEGORIA.setModel(new DefaultComboBoxModel <String>(Lib.categoriasBungalow));
		CBOCATEGORIA.addActionListener(this);
		CBOCATEGORIA.setBounds(95, 77, 89, 21);
		contentPanel.add(CBOCATEGORIA);
		
		lblPrecio = new JLabel("PRECIO: ");
		lblPrecio.setBounds(29, 108, 56, 25);
		contentPanel.add(lblPrecio);
		
		TXTPRECIO = new JTextField();
		TXTPRECIO.setBounds(95, 109, 86, 20);
		contentPanel.add(TXTPRECIO);
		TXTPRECIO.setEditable(false);
		TXTPRECIO.setColumns(10);
		
		modelo=new DefaultTableModel();
		modelo.addColumn("NUMERO");
	    modelo.addColumn("CATEGORIA");
	    modelo.addColumn("PRECIO");
	    modelo.addColumn("ESTADO");
	    
	    tblBungalow.setModel(modelo);
	    
	    txtNumeroBungalow.setEditable(false);
	    
	    btnAdicionar = new JButton("ADICIONAR");
	    btnAdicionar.addMouseListener(this);
	    btnAdicionar.addActionListener(this);
	    btnAdicionar.setBounds(231, 45, 99, 35);
	    contentPanel.add(btnAdicionar);
	    
	    habilitarEntradas(false);
	    ajustarAnchocolumnas();
	    listar();
	    editarFila();
	}
	ArregloBungalow ab= new ArregloBungalow();
	private JButton btnAdicionar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnConsultar;
	private JButton btnNewButton;
	private JButton btnAceptar;

	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == tblBungalow) {
			mouseClickedTblBungalow(arg0);
		}
		if (arg0.getSource() == lblX) {
			mouseClickedLblX(arg0);
		}
	}
	public void mouseEntered(MouseEvent arg0) {
		if (arg0.getSource() == btnModificar) {
			mouseEnteredBtnModificar(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			mouseEnteredBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnAceptar) {
			mouseEnteredBtnAceptar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			mouseEnteredBtnAdicionar(arg0);
		}
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void mouseClickedLblX(MouseEvent arg0) {
		dispose();
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == CBOCATEGORIA) {
			actionPerformedCBOCATEGORIA(arg0);
		}
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);
		}
		if (arg0.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(arg0);
		}
		if (arg0.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			actionPerformedBtnModificar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
	}
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) 
	{ btnAdicionar.setEnabled(false);
	btnModificar.setEnabled(true);
	btnAceptar.setEnabled(true);
	limpieza();
	habilitarEntradas(true);
	}
	protected void actionPerformedBtnModificar(ActionEvent arg0) 
	{ btnAdicionar.setEnabled(true);
	btnModificar.setEnabled(false);
	if(ab.tamaño()== 0) 
	{
		btnAceptar.setEnabled(false);
		habilitarEntradas(false);
		mensaje("No existen Bungalows");
	}
	else {
		editarFila();
		int numeroBungalow = leerNumeroBungalow();
		Bungalow x = ab.buscar(numeroBungalow);
		if(x.getEstado() == 0) {
			btnAceptar.setEnabled(true);
			habilitarEntradas(true);
		}
		else {
			btnModificar.setEnabled(true);
			mensaje ("No se puede modificar el numero de Bungalow" + numeroBungalow + "porque esta ocupado");
		}  
	}
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) 
	{ btnAdicionar.setEnabled(true);
	btnModificar.setEnabled(true);
	btnAceptar.setEnabled(false);
	if(ab.tamaño()== 0)
		mensaje("No existen bungalows");
	else {
		int numeroBungalow= leerNumeroBungalow();
	Bungalow x =ab.buscar(numeroBungalow);
	if (x.getEstado()==0) {
		int ok = confirmar("¿Desea Eliminar este registro?");
		if (ok==0) {
			ab.eliminar(ab.buscar(leerNumeroBungalow()));
			ab.grabarBungalow();
			listar();
			editarFila();
		}
	}
	else 
		mensaje("No se puede eliminar el numero de Bungalow" + numeroBungalow+ "porque esta ocupado");
	}
	}
	
	
	protected void actionPerformedBtnConsultar(ActionEvent arg0) {
	}
	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
	}
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		int numeroBungalow = leerNumeroBungalow();
		int categoria = leerPosCategoria();
		double precioDia = leerPrecioDia();
		int estado = leerPosEstado();
		if ( btnAdicionar.isEnabled()== false) {
			Bungalow nuevo = new Bungalow(numeroBungalow,categoria,estado,precioDia);
			ab.adicionar(nuevo);
			ab.grabarBungalow();
			btnAdicionar.setEnabled(true);
			}
		if(btnModificar.isEnabled()==false) {
			Bungalow x = ab.buscar(numeroBungalow);
			x.setCategoria(categoria);
			x.setPrecioDia(precioDia);
			x.setEstado(estado);
			ab.grabarBungalow();
			btnModificar.setEnabled(true);
		}
		listar();
		habilitarEntradas(false);
	}
	
	protected void actionPerformedCBOCATEGORIA(ActionEvent arg0) {
		TXTPRECIO.setText(""+ establecerPrecio());
	}
	
	
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getSource() == tblBungalow) {
			keyPressedTblBungalow(arg0);
		}
	}
	public void keyReleased(KeyEvent arg0) {
		arg0.consume();
		editarFila();
	}
	public void keyTyped(KeyEvent arg0) {
	}
	protected void keyPressedTblBungalow(KeyEvent arg0) {
	}
	protected void mouseClickedTblBungalow(MouseEvent arg0) {
		habilitarEntradas(false);
		habilitarBotones(true);
		editarFila();
	}
	
	protected void mouseEnteredBtnAdicionar(MouseEvent arg0) {
		btnAdicionar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	protected void mouseEnteredBtnAceptar(MouseEvent arg0) {
		btnAceptar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	protected void mouseEnteredBtnEliminar(MouseEvent arg0) {
		btnEliminar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	protected void mouseEnteredBtnModificar(MouseEvent arg0) {
		btnModificar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	void ajustarAnchocolumnas() {
		TableColumnModel tcm = tblBungalow.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(anchoColumna(25));
		tcm.getColumn(1).setPreferredWidth(anchoColumna(25));
		tcm.getColumn(2).setPreferredWidth(anchoColumna(25));
		tcm.getColumn(3).setPreferredWidth(anchoColumna(25));
	}
	void listar() {
	int posFila = 0;
	if (modelo.getRowCount() > 0)
		posFila = tblBungalow.getSelectedRow();
	if(modelo.getRowCount()== ab.tamaño()-1)
		posFila =ab.tamaño()-1;
	if(posFila == ab.tamaño())
		posFila --;
	modelo.setRowCount(0);
	Bungalow x;
	for (int i=0; i<ab.tamaño();i++) {
		x=ab.Obtener(i);
		Object[] fila = { x.getNumeroBungalow(),
				enTextoCategoria(x.getCategoria()),
				x.getPrecioDia(),
				enTextoEstado(x.getEstado())};
		modelo.addRow(fila);
	}
	if(ab.tamaño()>0)
		tblBungalow.getSelectionModel().setSelectionInterval(posFila, posFila);
	}
	void editarFila() {
		if(ab.tamaño()== 0)
			limpieza();
		else {
			Bungalow x = ab.Obtener(tblBungalow.getSelectedRow());
			txtNumeroBungalow.setText("" + x.getNumeroBungalow());
			CBOCATEGORIA.setSelectedIndex(x.getCategoria());
			TXTPRECIO.setText(""+x.getPrecioDia());
			CBOESTADO.setSelectedIndex(x.getEstado());
		}
	}
	void limpieza() {
		txtNumeroBungalow.setText(""+ab.numeroCorrelativo());
		CBOCATEGORIA.setSelectedIndex(0);
		CBOESTADO.setSelectedIndex(0);
	}
    void mensaje (String S) {
    	JOptionPane.showMessageDialog(this, S, "Informaciòn", 0);
    }
    void error (String s,JTextField txt) {
    	mensaje(s);
    	txt.setText("");
    	txt.requestFocus();
    }
    void habilitarEntradas(boolean sino) {
    	btnAceptar.setEnabled(sino);
    	CBOCATEGORIA.setEnabled(sino);
    }
    void habilitarBotones(boolean sino) {
    	btnAdicionar.setEnabled(sino);
    	btnModificar.setEnabled(sino);
    }
    int leerNumeroBungalow() {
    	return Integer.parseInt(txtNumeroBungalow.getText().trim());
    }
    int leerPosCategoria() {
    	return CBOCATEGORIA.getSelectedIndex();
    }
    double leerPrecioDia() {
    	return Double.parseDouble(TXTPRECIO.getText().trim());
    }
    int leerPosEstado() {
    	return CBOESTADO.getSelectedIndex();
    }
    double establecerPrecio() {
    	switch(leerPosCategoria()) {
    	case 0:
    		return 100.0;
    	case 1:
    		return 200.0;
    	default:
    		return 500.0;
    	}
    }
    int anchoColumna(int porcentaje) {
    	return porcentaje * scrollPane.getWidth()/100;
    }
    int confirmar(String s) {
    	return JOptionPane.showConfirmDialog(this,s , "Alerta", 0, 1, null);
    }
    String enTextoCategoria(int i) {
    	return (String) CBOCATEGORIA.getItemAt(i);
    }
    String enTextoEstado(int i) {
    	return (String) CBOESTADO.getItemAt(i);
    }
}
// Julio