package retoAluraMoneda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.SwingConstants;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Window.Type;

public class ingresoMoneda extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textvalorMoneda;
	public static double valorIngresado;
	JButton btnNewButtonOK, btnCancelar;
	 
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ingresoMoneda frame = new ingresoMoneda();
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

	public ingresoMoneda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ingreso valor");
		setType(Type.UTILITY);
		setResizable(false);
		
		
		iniciarComponentes();	
		
	}

	

	private void iniciarComponentes() {
		setBounds(100, 100, 475, 223);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JLabel lblNewLabel = new JLabel("Ingrese la cantidad de dinero que desea convertir");
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 15));
		lblNewLabel.setBounds(56, 26, 407, 25);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("?");
		lblNewLabel_1.setLabelFor(contentPane);
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setBackground(new Color(176, 224, 230));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("MS UI Gothic", Font.BOLD, 32));
		lblNewLabel_1.setBounds(10, 21, 46, 40);
		contentPane.add(lblNewLabel_1);

		btnNewButtonOK = new JButton("Aceptar");
		btnNewButtonOK.setBackground(new Color(230, 230, 250));
		btnNewButtonOK.setFont(new Font("SimSun", Font.PLAIN, 18));
		btnNewButtonOK.setBounds(113, 129, 128, 33);
		btnNewButtonOK.addActionListener(this);
		contentPane.add(btnNewButtonOK);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("SimSun", Font.PLAIN, 18));
		btnCancelar.setBackground(new Color(230, 230, 250));
		btnCancelar.setBounds(269, 130, 128, 33);
		btnCancelar.addActionListener(this);
		contentPane.add(btnCancelar);
		
		
		textvalorMoneda = new JTextField();
		textvalorMoneda.setFont(new Font("SimSun", Font.PLAIN, 15));
		textvalorMoneda.setBounds(56, 74, 393, 33);
		textvalorMoneda.addActionListener(this);
		validarM(textvalorMoneda);
		contentPane.add(textvalorMoneda);
		textvalorMoneda.setColumns(10);
		
		
	}

	private void validarM(JTextField a) {
		a.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!Character.isDigit(c) && c != '.') {
					e.consume();
				}
				if (c == '.' && textvalorMoneda.getText().contains(".")) {
					e.consume();
				}

			}
		});
	}
		

	@Override
	public void actionPerformed(ActionEvent s) {
		

		if (btnNewButtonOK == s.getSource()) {
			valorIngresado = Double.parseDouble(textvalorMoneda.getText());
			// JOptionPane.showMessageDialog(null, textvalorMoneda);
			// JOptionPane.showMessageDialog(null, ValorIngresado);
			ingresoMoneda ingresomoneda = new ingresoMoneda();
			ingresomoneda.setVisible(false);
			dispose();
			menuMoneda opcionesconversion = new menuMoneda();
			opcionesconversion.setVisible(true);

		} else {
			if (btnCancelar == s.getSource()) {
				JOptionPane.showMessageDialog(null, "¡¡ Valor cancelado  ¡¡");
				textvalorMoneda.setText("");

			}
		}

	}


	
}
