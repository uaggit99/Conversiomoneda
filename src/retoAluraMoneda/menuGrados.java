package retoAluraMoneda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;

public class menuGrados extends JFrame implements ActionListener {

	private JPanel contentPane;
	JComboBox comboBox;
	JButton btnAceptar;
	int indice;

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
	public menuGrados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setTitle("opciones de Grados");
		setType(Type.UTILITY);
		setResizable(false);
		
		iniciarComponentes();

	}

	private void iniciarComponentes() {
		setBounds(100, 100, 478, 248);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(7, 7, 7, 7));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ingrese el valor en grados a convertir");
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 15));
		lblNewLabel.setBounds(48, 24, 328, 33);
		contentPane.add(lblNewLabel);

		comboBox = new JComboBox();
		comboBox.setFont(new Font("SimSun", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Grados Celsius    a  Grados Fahrenheit", "Grados Celsius    a  Grados Kevin", "Grados Kevin      a  Grados Fahrenheit", "Grados Kevin      a  Grados Celsius", "Grados Fahrenheit a  Grados Celsius", "Grados Fahrenheit a  Grados Kevin"}));
		comboBox.setBounds(48, 87, 387, 33);
		comboBox.addActionListener(this);
		contentPane.add(comboBox);

		btnAceptar = new JButton("Salir");
		btnAceptar.setFont(new Font("SimSun", Font.PLAIN, 15));
		btnAceptar.setBounds(193, 149, 101, 33);
		btnAceptar.addActionListener(this);
		contentPane.add(btnAceptar);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (comboBox == e.getSource()) {
			indice = comboBox.getSelectedIndex();
			Temperatura temperatura = new Temperatura();
			ingresoGrados ingresogrados = new ingresoGrados();
			menuGrados menugrados = new menuGrados();
			double valorConvertido = temperatura.conversionGrados(indice, ingresogrados.valorIngreso);
			DecimalFormat df = new DecimalFormat("###.###");
			switch(indice) {
			case 0:
				JOptionPane.showMessageDialog(null, ingresogrados.valorIngreso +" Grados " + temperatura.getNombreGrados()[0]+
						" equivalen a "+ df.format(valorConvertido)+ " Grados "+ temperatura.getNombreGrados()[2]);
				break;
			case 1:
				JOptionPane.showMessageDialog(null, ingresogrados.valorIngreso +" Grados " + temperatura.getNombreGrados()[0]+
						" equivalen a "+ df.format(valorConvertido)+ " Grados "+ temperatura.getNombreGrados()[1]);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, ingresogrados.valorIngreso +" Grados " + temperatura.getNombreGrados()[1]+
						" equivalen a "+ df.format(valorConvertido)+ " Grados "+ temperatura.getNombreGrados()[2]);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, ingresogrados.valorIngreso +" Grados " + temperatura.getNombreGrados()[1]+
						" equivalen a "+ df.format(valorConvertido)+ " Grados "+ temperatura.getNombreGrados()[0]);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, ingresogrados.valorIngreso +" Grados " + temperatura.getNombreGrados()[2]+
						" equivalen a "+ df.format(valorConvertido)+ " Grados "+ temperatura.getNombreGrados()[0]);
				break;
			case 5:
				JOptionPane.showMessageDialog(null, ingresogrados.valorIngreso +" Grados " + temperatura.getNombreGrados()[2]+
						" equivalen a "+ df.format(valorConvertido)+ " Grados "+ temperatura.getNombreGrados()[1]);
				break;
				
				
			default:
				System.out.println("indice desconocido");
			}
			

		} else {
			if (btnAceptar == e.getSource()) {
				menuGrados menugrado = new menuGrados();
				menugrado.setVisible(false);
				dispose();
				Menu menu = new Menu();
				menu.setVisible(true);

			}
		}

	}
}
