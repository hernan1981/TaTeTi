package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;

public class FrmJuego extends JFrame {

	private JPanel contentPane;
	private PnlRegistro registro;
	private PnlTablero tablero;

	/**
	 * Create the frame.
	 */
	public FrmJuego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		registro=new PnlRegistro();
		contentPane.add(registro);
		
		tablero = new PnlTablero();
		contentPane.add(tablero);
		tablero.setVisible(false);
	}

	public PnlRegistro getRegistro() {
		return registro;
	}

	public void setRegistro(PnlRegistro registro) {
		this.registro = registro;
	}

	public PnlTablero getTablero() {
		return tablero;
	}

	public void setTablero(PnlTablero tablero) {
		this.tablero = tablero;
	}
}
