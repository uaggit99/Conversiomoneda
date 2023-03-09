package retoAluraMoneda;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Window.Type;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.SystemColor;

public class Menu extends JFrame implements ActionListener {
	private JPanel prinsipal;
	JComboBox comboMenu;
	JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setAlwaysOnTop(true);
		setType(Type.UTILITY);
		setTitle("Menu prinsipal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBackground(new Color(214, 206, 251));
		setBounds(100, 100, 402, 333);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("M E N U");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(27, 28, 323, 33);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Seleccione  la opcion de  Conversion");
		lblNewLabel_1.setFont(new Font("SimSun", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(27, 103, 323, 23);
		getContentPane().add(lblNewLabel_1);

		comboMenu = new JComboBox();

		comboMenu.setFont(new Font("SimSun", Font.PLAIN, 15));
		comboMenu
				.setModel(new DefaultComboBoxModel(new String[] { "Conversor de Moneda", "Conversor de Temperatura" }));
		comboMenu.setBounds(27, 148, 294, 22);
		comboMenu.addActionListener(this);
		getContentPane().add(comboMenu);

		btnSalir = new JButton("S a l i r ");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);
			}
		});
		btnSalir.setBackground(SystemColor.activeCaption);
		btnSalir.setFont(new Font("SimSun-ExtB", Font.PLAIN, 20));
		btnSalir.setBounds(102, 234, 156, 33);
		getContentPane().add(btnSalir);
		setFocusTraversalPolicy(
				new FocusTraversalOnArray(new Component[] { getContentPane(), lblNewLabel, lblNewLabel_1, comboMenu }));

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (comboMenu == e.getSource()) {
			if (comboMenu.getSelectedIndex() == 0) {
				// JOptionPane.showMessageDialog(null,"primera opcion");
				Menu menu = new Menu();
				menu.setVisible(false);
				dispose();
				ingresoMoneda menuMoneda = new ingresoMoneda();
				menuMoneda.setVisible(true);
			} else {
				if (comboMenu.getSelectedIndex() == 1) {
					// JOptionPane.showMessageDialog(null,"segunda opcion opcion");
					Menu menu = new Menu();
					menu.setVisible(false);
					dispose();
					ingresoGrados ingresogrado = new ingresoGrados();
					ingresogrado.setVisible(true);

				}

			}

		}

	}
}
