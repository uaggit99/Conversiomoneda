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
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Window.Type;

public class ingresoGrados extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textFieldGrados;
	JButton btnOK, btnCancelar;
	public static double valorIngreso;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuGrados frame = new menuGrados();
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
	public ingresoGrados() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniciarconponentes();

	}

	private void iniciarconponentes() {
		setBounds(100, 100, 475, 226);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ingrese el valor de  los grados a convertir");
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 15));
		lblNewLabel.setBounds(76, 11, 373, 44);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font("SimSun", Font.BOLD, 32));
		lblNewLabel_1.setBounds(20, 11, 46, 44);
		contentPane.add(lblNewLabel_1);

		textFieldGrados = new JTextField();
		textFieldGrados.setBounds(76, 66, 331, 34);
		textFieldGrados.addActionListener(this);
		validar(textFieldGrados);
		contentPane.add(textFieldGrados);
		textFieldGrados.setColumns(10);

		btnOK = new JButton("Aceptar");
		btnOK.setFont(new Font("SimSun", Font.PLAIN, 15));
		btnOK.setBounds(117, 129, 100, 34);
		btnOK.addActionListener(this);
		contentPane.add(btnOK);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("SimSun", Font.PLAIN, 15));
		btnCancelar.setBounds(264, 129, 100, 34);
		btnCancelar.addActionListener(this);
		contentPane.add(btnCancelar);

	}

	private void validar(JTextField a) {
		a.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!Character.isDigit(c) && c != '.') {
					e.consume();
				}
				if (c == '.' && textFieldGrados.getText().contains(".")) {
					e.consume();
				}

			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnOK == e.getSource()) {
			valorIngreso = Double.parseDouble(textFieldGrados.getText());
			// JOptionPane.showMessageDialog(null, textvalorMoneda);
			// JOptionPane.showMessageDialog(null, ValorIngresado);
			ingresoGrados ingresoGrado = new ingresoGrados();
			ingresoGrado.setVisible(false);
			dispose();
			menuGrados opcionesconversion = new menuGrados();
			opcionesconversion.setVisible(true);
		} else {
			if (btnCancelar == e.getSource()) {
				JOptionPane.showMessageDialog(null, "¡¡ Valor cancelado  ¡¡");
				textFieldGrados.setText("");

			}
		}

	}
}
