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
import java.text.DecimalFormat;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Window.Type;

public class menuMoneda extends JFrame implements ActionListener {

	private JPanel contentPane;
	JComboBox comboBoxMoneda;
	JButton btnSalirMoneda;
	int indiceSeleccion;

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
	public menuMoneda() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Opciones de conversion");
		setType(Type.UTILITY);
		// setVisible(true);
		setResizable(false);

		iniciarComponentes();

	}

	private void iniciarComponentes() {
		setBounds(100, 100, 450, 214);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Seleccione el tipo de moneda a convertir");
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 15));
		lblNewLabel.setBounds(43, 11, 367, 36);
		contentPane.add(lblNewLabel);

		comboBoxMoneda = new JComboBox();
		comboBoxMoneda.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		comboBoxMoneda.setModel(new DefaultComboBoxModel(new String[] { "Pesos a Dolares", "Pesos a Euros",
				"Pesos a Libras Esterlinas", "Pesos a Yen japones", "Pesos a won sul-coreano", "Dolares a Pesos",
				"Euros a Pesos", "Libras Esterlinas a Pesos", "Yen Japones a Pesos", "Won sul-coreano a Pesos" }));
		comboBoxMoneda.setBounds(43, 58, 341, 30);
		comboBoxMoneda.addActionListener(this);
		contentPane.add(comboBoxMoneda);

		btnSalirMoneda = new JButton("Salir");
		btnSalirMoneda.setForeground(Color.DARK_GRAY);
		btnSalirMoneda.setBackground(new Color(230, 230, 250));
		btnSalirMoneda.setFont(new Font("SimSun", Font.BOLD, 15));
		btnSalirMoneda.setBounds(166, 119, 93, 30);
		btnSalirMoneda.addActionListener(this);
		contentPane.add(btnSalirMoneda);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (comboBoxMoneda == e.getSource()) {
			indiceSeleccion = comboBoxMoneda.getSelectedIndex();
			Moneda moneda = new Moneda();
			Moneda valor =new Moneda();
			ingresoMoneda ingreso = new ingresoMoneda();
			menuMoneda menumoneda = new menuMoneda();
			double valorConvertido = moneda.conversion(indiceSeleccion, ingreso.valorIngresado);
			DecimalFormat fd = new DecimalFormat("###.###");
			switch (indiceSeleccion) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				JOptionPane.showMessageDialog(null, ingreso.valorIngresado + " Pesos Colombianos equivalen a  "
						+ fd.format(valorConvertido) + "  " + moneda.getNombreMoneda()[indiceSeleccion]);

				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				JOptionPane.showMessageDialog(null, ingreso.valorIngresado+ " "+moneda.getNombreMoneda()[indiceSeleccion-5]+" Equivalen a "+
			fd.format(valorConvertido) + "  Pesos colombianos");

				break;
			default:
				System.out.println("indice desconocido");

			}
		}

		if (btnSalirMoneda == e.getSource()) {
			menuMoneda menumoneda = new menuMoneda();
			menumoneda.setVisible(false);
			dispose();
			Menu menu = new Menu();
			menu.setVisible(true);

		}

	}
}
