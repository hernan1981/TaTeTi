package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class PnlTablero extends JPanel {
	
	private JLabel lblNombreJ1;
	private JLabel lblNombreJ2;
	
	private JButton btnPos1;
	private JButton btnPos2;
	private JButton btnPos3;
	private JButton btnPos4;
	private JButton btnPos5;
	private JButton btnPos6;
	private JButton btnPos7;
	private JButton btnPos8;
	private JButton btnPos9;
	private JButton btnReiniciar;

	/**
	 * Create the panel.
	 */
	public PnlTablero() {
		setBackground(Color.CYAN);
		setBounds(0, 0, 740, 500);
		setLayout(null);
		
		lblNombreJ1 = new JLabel("Jugador 1");
		lblNombreJ1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNombreJ1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreJ1.setBounds(50, 13, 240, 40);
		add(lblNombreJ1);
		
		lblNombreJ2 = new JLabel("Jugador 2");
		lblNombreJ2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNombreJ2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreJ2.setBounds(470, 13, 240, 40);
		add(lblNombreJ2);
		
		JLabel lblNewLabel_1 = new JLabel("vs");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBounds(349, 16, 56, 35);
		add(lblNewLabel_1);
		
		btnPos1 = new JButton("");
		btnPos1.setForeground(Color.RED);
		btnPos1.setSelectedIcon(null);
		btnPos1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnPos1.setBackground(Color.WHITE);
		btnPos1.setBounds(50, 89, 205, 104);
		add(btnPos1);
		
		btnPos2 = new JButton("");
		btnPos2.setForeground(Color.RED);
		btnPos2.setSelectedIcon(null);
		btnPos2.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnPos2.setBackground(Color.WHITE);
		btnPos2.setBounds(267, 89, 205, 104);
		add(btnPos2);
		
		btnPos3 = new JButton("");
		btnPos3.setForeground(Color.RED);
		btnPos3.setSelectedIcon(null);
		btnPos3.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnPos3.setBackground(Color.WHITE);
		btnPos3.setBounds(484, 89, 205, 104);
		add(btnPos3);
		
		btnPos4 = new JButton("");
		btnPos4.setForeground(Color.RED);
		btnPos4.setSelectedIcon(null);
		btnPos4.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnPos4.setBackground(Color.WHITE);
		btnPos4.setBounds(50, 200, 205, 104);
		add(btnPos4);
		
		btnPos5 = new JButton("");
		btnPos5.setForeground(Color.RED);
		btnPos5.setSelectedIcon(null);
		btnPos5.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnPos5.setBackground(Color.WHITE);
		btnPos5.setBounds(267, 200, 205, 104);
		add(btnPos5);
		
		btnPos6 = new JButton("");
		btnPos6.setForeground(Color.RED);
		btnPos6.setSelectedIcon(null);
		btnPos6.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnPos6.setBackground(Color.WHITE);
		btnPos6.setBounds(484, 200, 205, 104);
		add(btnPos6);
		
		btnPos7 = new JButton("");
		btnPos7.setSelectedIcon(null);
		btnPos7.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnPos7.setForeground(Color.RED);
		btnPos7.setBackground(Color.WHITE);
		btnPos7.setBounds(50, 314, 205, 104);
		add(btnPos7);
		
		btnPos8 = new JButton("");
		btnPos8.setForeground(Color.RED);
		btnPos8.setSelectedIcon(null);
		btnPos8.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnPos8.setBackground(Color.WHITE);
		btnPos8.setBounds(267, 314, 205, 104);
		add(btnPos8);

		btnPos9 = new JButton("");
		btnPos9.setForeground(Color.RED);
		btnPos9.setSelectedIcon(null);
		btnPos9.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnPos9.setBackground(Color.WHITE);
		btnPos9.setBounds(484, 314, 205, 104);
		add(btnPos9);
		
		btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setForeground(Color.DARK_GRAY);
		btnReiniciar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReiniciar.setBounds(592, 451, 97, 35);
		add(btnReiniciar);
		
	}

	public JLabel getLblNombreJ1() {
		return lblNombreJ1;
	}

	public void setLblNombreJ1(JLabel lblNombreJ1) {
		this.lblNombreJ1 = lblNombreJ1;
	}

	public JLabel getLblNombreJ2() {
		return lblNombreJ2;
	}

	public void setLblNombreJ2(JLabel lblNombreJ2) {
		this.lblNombreJ2 = lblNombreJ2;
	}

	public JButton getBtnPos1() {
		return btnPos1;
	}

	public void setBtnPos1(JButton btnPos1) {
		this.btnPos1 = btnPos1;
	}

	public JButton getBtnPos2() {
		return btnPos2;
	}

	public void setBtnPos2(JButton btnPos2) {
		this.btnPos2 = btnPos2;
	}

	public JButton getBtnPos3() {
		return btnPos3;
	}

	public void setBtnPos3(JButton btnPos3) {
		this.btnPos3 = btnPos3;
	}

	public JButton getBtnPos4() {
		return btnPos4;
	}

	public void setBtnPos4(JButton btnPos4) {
		this.btnPos4 = btnPos4;
	}

	public JButton getBtnPos5() {
		return btnPos5;
	}

	public void setBtnPos5(JButton btnPos5) {
		this.btnPos5 = btnPos5;
	}

	public JButton getBtnPos6() {
		return btnPos6;
	}

	public void setBtnPos6(JButton btnPos6) {
		this.btnPos6 = btnPos6;
	}

	public JButton getBtnPos7() {
		return btnPos7;
	}

	public void setBtnPos7(JButton btnPos7) {
		this.btnPos7 = btnPos7;
	}

	public JButton getBtnPos8() {
		return btnPos8;
	}

	public void setBtnPos8(JButton btnPos8) {
		this.btnPos8 = btnPos8;
	}

	public JButton getBtnPos9() {
		return btnPos9;
	}

	public void setBtnPos9(JButton btnPos9) {
		this.btnPos9 = btnPos9;
	}

	public JButton getBtnReiniciar() {
		return btnReiniciar;
	}

	public void setBtnReiniciar(JButton btnReiniciar) {
		this.btnReiniciar = btnReiniciar;
	}
	
}
